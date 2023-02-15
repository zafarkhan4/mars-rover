package com.techreturners.navigation;

import com.techreturners.Coordinates;
import com.techreturners.Grid;

public class North implements Navigation {

  @Override
  public boolean moveForward(Coordinates coordinates, Grid grid) {
    int updatedPosition = coordinates.getyPosition() + 1;
    
    if(updatedPosition == grid.getyBoundary()) {
      throw new IllegalArgumentException("I have reached grid boundary.");
    }

    coordinates.setyPosition(updatedPosition);
    return false;
  }

  @Override
  public void rotateLeft(Coordinates coordinates) {
    coordinates.setNavigation(new West());
  }

  @Override
  public void rotateRight(Coordinates coordinates) {
    coordinates.setNavigation(new East());
  }

  @Override
  public String toString() {
    return "N";
  }

}
