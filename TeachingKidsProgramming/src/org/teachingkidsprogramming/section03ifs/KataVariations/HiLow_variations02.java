package org.teachingkidsprogramming.section03ifs.KataVariations;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow_variations02
{
  public static void main(String[] args)
  {
    int randomInt = NumberUtils.getRandomInt(1, 100);
    int numGuesses = MessageBox.askForNumericalInput("How many guesses do you need?");;
    for (int i = 0; i < numGuesses; i++)
    {
      int guess = MessageBox.askForNumericalInput("Chose a number from 1 to 100");
      int answer = randomInt;
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("You won the game");
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
