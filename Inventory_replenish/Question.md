## Problem Statement

Create class Inventory with below attributes:                                                                                                                                                                      

    inventoryId - String 
    maximumQuantity - int 
    currentQuantity - int 
    threshold - int       
                                     
Write necessary getter and setter method and also constructor.

Create class Solution and implement static method "replenish" in the Solution class.
 This method will take array of Inventory objects and a limit int as parameters. And will return another array of Inventory objects where the limit int is lesser than or equal to the original array of Inventory object's threshold attribute.

Before calling "replenish" method in the main method, read values for four Inventory objects referring the attributes in above sequence along with a int limit. Then call the "replenish" method and write logic in main method to print the InventoryId and "Critical Filling",if the threshold attribute is greater than 75. Else if the threshold attribute is between 50 and 75 then print "Moderate Filling". Else print "Non-Critical Filling"

##Input:-

    1
    100
    50
    50
    2
    200
    60
    40
    3
    150
    35
    45
    4
    80
    45
    40
    45

##Output:-

    2 Non-Critical Filling
    3 Non-Critical Filling
    4 Non-Critical Filling
