package com.techreturners;

public class Grid {

  private int xMaxDistance;
  private int yMaxDistance;


  public Grid(String dimensions) {
    String[] roverRange = dimensions.split(" ");
    this.xMaxDistance = Integer.parseInt(roverRange[0]);
    this.yMaxDistance = Integer.parseInt(roverRange[1]);
  }


  public int getxMaxDistance() {
    return xMaxDistance;
  }


  public int getyMaxDistance() {
    return yMaxDistance;
  }
  
}
