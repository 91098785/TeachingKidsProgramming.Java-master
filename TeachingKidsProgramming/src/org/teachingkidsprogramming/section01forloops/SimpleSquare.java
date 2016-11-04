package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class SimpleSquare
{
  public static void main(String[] args) throws Exception
  {
    VirtualProctor.setClassName("Palm Digital");
    VirtualProctor.setName("Victor and Erik");
    Tortoise.show();
    //  Make the tortoise move as fast as possible --#6
    Tortoise.setSpeed(10);
    for (int i = 0; i < 4; i++)
    {
      Tortoise.setPenColor(PenColors.Blues.Blue);
      Tortoise.move(50);
      Tortoise.turn(90);
    }
    //
    //  (Optional): Sign your work using the Virtual Proctor 
    //  See your work at http://virtualproctor.tkpjava.org
  }
}
