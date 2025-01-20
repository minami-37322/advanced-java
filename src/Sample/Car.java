package Sample;

public class Car {
   private int speed;
   public void run() throws Exception{
    speed+=10;
    if(speed>=120){
        throw new OverSpeedException("スピードの出しすぎです");

    }

   }
}
