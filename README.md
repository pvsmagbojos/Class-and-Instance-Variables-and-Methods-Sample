# Static-Variables-Sample
Sample project for implementing instance and static fields and methods 

In object-oriented programming, particularly in Java, class fields are seperated into two distinct types: class variables and instance variables.

Class variables are variables that have been defined in a class of which only a single copy can exist throughout the entire lifecycle of th program, regardless of how many instances of the class exist. In short, it is independent of any instances of the class and can exist without the need of creating an instance of the class. In Java, we use the keyword `static` to signify that a variable is a class variable.

Instance variables on the other hand, creates seperate copies that are defined everytime an object is instantiated from the class. These copies are completely independent of each other and only exist throughout the lifespan of the object which it belongs to.

Methods, which are usually instance-based, can also accept the `static` keyword which allows it to be used without the need of instantiating an object from the owner class.

The sample program shows the different ways you can implement instance and class variables and methods as well as the functionalities and interactions between class and instance fields as well as static and non-static methods.
