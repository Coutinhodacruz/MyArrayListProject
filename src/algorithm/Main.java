package algorithm;

public class Main {
    public static void main(String[] args) {
        HugeInteger number1 = new HugeInteger();
        HugeInteger number2 = new HugeInteger();

        // Parsing numbers
        number1.parse("1234567890123456789012345678901234567890");
        number2.parse("9876543210987654321098765432109876543210");

        // Printing numbers
        System.out.println("Number 1: " + number1);
        System.out.println("Number 2: " + number2);

        // Adding numbers
        number1.add(number2);
        System.out.println("Addition: " + number1);

        // Subtracting numbers
        number1.subtract(number2);
        System.out.println("Subtraction: " + number1);

        // Comparing numbers
        System.out.println("Number 1 is equal to Number 2: " + number1.isEqualTo(number2));
        System.out.println("Number 1 is not equal to Number 2: " + number1.isNotEqualTo(number2));
        System.out.println("Number 1 is greater than Number 2: " + number1.isGreaterThan(number2));
        System.out.println("Number 1 is less than Number 2: " + number1.isLessThan(number2));
        System.out.println("Number 1 is greater than or equal to Number 2: " + number1.isGreaterThanOrEqualTo(number2));
        System.out.println("Number 1 is less than or equal to Number 2: " + number1.isLessThanOrEqualTo(number2));

        // Checking if a number is zero
        HugeInteger zero = new HugeInteger();
        zero.parse("0");
        System.out.println("Zero is zero: " + zero.isZero());
        System.out.println("Number 1 is zero: " + number1.isZero());
    }
}
