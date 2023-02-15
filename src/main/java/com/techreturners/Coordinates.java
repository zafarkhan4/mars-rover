package com.techreturners;

import com.techreturners.navigation.East;
import com.techreturners.navigation.Navigation;
import com.techreturners.navigation.North;
import com.techreturners.navigation.South;
import com.techreturners.navigation.West;

public class Coordinates {

  private int xPosition;
  private int yPosition;
  private Navigation navigation;

  public Coordinates(String strCoordinates) {
    String[] coordinates = strCoordinates.split(" ");
    this.xPosition = Integer.parseInt(coordinates[0]);
    this.yPosition = Integer.parseInt(coordinates[1]);
    this.navigation = setNavigationDirection(coordinates[2]);
  }

  private Navigation setNavigationDirection(String direction) {
    if(direction.equalsIgnoreCase("E")) {
      return new East();
    } else if (direction.equalsIgnoreCase("W")) {
      return new West();
    } else if (direction.equalsIgnoreCase("N")) {
      return new North();
    } else {
      return new South();
    }
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
