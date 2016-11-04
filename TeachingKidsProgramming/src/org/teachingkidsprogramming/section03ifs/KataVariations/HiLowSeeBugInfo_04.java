package org.teachingkidsprogramming.section03ifs.KataVariations;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;
//-------Kata questions------
//What happens when you enter letters ('abc') as your guess
//Write out the steps in English
//The translate the steps into code
//Make sure to run after each line

//
public class HiLowSeeBugInfo_04
{
  public static void main(String[] args)
  {
    int answer = NumberUtils.getRandomInt(1, 100);
    MessageBox.showMessage("The answer is " + answer); // delete (or comment out) this line after testing the game 
    for (int i = 0; i < 8; i++)
    {
      int guess = MessageBox.askForNumericalInput("Guess a number");
      MessageBox.showMessage("Your guess is " + guess);
      if (guess >= 100)
      {
        //make a message box saying that negative number are not valid
        MessageBox.showMessage("Invalid Guess! Try a number between 1 and 100");
        System.exit(0);
      }
      if (guess <= 0)
      {
        //make a message box saying that negative number are not valid
        MessageBox.showMessage("Invalid Guess! Try a number between 1 and 100");
      }
      if (guess == 0)
      {
        //make a message box saying that 0 is not valid
        MessageBox.showMessage("Invalid Guess! try a number between 1 and 100");
        //exit progam if entered '0'
        System.exit(0);
      }
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("You won!");
        System.exit(0);
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
  }
}