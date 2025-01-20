package Sample;

public class Ex13 {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.java.lang.NotFoundClass");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("クラスが見つかりません");
        }
    }

}
