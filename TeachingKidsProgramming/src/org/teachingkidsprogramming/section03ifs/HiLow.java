package org.teachingkidsprogramming.section03ifs;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow
{
  public static void main(String[] args)
  {
    int randomInt = NumberUtils.getRandomInt(1, 10000);
    for (int i = 0; i < 15; i++)
    {
      int guess = MessageBox.askForNumericalInput("What is your guess?");
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
