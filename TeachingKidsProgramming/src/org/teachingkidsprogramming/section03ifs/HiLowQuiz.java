package org.teachingkidsprogramming.section03ifs;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;
import org.teachingkidsprogramming.recipes.quizzes.graders.HiLowQuizGrader;

public class HiLowQuiz extends org.teachingkidsprogramming.recipes.quizzes.graders.HiLowQuiz
{
  @Override
  public void question1()
  {
    if (Tortoise.getY() == 115)
    {
      Tortoise.turn(63);
    }
  }
  @Override
  public void question2()
  {
    if (Tortoise.getX() < Tortoise.getY())
    {
      Tortoise.turn(-54);
    }
    else
    {
      Tortoise.turn(22);
    }
  }
  @Override
  public void question3()
  {
    //  Display the message "elcomeway omehay!"
    MessageBox.showMessage("elcomeway omehay!");
  }
  @Override
  public void question4()
  {
    //  If the Y position of tortoise is greater than 50
    if (Tortoise.getY() > 50)
    {
      Tortoise.turn(-177);
    }
    //  Turn the tortoise 177 degrees to the left
  }
  public static void main(String[] args)
  {
    new HiLowQuizGrader().grade(new HiLowQuiz());
  }
}
