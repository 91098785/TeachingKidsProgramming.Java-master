package org.teachingkidsprogramming.section02methods.Kata_and_Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
//------------FourSquare Kata---------------//

//  Use the Tortoise to draw four squares, each with a width and height of 50 pixels
// Write out the steps in English
// Then translate the steps into code
// Make sure to run after each line
public class CompleteFourSquare
{
  public static void main(String[] args)
  {
    System.out.println("be sure to complete the main method to start");
    //TODO: write comments and then code here
    //  Show tortoise #1
    Tortoise.show();
    //  Make the tortoise move at speed 10 #7
    Tortoise.setSpeed(10);
    //  Do the following 4 times #8.1
    for (int i = 0; i < 4; i++)
    {
      //  Write the drawSquare recipe #6.1
      drawSquare();
      //  Turn the tortoise 90 degrees to the right #9
      Tortoise.turn(90);
      //  Repeat -#8.2
    }
  }
  private static void drawSquare()
  {
    //  Recipe for drawSquare #6.2
    //  Do the following 4 times #5.1
    for (int i = 0; i < 4; i++)
    {
      //  Change the color of the pen so the line the tortoise changes to a random color #3
      Tortoise.setPenColor(PenColors.getRandomColor());
      //  Move the tortoise 50 pixels #2
      Tortoise.move(50);
      //  Turn the tortoise 90 degrees to the right #4
      Tortoise.turn(90);
      //  Repeat #5.2
    }
    //  End of drawSquare recipe #6.3
  }
}