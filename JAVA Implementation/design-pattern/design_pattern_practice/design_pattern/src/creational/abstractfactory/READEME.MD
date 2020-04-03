Definition
    -> provides an interface to create a series related or dependent objct
    -> don't need to specify their concrete class

Scenario
    -> Client don't depends on how the product instance has been created or implemented
    -> Emphsis a series of product object (belongs to a family)
    -> needs a lot of repeat code to create the object
    -> provides a product library all the product share the same Interface


Pros
    1. Don't care the creation details 
    2. put create object based on its family

cons
    1. Difficult to add new products
        -> need to modify the abstract factory interface
    2. increase the abstract and the difficulty in understanding 