package org.teachingkidsprogramming.section05recursion;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle.Animals;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class SpiderWeb
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setPenWidth(1);
    Tortoise.setAnimal(Animals.Spider);
    Tortoise.setPenColor(PenColors.Reds.Red);
    Tortoise.getBackgroundWindow().setBackground(PenColors.Grays.Black);
    float lineLength = 10.5f;
    float currentZoom = 42;
    for (int i = 0; i < 10; i++)
    {
      weaveOneLayer(lineLength, currentZoom);
      lineLength = lineLength + currentZoom;
    }
  }
  private static void weaveOneLayer(float lineLength, float currentZoom)
  {
    for (int i = 0; i < 6; i++)
    {
      drawTriangle(lineLength);
      Tortoise.turn(360 / 6);
      drawTriangle(lineLength + currentZoom);
    }
  }
  private static void drawTriangle(float lineLength)
  {
    for (int i = 0; i < 3; i++)
    {
      Tortoise.move(lineLength);
      Tortoise.turn(360 / 3);
    }
  }
}
