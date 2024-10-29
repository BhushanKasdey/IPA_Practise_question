## Problem Statement

Create a class Projector with below attributes:

    projectorId - int
    projectorName - String
    price - int (per unit)
    rating - int
    availableIn - String (Amazon, Flipkart, TataCliq)

The above attributes should be private. Write getters, setters and parameterized constructor as required.

Create class Myclass with main method.

Implement one static method- findMaximumPriceByRating in solution class.

findMaximumPriceByRating: The method will return the maximum priced Projector object from array of Projector objects which ever has rating greater than the given rating and which is available in TataCliq.
If no Projector with the above conditions is present in the array of Projector objects, then the method should return null. 

Note : No two Projector will have the same price.
All the searches should be case insensitive.

The above mentioned static method should be called from the main method.

For findMaximumPriceByRating method - The main method should print the projectorid from returned object if the returned value is not null else it should print "No such Projector".

Eg: 1001
where 1001 is the projectorId which has the maximum price.

Before calling these static methods in main, use Scanner objects to read the values of four Projector objects referring attributes in the above mentioned attribute sequence.

Next, read the value of one int parameter for capturing rating value.

##Input:-

    1001
    Epson
    30000
    5
    TataCliq
    1002
    BenQ
    40000
    4
    Amazon
    1003
    Sony
    80000
    5
    TataCliq
    1004
    Optomo
    7000
    3
    Flipkart
    3

##Output:-

    1003

