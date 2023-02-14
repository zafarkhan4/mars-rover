package com.techreturners;

public enum Direction {
  EAST("E", 0),
  WEST("W", 180),
  NORTH("N", 90),
  SOUTH("S", 270);


  private int orientation;
  private String direction;

  private Direction(String direction, int orientation) {
    this.direction = direction;
    this.orientation = orientation;
  }

  public static Direction getDirection(String roverDirection) {
    for(Direction direction: Direction.values()) {
      if (roverDirection.equalsIgnoreCase(direction.getDirection())) {
        return direction;
      }
    }
    return null;
  }

  public int getOrientation() {
    return orientation;
  }

  public String getDirection() {
    return direction;
  }

  public static Direction getDirection(int updatedOrientation) {

    if(updatedOrientation == 360) return Direction.EAST;

    if(updatedOrientation == -90) return Direction.SOUTH;

    for(Direction direction: Direction.values()) {
      if (updatedOrientation == direction.getOrientation()) {
        return direction;
      }
    }
    return null;
  }
  
}
