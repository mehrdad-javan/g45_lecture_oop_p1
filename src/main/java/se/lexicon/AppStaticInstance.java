package se.lexicon;

public class AppStaticInstance {

  public static void main(String[] args) {
    System.out.println(StaticInstanceEx1.randomNumber());
    System.out.println(StaticInstanceEx1.randomNumberBetween(10,100));


    StaticInstanceEx2 ex2 = new StaticInstanceEx2(100,1000);
    System.out.println(ex2.randomNumberBetween());


  }


}
