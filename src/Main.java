import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Primitive types
        byte age = 35, temp = 20;
        int herAge = 33;
        age += 5;
        int myAge = age;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;
        // System.out.println("My age is " + myAge + " and her age is " + herAge);
        byte x = 1;
        byte y = x;
        x =2;
        // System.out.println(y);

        // Reference Types
        Date now = new Date();
        // System.out.println(now);
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.y = 2;
        // System.out.println(point2);

        // Strings
        String message1 = new String("  Hello World!" + "!!");
//        if (message1.endsWith("!!")) {
//            System.out.println("true");
//        }
        String message2 = "Hello again World!";
        // System.out.println(message1);
        // System.out.println(message2);
        // System.out.println(message2.length());
        // System.out.println(message2.indexOf("H"));
        // System.out.println(message2.replace("again", "Again"));
        // System.out.println(message2.toLowerCase());
        // System.out.println(message2.toUpperCase());
        // System.out.println(message2.trim());

        // Escape Sequences

        // Arrays
        // old syntax:
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        //  System.out.println(Arrays.toString(numbers));
        // new syntax:
        int[] numbers2 = {5,4,3,2,1};
        //  System.out.println(Arrays.toString(numbers2));
        // System.out.println(numbers.length);
        // Arrays.sort(numbers2);
        // System.out.println(Arrays.toString(numbers2));

        // Multi dimensional arrays
        // old syntax:
        int[][] numbers3 = new int[2][3];
        numbers3[0][0] = 1;
        // System.out.println(Arrays.deepToString(numbers3));
        int[][][] numbers4 = new int[2][3][5];
        numbers4[0][0][0] = 1;
        // System.out.println(Arrays.deepToString(numbers4));
        // new syntax:
        int[][] numbers5 = {{1,2,3}, {4,5,6}};
        numbers5[0][0] = 9;
        // System.out.println(Arrays.deepToString(numbers5));

        // Constants
        final float PI = 3.14F;
        // System.out.println(PI);

        // Arithmetic Expressions
        double result = (double)10 / (double)3;
        // System.out.println(result);
        int z = 1;
        z++;
        ++z;
        // System.out.println(z);
        int w = z++;
        // System.out.println(z);
        // System.out.println(w); // prints 3 because w takes the value of z before the last addition
        w = ++z;
        // System.out.println(z);
        // System.out.println(w); // prints 5 because w takes the value of z after the last addition

        // Implicit Casting (byte -> short -> int -> long -> float -> double)
        short a = 1;
        int b = a + 2;
        // System.out.println(a);
        // System.out.println(b);

        // Explicit Casting
        double c = 1.1;
        int d = (int)c + 2;
        // System.out.println(c);
        // System.out.println(d);
        String e = "1";
        int f = Integer.parseInt(e) + 2;
        // System.out.println(e);
        // System.out.println(f);

        // The Math Class
        result = Math.round(1.1F);
        // System.out.println(result);
        result = (int)Math.ceil(1.1F);
        // System.out.println(result);
        result = (int)Math.floor(1.1F);
        // System.out.println(result);
        result = Math.max(1, 2);
        // System.out.println(result);

        // Formating Numbers
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result1 = currency.format(1234567.891);
        // System.out.println(result1);
        // long version
        NumberFormat percent = NumberFormat.getPercentInstance();
        String result2 = percent.format(0.1);
        // System.out.println(result2);
        // short version
        String result3 = NumberFormat.getPercentInstance().format(0.3);
        // System.out.println(result3);

        // Reading Input
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Age: ");
//        byte yourAge = scanner.nextByte();
//        System.out.println("You are " + yourAge);

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Name: ");
//        String name = scanner.nextLine().trim();
//        System.out.println("You are " + name);

        // FizzBuzz
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int number = scanner.nextInt();
//        if (number % 3 == 0 && number % 5 == 0) {
//            System.out.println("FizzBuzz");
//        }
//        else if (number % 3 == 0) {
//            System.out.println("Fizz");
//        }
//        else if (number % 5 == 0) {
//            System.out.println("Buzz");
//        }
//        else {
//            System.out.println(number);
//        }

        // for loops
//        for (int i = 0; i < 5; i ++) {
//            System.out.println("Hello World " + i);
//        }

        // while loop case 1
//        int i = 0;
//        while (i < 5) {
//            System.out.println("Hello World " + i);
//            i++;
//        }

        // while loop case 2
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }
    }
}