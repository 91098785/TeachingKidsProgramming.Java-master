package org.teachingkidsprogramming.section01forloops.Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class CompleteSquare
{
  // Use the Tortoise to draw a red square
  //
  // Write each of the English lines in comments (use at least 6 line comments)
  //
  // Number each comment line at the end, so your user knows the correct order
  //
  //  to translate the code
  //
  // Verify - Step one - Translate EACH comment line into Java code
  //
  // Verify - Step two - Run your code after each line
  public static void main(String[] args)
  {
    // TODO: write comments and then code here
    //    Show the Tortoise --#1
    Tortoise.show();
    //    do the following 4 times --#5.1  
    for (int i = 0; i < 4; i++)
    {
      //    Change the pen color of the line that the Tortoise draws to red --#4
      Tortoise.setPenColor(PenColors.Reds.Red);
      //    Move the Tortoise 40 pixels --#2
      Tortoise.move(40);
      //     Turn the Tortoise 90 degrees --#3 
      Tortoise.turn(90);
      //    Repeat --#5.2  
    }
  }
}