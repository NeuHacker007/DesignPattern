Definition
    
    -> prototype instance will specify which type of object to be created
    -> Don't need to know any details about how to create
    -> Don't call constructor method

Scenario

    1. The initalization of a class cost a lot of resources
    2. new an object need very complicated process (data preparation, access list)
    3. constructor is complicate
    4. In the loop we need create a lot of objects
    
 Pros

    1. prototype pattern's performance is higher than the directly new an object
    2. simplify the object creation process
    
 cons
    
     1. Must have the Clone method
     2. Easy to introduce risk while clone a complex object or modify the cloned complex object
     3. Deep copy, Shallow Copy must be used properly
     
  Key Point
   
      Deep Copy
      
      Shallow Copy 