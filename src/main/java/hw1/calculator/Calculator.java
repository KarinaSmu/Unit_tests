package hw1.calculator;
//Задание 1. ** В классе Calculator создайте метод calculateDiscount, который принимает сумму покупки и процент скидки и
// возвращает сумму с учетом скидки. Ваша задача - проверить этот метод с использованием библиотеки AssertJ.
//Если метод calculateDiscount получает недопустимые аргументы, он должен выбрасывать исключение ArithmeticException.
// Не забудьте написать тесты для проверки этого поведения.

public class Calculator {
    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }

    public static double squareRootExtraction(double num) {
        if (num < 0) {
            throw new IllegalArgumentException("Невозможно вычислить квадратный корень из отрицательного числа");
        }
        if (num == 0) {
            return 0.0;
        }
        if (Double.isInfinite(num) || Double.isNaN(num)) {
            throw new IllegalArgumentException("Некорректный ввод: невозможно вычислить квадратный корень из бесконечности или NaN");
        }
        return Math.sqrt(num);
    }


    // Нужно написать в калькуляторе метод вычисления суммы покупки со скидкой и проверить его, используя AssertJ
    // Примерная сигнатура и тело метода:
    public static double calculatingDiscount(double purchaseAmount, int discountPercentage) {
        if (purchaseAmount < 0 || discountPercentage < 0 || discountPercentage > 100) {
            throw new IllegalArgumentException("Недопустимый ввод: процент скидки должен быть от 0 до 100.");
        }

        double discount = purchaseAmount * discountPercentage / 100.0;
        return purchaseAmount - discount;
    }

}