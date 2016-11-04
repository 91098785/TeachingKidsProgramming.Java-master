package org.teachingkidsprogramming.section02methods.Kata_and_Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
//--Kata Question--
//Where do you see duplicate lines of code?
//  and how can you refactor to make this code more readable?
// Write out the steps in english
// Then translate the steps into code
// Make sure to run after each line
//--Kata Question--
//Where do you see duplicate lines of code?
//and how can you refactor to make this code more readable?
//Write out the steps in english
//Then translate the steps into code
//Make sure to run after each line
//Look for duplicate lines of code
//refactror the code
//refactor the code that move the tortoise up
//--Kata Question--
//Where do you see duplicate lines of code?
//and how can you refactor to make this code more readable?
//Write out the steps in english
//Then translate the steps into code
//Make sure to run after each line

// Be aware: this is an example of too much refactoring
public class PyramidsOfGizaRemoveEvenMoreDuplication_04
{
  public static void main(String[] args) throws Exception
  {
    setUpPyramidLand();
    // bad refactoring
    int[][] degreesAndLength = {{-90, 220},
                                {135, 100},
                                {90, 100},
                                {-90, 100},
                                {90, 100},
                                {-90, 100},
                                {90, 100},
                                {135, 210}};
    for (int[] i : degreesAndLength)
    {
      Tortoise.turn(i[0]);
      Tortoise.move(i[1]);
    }
  }
  private static void turnAndMove(int degrees, int length)
  {
    Tortoise.turn(degrees);
    Tortoise.move(length);
  }
  private static void moveUp()
  {
    Tortoise.turn(-90);// !!!
    Tortoise.move(100);// !!!
  }
  private static void moveDown()
  {
    // Move the tortoise down
    // Extract a method
    Tortoise.turn(90); //!!!
    Tortoise.move(100);//!!!
  }
  private static void setUpPyramidLand()
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.getBackgroundWindow().setBackground(PenColors.Blues.AliceBlue);
    Tortoise.setPenColor(PenColors.Yellows.DarkGoldenrod);
    Tortoise.setPenWidth(2);
    Tortoise.hide();
  }
}
