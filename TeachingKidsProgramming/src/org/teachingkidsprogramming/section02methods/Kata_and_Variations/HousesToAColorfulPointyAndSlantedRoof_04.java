package org.teachingkidsprogramming.section02methods.Kata_and_Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class HousesToAColorfulPointyAndSlantedRoof_04
{
  public static void main(String[] args)
  {
    //--------- Kata Question-----------
    // How would you make a house with a slanted roof?
    //   and a house wit a pointy roof?
    // and change the color of the houses
    //Write out the steps in English
    //Then translate the steps into code.
    //Make sure to run after each line
    // make a slanted roof
    VirtualProctor.setClassName("Palm Digital");
    VirtualProctor.setName("Erik and Victor");
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setX(200);
    int height = 40;
    //make a skyline with pointy roof houses and slanted roof houses
    // make a house with a pointy roof and current height #1
    drawHousePointyRoof(height);
    // make a house with a slanted roof and a height of 120 pixels #2
    drawHouseSlantedRoof(120);
    // make a house with a pointy roof and a height of 90 pixels #3
    drawHousePointyRoof(90);
    // make a house with a slanted roof and a height of 20 pixels #4
    drawHouseSlantedRoof(20);
  }
  private static void drawHousePointyRoof(int height)
  {
    //switch the color of the methods to random
    Tortoise.setPenColor(PenColors.getRandomColor());
    Tortoise.move(height);
    drawPointyRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawHouseSlantedRoof(int height)
  {
    //switch the color of the methods to random
    Tortoise.setPenColor(PenColors.getRandomColor());
    Tortoise.move(height);
    drawSlantedRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawHouseFlatRoof(int height)
  {
    Tortoise.setPenColor(PenColors.Grays.LightGray);
    Tortoise.move(height);
    drawFlatRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawSlantedRoof()
  {
    //turn tortoise 45 degrees to the right--#1
    Tortoise.turn(45);
    //move the tortoise 30 pixels--#2
    Tortoise.move(30);
    //turn the tortoise 135 degrees to the right#3
    Tortoise.turn(135);
    //move tortoise 90 pixels
    Tortoise.move(20);
  }
  private static void drawPointyRoof()
  {
    //turn the tortoise 45 degrees to the right--#1
    Tortoise.turn(45);
    //move the tortoise A pixels--#2
    Tortoise.move(30);
    //turn the tortoise 90 degrees to the right--#3
    Tortoise.turn(90);
    //move the tortoise A pixels--#4
    Tortoise.move(30);
    //turn the tortoise 45 degrees to the right--#5
    Tortoise.turn(45);
  }
  private static void drawFlatRoof()
  {
    // make flat roof
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
  }
}
