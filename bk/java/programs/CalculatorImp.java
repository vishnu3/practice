package programs;

interface Calculator{
        int subtract(int i, int j);
}


public class CalculatorImp {
    public static void main(String[] args) {
        Calculator cacl =  (i1,i2) -> i1+i2;

        System.out.println(cacl.subtract(10,30));

    }
}
