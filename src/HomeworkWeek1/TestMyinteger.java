package HomeworkWeek1;

import HomeworkWeek1.Myinteger;

public class TestMyinteger {
    public static void main(String[] args) {

        Myinteger num1 = new Myinteger(5);

        int sum = num1.add(10);
        System.out.println(sum);

        int residual = num1.subtract(2);
        System.out.println(residual);

        int productOfMultiply = num1.multiply(2);
        System.out.println(productOfMultiply);

        int quotient = num1.divide(5);
        System.out.println(quotient);

        int pow = num1.exponentiation(3);
        System.out.println(pow);

        int pow2 = num1.exponentiation2(2);
        System.out.println(pow2);

        int factorial = num1.makingFactorial();
        System.out.println(factorial);

        int remainderOfDivision = num1.findindRemainderOfDivision(3);
        System.out.println(remainderOfDivision);

        String comparison = num1.compare(145);
        System.out.println(comparison);
    }
}
