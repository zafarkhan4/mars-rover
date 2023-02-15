package com.techreturners;

public class Rover {

  private int[] rovingRange = new int[2];
  private RoverCoordinates coordinates;

  public void setRovingRange(String string) {
    String[] roverRange = string.split(" ");
    
    for(int i=0; i<roverRange.length; i++) {
      rovingRange[i] = Integer.parseInt(roverRange[i]);
    }

  }

  public int[] getRovingRange() {
    return rovingRange;
  }

  public void setCoordinates(String strCoordinates) {
    coordinates = new RoverCoordinates(strCoordinates);
  }

  public String getCoordinates() {
    return this.coordinates.toString();
  }

  public String moveRover(String roverInstructions) {

    char [] instructions = roverInstructions.toCharArray();

    for(char instruction: instructions) {

      if (Character.compare(instruction, 'M') == 0) {
        coordinates.moveForward(roverInstructions);
      } else {
        coordinates.rotate(roverInstructions);
      }
    }

    return getCoordinates();
  }
  
}
