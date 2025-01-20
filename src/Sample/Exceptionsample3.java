package Sample;


    public class ExceptionSample3 { 
        public static void main(String[] args) { 
        System.out.println("プログラム開始"); 
         
        try { 
             Class.forName("java.lang.NotExistClass"); 
             System.out.println("例外が発⽣しませんでした"); 
         } catch (ClassNotFoundException e) { 
           System.out.println("例外が発⽣しました"); 
         } catch (Exception e) { // ←Exceptionのサブクラスの例外を全てcatchする 
         System.out.println("その他の例外が発⽣しました"); 
         } finally { 
           System.out.println("finallyブロックが実⾏されました"); 
         } 
            System.out.println("プログラム終了");
        }

    }

