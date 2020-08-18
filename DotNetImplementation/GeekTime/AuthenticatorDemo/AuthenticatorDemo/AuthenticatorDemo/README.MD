# Purpose 

This project is a demo project for implementing the Authentication function by using OOA and OOP thought. 

# Requirement 

1. 调用方进行接口请求的时候，将 URL、AppID、密码、时间戳拼接在一起，通过加密算法生成 token，并且将 token、AppID、时间戳拼接在 URL 中，一并发送到微服务端。
2. 微服务端在接收到调用方的接口请求之后，从请求中拆解出 token、AppID、时间戳。
3. 微服务端首先检查传递过来的时间戳跟当前时间，是否在 token 失效时间窗口内。如果已经超过失效时间，那就算接口调用鉴权失败，拒绝接口调用请求。
4. 如果 token 验证没有过期失效，微服务端再从自己的存储中，取出 AppID 对应的密码，通过同样的 token 生成算法，生成另外一个 token，与调用方传递过来的 token 进行匹配。
如果一致，则鉴权成功，允许接口调用；否则就拒绝接口调用。

# Requirement Break Down 

1. Concatenate URL, APP ID, Password, Time stamp as a string.
2. Generate an token based on the step 1 string through hash algorithm
3. Concatenate token, AppId, Time stamp, and token as URL 
4. Parse the url from 3 and get token, App id, and time stamp 
5. Get out the App ID and Password from storage 
6. Judge the expiration
7. Verify whether two token matching