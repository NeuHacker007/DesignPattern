Definition
    -> gurantee one class only has one instance, and provide a global access point 

Scenario
    -> anywhere need to gurantee only one instance of this class can be created
        -- Website visit count 
        -- Windows Task manager
        -- thread pool
Pro:
    1. Reduce the cost of memory. 
        -> if object creation is a heavy operation and also it needs create/destroy for many times
            Thread Pool

    2. Avoid multi-instance to write to the same file 
    3. strictly control the access

cons:
    1. no interface, extend is difficulty 


Key Points
    Private constructor
        -> Forbidden the external code directly call the constructor. Any instantiation should go through the method we provide.
    Thread Safe
        -> 
    LazyLoad

    Serilization/Deserilization holes 

    reflect attack 
    