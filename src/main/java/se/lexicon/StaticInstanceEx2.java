package se.lexicon;

import java.util.Random;

public class StaticInstanceEx2 {

  private int min;
  private int max;

  public StaticInstanceEx2(){}

  public StaticInstanceEx2(int min, int max){
    this.min = min;
    this.max = max;
  }

  public int getMin() {
    return min;
  }

  public void setMin(int min) {
    this.min = min;
  }

  public int getMax() {
    return max;
  }

  public void setMax(int max) {
    this.max = max;
  }

  // Does this method use instance fields or methods?
  public int randomNumberBetween(){
    Random random = new Random();
    return random.nextInt((max - min) + 1) + min;
  }


}
