package Sample;

public class Ex14 {
   
        public static void method1() throws ClassNotFoundException{
            Class.forName("java.lang.NonexistClass");
           

        }

        public static void main(String[] args) {
        try {
            method1();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("クラスが見つかりません");

        }
      
    }

}
