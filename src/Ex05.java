public class Ex05 {
    public static void main(String[] args) {
        String bigNumber = "阿僧祇:那由多:不可思議:無料対数";
        String[] numbers = bigNumber.split(":");

        for(String number : numbers){
           System.out.println(number); 
        }

    }

}
