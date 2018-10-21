package Fundamentals;

import java.util.Scanner;
public class Practice3 {
    public static void main(String[] args) {
        System.out.println("???????");
        Scanner scanner1 = new Scanner(System.in);
        String string1 = scanner1.next();

        Scanner scanner2 = new Scanner(System.in);
        String string2 = scanner2.next();

        Scanner scanner3 = new Scanner(System.in);
        String string3 = scanner3.next();

        Integer number1 = Integer.valueOf(string1);
        Integer number2 = Integer.valueOf(string2);
        Integer number3 = Integer.valueOf(string3);

        if(number1.intValue() == number2.intValue() && number1.intValue() == number3.intValue() && number2.intValue() == number3.intValue()) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}
