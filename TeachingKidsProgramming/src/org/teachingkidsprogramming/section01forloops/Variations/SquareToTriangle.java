package org.teachingkidsprogramming.section01forloops.Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class SquareToTriangle
{
  // ----Kata Question----
  // How would you make an equilateral triangle?
  // Write out steps in English
  // Then translate the steps into code
  public static void main(String[] args) throws Exception
  {
    VirtualProctor.setClassName("Palm Digital");
    VirtualProctor.setName("Victor and Erik");
    Tortoise.show();
    Tortoise.setSpeed(10);
    // Make 3 sides
    int sides = 3;
    for (int i = 0; i < sides; i++)
    {
      Tortoise.setPenColor(PenColors.Blues.Blue);
      Tortoise.move(50);
      Tortoise.turn(360 / sides);
    }
  }
}
