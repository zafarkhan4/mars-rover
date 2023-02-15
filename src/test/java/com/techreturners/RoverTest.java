package com.techreturners;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class RoverTest {

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
    rover.setGrid("5 5");
    rover.setCoordinates("1 1 N");
    String roverInstructions = "L";

    String expectedCoordinates = "1 1 W";

    assertEquals(expectedCoordinates, rover.moveRover(roverInstructions));
  }

  @Test
  public void checkMoveRoverForLeftRotationFacingSouth() {
    Rover rover = new Rover();
    rover.setGrid("5 5");
    rover.setCoordinates("1 1 S");
    String roverInstructions = "L";

    String expectedCoordinates = "1 1 E";

    assertEquals(expectedCoordinates, rover.moveRover(roverInstructions));
  }

  @Test
  public void checkMoveRoverForRightRotation() {
    Rover rover = new Rover();
    rover.setGrid("5 5");
    rover.setCoordinates("1 1 N");
    String roverInstructions = "R";

    String expectedCoordinates = "1 1 E";

    assertEquals(expectedCoordinates, rover.moveRover(roverInstructions));
  }

  @Test
  public void checkMoveRoverForRightRotationFacingEast() {
    Rover rover = new Rover();
    rover.setGrid("5 5");
    rover.setCoordinates("1 1 E");
    String roverInstructions = "R";

    String expectedCoordinates = "1 1 S";

    assertEquals(expectedCoordinates, rover.moveRover(roverInstructions));
  }

  @Test
  public void checkMoveRoverForForwardMovementFacingEast() {
    Rover rover = new Rover();
    rover.setGrid("5 5");
    rover.setCoordinates("1 1 E");
    String roverInstructions = "M";

    String expectedCoordinates = "2 1 E";

    assertEquals(expectedCoordinates, rover.moveRover(roverInstructions));
  }

  @Test
  public void checkSetGridForEmptyInput() {

    Rover rover = new Rover();

    Exception exception = assertThrows(IllegalArgumentException.class, () -> rover.setGrid(" "));

    assertEquals("Empty dimensions. Please provide valid dimensions.", exception.getMessage());
  }

  @Test
  public void checkSetGridForNullInput() {

    Rover rover = new Rover();

    Exception exception = assertThrows(IllegalArgumentException.class, () -> rover.setGrid(null));

    assertEquals("Empty dimensions. Please provide valid dimensions.", exception.getMessage());
  }

  @Test
  public void checkSetGridForInvalidNumber() {

    Rover rover = new Rover();
    String input = "z 2";

    Exception exception = assertThrows(IllegalArgumentException.class, () -> rover.setGrid(input));

    assertEquals("Please provide valid integer for position.", exception.getMessage());
  }

  @Test
  public void checkSetCoordinatesForEmptyInput() {

    Rover rover = new Rover();

    Exception exception = assertThrows(IllegalArgumentException.class, () -> rover.setCoordinates(" "));

    assertEquals("Empty co-ordinates. Please provide valid coordinates.", exception.getMessage());
  }

  @Test
  public void checkSetCoordinatesForNullInput() {

    Rover rover = new Rover();

    String input = null;

    Exception exception = assertThrows(IllegalArgumentException.class, () -> rover.setCoordinates(input));

    assertEquals("Empty co-ordinates. Please provide valid coordinates.", exception.getMessage());
  }

  @Test
  public void checkSetCoordinatesForInvalidNumber() {

    Rover rover = new Rover();
    String input = "z 2 E";

    Exception exception = assertThrows(IllegalArgumentException.class, () -> rover.setCoordinates(input));

    assertEquals("Please provide valid integer for position", exception.getMessage());
  }

  @Test
  public void checkMoveRoverForInvalidInstruction() {

    Rover rover = new Rover();
    rover.setGrid("5 5");
    rover.setCoordinates("1 2 N");
    String roverInstructions = "KLMLMLMLMM";

    Exception exception = assertThrows(IllegalArgumentException.class, () -> rover.moveRover(roverInstructions));

    assertEquals("Invalid instruction. At this point I only understand \"L\", \"R\", \"M\"  ", exception.getMessage());
  }

  @Test
  public void checkMoveRoverFor() {
    Rover rover = new Rover();
    rover.setGrid("5 5");
    rover.setCoordinates("1 2 N");
    String roverInstructions = "LMLMLMLMM";

    String expectedCoordinates = "1 3 N";

    assertEquals(expectedCoordinates, rover.moveRover(roverInstructions));
  }

  @Test
  public void checkMoveRoverFor1() {
    Rover rover = new Rover();
    rover.setGrid("5 5");
    rover.setCoordinates("3 3 E");
    String roverInstructions = "MMRMMRMRRM";

    String expectedCoordinates = "5 1 E";

    assertEquals(expectedCoordinates, rover.moveRover(roverInstructions));
  }

}
