import java.awt.*;
import java.util.Arrays;
import java.util.Date;

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
        System.out.println(PI);
    }
}