package se.lexicon;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class StaticInstanceEx1 {


  public static int randomNumber() {
    return ThreadLocalRandom.current().nextInt();
  }

  // Does this method use instance fields or methods? No
  public static int randomNumberBetween(int min, int max) { // 10 - 100
    Random random = new Random();
    return random.nextInt((max - min) + 1) + min;
  }


}
