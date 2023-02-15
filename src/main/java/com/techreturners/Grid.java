package com.techreturners;

public class Grid {

  private int xBoundary;
  private int yBoundary;
  private int xLowerBoundary = 0;
  private int yLowerBoundary = 0;

  public Grid(int xBoundary, int yBoundary) {
    this.xBoundary = xBoundary;
    this.yBoundary = yBoundary;
  }

  public int getxBoundary() {
    return xBoundary;
  }

  public int getyBoundary() {
    return yBoundary;
  }

  public int getxLowerBoundary() {
    return xLowerBoundary;
  }

  public int getyLowerBoundary() {
    return yLowerBoundary;
  }

}
