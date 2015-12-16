package HomeworkWeek1;/* 2. Написать класс число.
	- сложение
	- вычитание
	- умножение
	- деление
	- возведение в степень
	- вычисление факториала
	- вычисление остатка от деления
	- метод который сравнивает два числа*/

public class Myinteger {
    int number;

    public Myinteger(int number) {

        this.number = number;
    }

    public int add(int num) {
        int sum = num + number;
        return sum;
    }

    public int subtract(int num) {
        int residual = number - num;
        return residual;
    }

    public int multiply(int num) {
        int productOfMultiply = number * num;
        return productOfMultiply;
    }

    public int divide(int num) {
        int quotient = number / num;
        return quotient;
    }

    public int exponentiation(int exponent) {
        int result = (int) Math.pow(number, exponent);
        return result;
    }
    public  int exponentiation2 (int exponent) {
        int result = number;
        if (exponent == 0) {
            result = 1;
        } else if (exponent == 1) {
            result = number;
        } else if (exponent > 1) {
            for (int i = 2; i <= exponent; i++) {
                result = number * number;
            }
        }
        return result;
    }

    public int makingFactorial() {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
        }
        return factorial;
    }

    public int findindRemainderOfDivision (int num) {
        int remainderOfDivision = number % num;
        return remainderOfDivision;
    }

    public String compare (int num) {
        int comparison = number > num ? number : num;
        return "The bigger number is:" + comparison;
    }
}
