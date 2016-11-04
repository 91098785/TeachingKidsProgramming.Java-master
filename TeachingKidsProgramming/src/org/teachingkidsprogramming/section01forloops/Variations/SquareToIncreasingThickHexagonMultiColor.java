package org.teachingkidsprogramming.section01forloops.Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class SquareToIncreasingThickHexagonMultiColor
{
  // ----Kata Question----
  // How would you make a hexagon...
  // with 20 pixels thick sides?
  // and multi-colored lines
  // and with side lenghts of 25 that increase by 2??
  // Write out steps in English
  // Then translate the steps into code
  // Make sure to run after each line
  // initialize length to 25
  public static void main(String[] args) throws Exception
  {
    VirtualProctor.setClassName("Palm Digital");
    VirtualProctor.setName("Victor and Erik");
    Tortoise.setPenWidth(20);
    Tortoise.show();
    Tortoise.setSpeed(10);
    //Make a variable named length
    int length = 5;
    // Change number of sides to 6
    int sides = 6;
    for (int i = 0; i < sides; i++)
    {
      //Change the color of the line to multicolor 
      Tortoise.setPenColor(PenColors.getRandomColor());
      //Start side lenght at 25 pixels
      Tortoise.move(length);
      length = length * 2;
      Tortoise.turn(360 / sides);
    }
  }
}
