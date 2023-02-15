package com.techreturners;

import com.techreturners.navigation.Navigation;

public class Coordinates {

  private int xPosition;
  private int yPosition;
  private Navigation navigation;

  public Coordinates(int xPosition, int yPosition, Navigation navigation) {
    this.xPosition = xPosition;
    this.yPosition = yPosition;
    this.navigation = navigation;
  }

  public void setxPosition(int xPosition) {
    this.xPosition = xPosition;
  }

  public void setyPosition(int yPosition) {
    this.yPosition = yPosition;
  }

  public void setNavigation(Navigation navigation) {
    this.navigation = navigation;
  }

  public int getxPosition() {
    return this.xPosition;
  }

  public int getyPosition() {
    return this.yPosition;
  }

  public Navigation getNavigation() {
    return this.navigation;
  }

  @Override
  public String toString() {
    return xPosition + " " + yPosition + " " + navigation.toString();
  }

}
