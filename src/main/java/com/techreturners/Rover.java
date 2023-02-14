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
    
    if (roverInstructions.equalsIgnoreCase("M")) {
      coordinates.moveForward(roverInstructions);
    }
    
    coordinates.rotate(roverInstructions);

    return coordinates.toString();
  }
  
}
