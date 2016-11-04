package org.teachingkidsprogramming.section02methods.Kata_and_Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class Variation01_Batman
{
  public static void main(String[] args)
  {
    //--------- Kata Question-----------
    // How would you make a batman face?
    //Write out the steps in English
    //Then translate the steps into code.
    //Make sure to run after each line
    // make a batman face
    VirtualProctor.setClassName("Palm Digital");
    VirtualProctor.setName("Erik and Victor");
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setX(200);
    int height = 40;
    drawBatmanFace(50);
  }
  private static void drawHousePointyRoof(int height)
  {
    Tortoise.setPenColor(PenColors.Grays.LightGray);
    Tortoise.move(height);
    drawPointyRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawHouseInvertedSlantedRoof(int height)
  {
    Tortoise.setPenColor(PenColors.Grays.LightGray);
    Tortoise.move(height);
    drawPointyRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawHouseSlantedRoof(int height)
  {
    Tortoise.setPenColor(PenColors.Grays.LightGray);
    Tortoise.move(height);
    drawSlantedRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawBatmanFace(int height)
  {
    //draw a slanted house#1
    drawHouseSlantedRoof(90);
    //move tortoise 10 pixels #2
    Tortoise.move(100);
    //draw inverted slanted house#3
    drawHouseInvertedSlantedRoof(90);
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
  private static void drawInvertedSlantedRoof()
  {
    //turn the tortoise 135 degrees to the right#3
    Tortoise.turn(135);
    //move the tortoise 30 pixels--#2
    Tortoise.move(30);
    //turn tortoise 45 degrees to the right--#1
    Tortoise.turn(45);
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
