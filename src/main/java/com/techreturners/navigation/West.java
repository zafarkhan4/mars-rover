package com.techreturners.navigation;

import com.techreturners.Coordinates;
import com.techreturners.Grid;

public class West implements Navigation {

  @Override
  public boolean moveForward(Coordinates coordinates, Grid grid) {
    int updatedPosition = coordinates.getxPosition() - 1;
    if(updatedPosition < grid.getxLowerBoundary()) {
      throw new IllegalArgumentException("I have reached grid boundary.");
    }
    coordinates.setxPosition(updatedPosition);
    return false;
  }

  @Override
  public void rotateLeft(Coordinates coordinates) {
    coordinates.setNavigation(new South());
  }

  @Override
  public void rotateRight(Coordinates coordinates) {
    coordinates.setNavigation(new North());
  }

  @Override
  public String toString() {
    return "W";
  }

}
