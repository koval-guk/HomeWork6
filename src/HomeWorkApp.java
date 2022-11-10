import java.util.Random;

public class HomeWorkApp {
    static Random random = new Random();

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(checkNumbersRange(random.nextInt(16), random.nextInt(16)));
        printNumberSign(random.nextInt(11) - 5);
        System.out.println(checkNumberNegative(random.nextInt(10) - 5));
        printString("bagel", random.nextInt(5) + 1);
        System.out.println(checkLeapYear(2022));
    }

    private static void printThreeWords() {
        System.out.print("Orange\nBanana\nApple\n");
    }

    private static void checkSumSign() {
        int a = random.nextInt(21) - 10;
        int b = random.nextInt(21) - 10;
        if (a + b >= 0) {
            System.out.println("sum is positive --> " + (a + b));
        } else {
            System.out.println("sum is negative --> " + (a + b));
        }
    }

    private static void printColor() {
        System.out.print("colour is ");
        int value = random.nextInt(301) - 100;
        if (value <= 0) {
            System.out.println("red");
        } else if (value > 0 && value <= 100) {
            System.out.println("yellow");
        } else {
            System.out.println("green");
        }
    }

    private static void compareNumbers() {
        int a = random.nextInt(21) - 10;
        int b = random.nextInt(21) - 10;
        if (a >= b) {
            System.out.println("a>=b --> " + a + ">=" + b);
        } else {
            System.out.println("a<b --> " + a + "<" + b);
        }
    }

    private static boolean checkNumbersRange(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    private static void printNumberSign(int number) {
        if (number >= 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    }

    private static boolean checkNumberNegative(int number) {
        return !(number >= 0);
    }

    private static void printString(String string, int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print(string + "; ");
        }
        System.out.println();
    }

    private static boolean checkLeapYear(int year) {
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }
}
