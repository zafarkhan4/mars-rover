package com.techreturners.navigation;

import com.techreturners.Coordinates;
import com.techreturners.Grid;

public interface Navigation {

  public boolean moveForward(Coordinates coordinates, Grid grid);
  public void rotateLeft(Coordinates coordinates);
  public void rotateRight(Coordinates coordinates);
  
}
