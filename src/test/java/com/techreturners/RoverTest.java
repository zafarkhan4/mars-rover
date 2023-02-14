package com.techreturners;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RoverTest {
  
  @Test
  public void checkSetRovingRange() {
    Rover rover = new Rover();
    int[] expectedRovingRange = {5, 5};
    rover.setRovingRange("5 5");
    assertArrayEquals(expectedRovingRange, rover.getRovingRange());
  }

  @Test
  public void checkSetRoverCoordinates() {
    Rover rover = new Rover();
    String strCoordinates = "1 1 N";
    rover.setCoordinates(strCoordinates);
    
    assertEquals(strCoordinates, rover.getCoordinates());
  }

  @Test
  public void checkMoveRoverForLeftRotation() {
    Rover rover = new Rover();
    rover.setRovingRange("5 5");
    rover.setCoordinates("1 1 N");
    String roverInstructions = "L";

    String expectedCoordinates = "1 1 W";

    assertEquals(expectedCoordinates, rover.moveRover(roverInstructions));
  }

  @Test
  public void checkMoveRoverForLeftRotationFacingSouth() {
    Rover rover = new Rover();
    rover.setRovingRange("5 5");
    rover.setCoordinates("1 1 S");
    String roverInstructions = "L";

    String expectedCoordinates = "1 1 E";

    assertEquals(expectedCoordinates, rover.moveRover(roverInstructions));
  }

  @Test
  public void checkMoveRoverForRightRotation() {
    Rover rover = new Rover();
    rover.setRovingRange("5 5");
    rover.setCoordinates("1 1 N");
    String roverInstructions = "R";

    String expectedCoordinates = "1 1 E";

    assertEquals(expectedCoordinates, rover.moveRover(roverInstructions));
  }

  @Test
  public void checkMoveRoverForRightRotationFacingEast() {
    Rover rover = new Rover();
    rover.setRovingRange("5 5");
    rover.setCoordinates("1 1 E");
    String roverInstructions = "R";

    String expectedCoordinates = "1 1 S";

    assertEquals(expectedCoordinates, rover.moveRover(roverInstructions));
  }

  // @Test
  // public void checkMoveRoverForForwardMovementFacingEast() {
  //   Rover rover = new Rover();
  //   rover.setRovingRange("5 5");
  //   rover.setCoordinates("1 1 E");
  //   String roverInstructions = "M";

  //   String expectedCoordinates = "1 1 S";

  //   assertEquals(expectedCoordinates, rover.moveRover(roverInstructions));
  // }


}
