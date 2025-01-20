package Sample;

public class Car2 {
    private int speed;

    public int getSpeed() {
        return speed;
    }

   public void run(int speed) throws Exception{
    if(speed<0 || speed>180){
        throw new IllegalAccessException("スピードの出しすぎです");

    }else{
        this.speed+=speed;
        System.out.println("スピードが"+this.speed+"km/hになりました");
    
    }
   }
}


