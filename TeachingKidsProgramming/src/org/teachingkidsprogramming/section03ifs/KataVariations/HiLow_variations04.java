package org.teachingkidsprogramming.section03ifs.KataVariations;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow_variations04
{
  public static void main(String[] args)
  {
    int randomInt = NumberUtils.getRandomInt(1, 100);
    int answer = randomInt;
    MessageBox.showMessage("The answer is " + answer);
    int numGuesses = MessageBox.askForNumericalInput("How many guesses do you need?");
    for (int i = 0; i < numGuesses; i++)
    {
      int guess = MessageBox.askForNumericalInput("Chose a number from 1 to 100");
      if (guess <= 1)
      {
        MessageBox.showMessage("Not a valid answer");
        System.exit(0);
      }
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("you won the game!");
        System.exit(0);
      }
      else if (guess > answer)
      {
        MessageBox.showMessage("Too high!");
      }
      else
      {
        MessageBox.showMessage("Too low!");
      }
    }
    MessageBox.showMessage("You lost");
  }
}
