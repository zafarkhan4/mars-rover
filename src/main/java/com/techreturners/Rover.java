package com.techreturners;

import com.techreturners.navigation.East;
import com.techreturners.navigation.Navigation;
import com.techreturners.navigation.North;
import com.techreturners.navigation.South;
import com.techreturners.navigation.West;

public class Rover {

  private Grid grid;
  private Coordinates coordinates;

  public void setGrid(String dimensions) {
    if (dimensions == null || dimensions.trim().isEmpty()) {
      throw new IllegalArgumentException("Empty dimensions. Please provide valid dimensions.");
    }

    if (dimensions.split(" ").length != 2) {
      throw new IllegalArgumentException("Please provide x-dimension, y-dimension with space seperated.");
    }

    try {
      String[] roverRange = dimensions.split(" ");
      Integer xBoundary = Integer.parseInt(roverRange[0].trim());
      Integer yBoundary = Integer.parseInt(roverRange[1].trim());
      this.grid = new Grid(xBoundary, yBoundary);
    } catch (NumberFormatException e) {
      throw new IllegalArgumentException("Please provide valid integer for position.");
    }

  }

  public Grid getGrid() {
    return this.grid;
  }

  public void setCoordinates(String strCoordinates) {
    if (strCoordinates == null || strCoordinates.trim().isEmpty()) {
      throw new IllegalArgumentException("Empty co-ordinates. Please provide valid coordinates.");
    }

    if (strCoordinates.split(" ").length != 3) {
      throw new IllegalArgumentException(
          "Please provide x-coordinate, y-coordinate and direction with space seperated.");
    }

    try {
      String[] coordinates = strCoordinates.split(" ");
      Integer xPosition = Integer.parseInt(coordinates[0].trim());
      Integer yPosition = Integer.parseInt(coordinates[1].trim());
      Navigation navigation = setNavigationDirection(coordinates[2].trim());
      this.coordinates = new Coordinates(xPosition, yPosition, navigation);
    } catch (NumberFormatException e) {
      throw new IllegalArgumentException("Please provide valid integer for position");
    }

  }

  private Navigation setNavigationDirection(String direction) {
    if (direction.equalsIgnoreCase("E")) {
      return new East();
    } else if (direction.equalsIgnoreCase("W")) {
      return new West();
    } else if (direction.equalsIgnoreCase("N")) {
      return new North();
    } else {
      return new South();
    }
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
      } else {
        throw new IllegalArgumentException(
            "Invalid instruction. At this point I only understand \"L\", \"R\", \"M\"  ");
      }
    }

    return getCoordinates();
  }

}
