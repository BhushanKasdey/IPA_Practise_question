## Problem Statement

Create a class Cricketer with below attributes:

    cricketerld - int
    matchesPlayed - int 
    totalRuns - int 
    cricketerName - String
    team - String

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

Create class Solution with main methed

Implement two static methods - findCricketerWithMinimumMatchesPlayed and searchCricketerByld in Solution class.g

findCricketerWithMinimumMatches Played in the Solution class:
This method will take array of Cricketer objects and returns the Cricketer object having the minimum Matches Played.

searchCricketerByld:
Create a static method searchCricketerByld in the Solution class.
This method will take array of Cricketer objects and Id as input and returns the Cricketer object having the mentioned Id. If the mentioned Id is not found then method should return null.

These methods should be called from the main method

Write code to perform the following tasks:

1. Take necessary input variable and call findCricketerWithMinimumMatchesPlayed. For this method - The main method should print the Cricketer ID with minimum of mentioned attribute(matchesPlayed).

2. Take necessary input variable and call searchCricketer Byld. For this method - The main method should print the Cricketer ID and Name(as shown in the sample output) if the returned value is not null. If the returned value is null then it should print "No such Cricketer".

The above mentioned static methods should be called from the main method. Also write the code for accepting the inputs and printing the outputs. Don't use any static test or formatting for printing the result. Just invoke the method and print the result

## Input:- 

    1001
    100
    7000
    Kohli
    India
    1002
    120
    4700
    Yuvi
    India
    1003
    80
    3200
    Smith
    Australia
    1004
    130
    5800
    Gayle
    Westindies
    1004

## Output:-
    1003
    80
    1004 :: Gay
