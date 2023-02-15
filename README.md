Mars Rover Kata
===============

Description
-----------

Develop an API that moves a rover around on a grid.

* You are given the rover's initial starting point (x,y) and the direction (N,S, E,W) it is facing.
* The rover receives a character array of commands.
* Implement commands that move the rover forward(M).
* Implement commands that turn the rover left/right (L, R).

Assumptions
-----------
* The co-ordinates have (0,0) as reference to move rover
for example if grid size is (3, 3) the max distance along x-axis is 3
* Rover Instructions are casesensitive i.e., only accepts L, R and M
* The rover direction is case sensitive i.e, would work for both n and N for North
* The grid dimensions and initial co-ordinates instructions are space seperated instructions
* The grid dimensions are two dimensional
* Initial co-ordinates are provided with rover facing directions
* All the inputs are strings and space seperated

Running
-------

To run all tests:

```bash
mvn test
```

Currently only the run through test cases
TBD - userInput
