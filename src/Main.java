public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Число " + i);
        }


        System.out.println("Задание 2");

        for (int x = 10; x >= 1; x--) {
            System.out.println("Число " + x);
        }


        System.out.println("Задание 3");

        for (int y = 0; y < 17; y = y + 2) {
            System.out.println("Число " + y);
        }


        System.out.println("Задание 4");

        for (int s = 10; s >= -10; s--) {
            System.out.println("Число " + s);
        }


        System.out.println("Задание 5");

        for (int lYear = 1904; lYear <= 2096; lYear = lYear + 4) {
            System.out.println(lYear + " год является високосным");
        }


        System.out.println("Задание 6");

        for (int t = 7; t <= 98; t = t + 7) {
            System.out.println("Число " + t);
        }


        System.out.println("Задание 7");

        for (int b = 1; b <= 512; b = b * 2) {
            System.out.println("Число " + b);
        }


        System.out.println("Задание 8");

        int contcontribution = 29000;
        int total = 0;

        for (int i = 1; i <= 12; i++) {
            total = total + contcontribution;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
        }


        System.out.println("Задача 9");

        int cont = 29000;
        int tot = 0;

        for (int i = 1; i <= 12; i++) {
            tot = tot + tot / 100;
            tot = tot + cont;

            System.out.println("Месяц " + i + ", сумма накоплений равна " + tot + " рублей.");
        }


        System.out.println("Задание 10");

        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println("2 * " + i + " = " + i * 2);
        }


    }
}