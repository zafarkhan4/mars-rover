package com.techreturners;

public class Rover {

  private Grid grid;
  private Coordinates coordinates;

  public void setRovingRange(String dimensions) {
    this.grid = new Grid(dimensions);
  }

  public Grid getRovingRange() {
    return this.grid;
  }

  public void setCoordinates(String strCoordinates) {
    coordinates = new Coordinates(strCoordinates);
  }

  public String getCoordinates() {
    return this.coordinates.toString();
  }

  public String moveRover(String roverInstructions) {

    char[] instructions = roverInstructions.toCharArray();

    for (char instruction : instructions) {

      if (Character.compare(instruction, 'M') == 0) {
        this.coordinates.getNavigation().moveForward(coordinates, grid);
      } else if (Character.compare(instruction, 'L') == 0) {
        this.coordinates.getNavigation().rotateLeft(coordinates);
      } else if (Character.compare(instruction, 'R') == 0) {
        this.coordinates.getNavigation().rotateRight(coordinates);
      }
    }

    return getCoordinates();
  }

}
