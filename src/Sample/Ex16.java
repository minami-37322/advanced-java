package Sample;

public class Ex16 {
    public static void main(String[] args) {
        Calculation.execute(4, "+", 3);
        Calculation.execute(8, "-", 4);
        Calculation.execute(3, "×", 8);
        Calculation.execute(5, "÷", 2);
        try{
        Calculation.execute(8, "$", 3);

    }

}
}
