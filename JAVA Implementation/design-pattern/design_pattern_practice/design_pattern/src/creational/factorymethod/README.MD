KeyPoint 
    Define a interface used to create an object.
    The class who implements the interface to design which object to be instantiate.
    This pattern delayed the class instantiation to the child class.

Scenario
    1. A lot of repeat code is required while creating the object
    2. client level doesn't depend on how the product class created or implemented
    3. a class creates an object through its child class and the child class will decide which object needs to be created. 

Pros
    1. user only care about the factory of the product needed and do not care about the creation details
    2. Adding new product meet Open-Close principle, enhance the flexibility

Cons
    1. The number of class is easy to boom, which increased the complexity
        -> each product class has a factory class 
    2. Make the system more abstract and not easy to understand.
        


