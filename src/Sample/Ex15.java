package Sample;

public class Ex15 {
    public static void main(String[] args) throws Exception {
        Car2 car  = new Car2();
        car.run(40);


        try{
        car.run(200);
    }catch (IllegalAccessException e){
        e.printStackTrace();
    }
        

        
    
    
    }
}


