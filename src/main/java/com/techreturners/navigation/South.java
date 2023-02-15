package com.techreturners.navigation;

import com.techreturners.Coordinates;
import com.techreturners.Grid;

public class South implements Navigation{

  @Override
  public boolean moveForward(Coordinates coordinates, Grid grid) {
    int updatedPosition = coordinates.getyPosition() - 1;
    coordinates.setyPosition(updatedPosition);
    return false;
  }

  @Override
  public void rotateLeft(Coordinates coordinates) {
    coordinates.setNavigation(new East());
    
  }

  @Override
  public void rotateRight(Coordinates coordinates) {
    coordinates.setNavigation(new West());
    
  }

  @Override
  public String toString() {
    return "S";
  }

}
