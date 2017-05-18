import java.security.SecureRandom;
import java.util.Arrays;

/**
 * Created by Maxim on 18.05.2017.
 */
public class Main {
    public static void Example1() {
        Example1_1(34);
        Example1_2(8);
        Example1_3(2 * 5 * 3 * 6 * 9);
    }

    public static void Example1_1(int num) {
        if (num > 0) {
            System.out.println("Положительное ");
        } else {
            System.out.println("Отрицательное ");
        }
    }

    public static void Example1_2(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("Число непростое");
            }
        }
    }

    private static void Example1_3(int num) {
        if (num % 2 == 0 && num % 5 == 0 && num % 3 == 0
                && num % 6 == 0 && num % 9 == 0) {
            System.out.println("Чиcло " + num + " Делится");
        } else System.out.println("Число не делится ");
    }

    public static void Example2() {
        int array[] = new int[20];
        SecureRandom secureRandom = new SecureRandom();
        for (int i = 0; i < array.length; i++) {
            array[i] = secureRandom.nextInt(50);
        }
        Example2_1(array);
        Example2_2(array);
        Example2_1(array);
    }

    public static void Example2_1(int array0[]) {
        for (int i = 0; i < array0.length; i++) {
            System.out.print(array0[i] + " ");
        }
        System.out.println();
    }

    public static void Example2_2(int array[]) {
        Arrays.sort(array);
    }

    public static void Example3() {
        int array1[] = new int[20];

        SecureRandom secureRandom = new SecureRandom();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = secureRandom.nextInt(100);
        }

        // Выводим массив на экран
        Example2_1(array1);

        if (Example3_1(array1, 10)) {
            System.out.println("Содержит");
        } else {
            System.out.println("Не содержит");
        }
    }

    public static boolean Example3_1(int array[], int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        //Example1();
        //Example2();
        Example3();
    }
}
