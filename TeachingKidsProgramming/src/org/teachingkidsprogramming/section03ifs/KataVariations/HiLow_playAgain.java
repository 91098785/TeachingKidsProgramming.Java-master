package org.teachingkidsprogramming.section03ifs.KataVariations;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow_v00
{
  public static void main(String[] args)
  {
    //need while loop because we don't know how many time it will be played
    int playAgain = 1;
    while (playAgain == 1)
    {
      int answer = NumberUtils.getRandomInt(1, 100);
      MessageBox.showMessage("The answer is " + answer); // delete (or comment out) this line after testing the game 
      int tries = 0;
      for (; tries < 2; tries++)
      {
        int guess = MessageBox.askForNumericalInput("Guess a number");
        if (guess == answer)
        {
          Sound.playBeep();
          MessageBox.showMessage("You won!");
          //       System.exit(0);
          break;
        }
        else if (guess > answer)
        {
          MessageBox.showMessage("Too high");
        }
        else
        {
          MessageBox.showMessage("Too low");
        }
      }
      MessageBox.showMessage("You lost");
      playAgain = MessageBox.askForNumericalInput("Enter '1' to play again");
    }
  }
}
