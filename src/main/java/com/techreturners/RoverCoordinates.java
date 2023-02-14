package com.techreturners;

public class RoverCoordinates {

  private int xPosition;
  private int yPosition;
  private Direction direction;

  public RoverCoordinates(String strCoordinates) {
    String[] coordinates = strCoordinates.split(" ");
    this.xPosition = Integer.parseInt(coordinates[0]);
    this.yPosition = Integer.parseInt(coordinates[1]);
    this.direction = Direction.getDirection(coordinates[2]);
  }

  @Override
  public String toString() {
    return xPosition + " " + yPosition + " " + direction.getDirection();
  }

  public void rotate(String rotateInstruction) {
    
    int updatedOrientation = rotateInstruction.equalsIgnoreCase("L")
        ? this.direction.getOrientation() + 90
        : this.direction.getOrientation() - 90;
    
    this.direction = Direction.getDirection(updatedOrientation);
  }

  public void moveForward(String roverInstructions) {
    if(this.direction.getDirection().equalsIgnoreCase("N")) {
      this.yPosition += 1;
    } else if(this.direction.getDirection().equalsIgnoreCase("S")) {
      this.yPosition -= 1;
    } else if(this.direction.getDirection().equalsIgnoreCase("E")) {
      this.xPosition += 1;
    } else {
      this.xPosition -=1;
    }
  }

}
