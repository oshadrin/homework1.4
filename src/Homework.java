public class Homework {
    public static void main(String[] args) {
    task1();
    task2();
    task3();
    task4();
    task5();
    }
    public static void task1() {

        int i = 1;
        while (i < 11) {
            System.out.print(i + " ");
            i++;
        }
        System.out.print("\n");

        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void task2() {

        int friday = 3;
        for (; friday <=  31; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + " -е число. Необходимо подготовить отчет.");
        }
    }
    public static void task3() {

        int yearOfStart = 1822;
        int yearOfFinish = 2122;
        for (int i = 0 ; i <= yearOfFinish; i = i + 79) {
            if (i > yearOfStart && i < yearOfFinish) {
                System.out.println(i);
            }
        }
    }

    public static void task4() {
        for (int i = 1; i < 31; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ": ping pong");
            } else if (i % 3 == 0) {
                System.out.println(i + ": ping");
            } else if (i % 5 == 0) {
                System.out.println(i + ": pong");
            } else {
                System.out.println(i + "");
            }
        }
    }
    public static void task5 () {

        int a = 0;
        int b = 1;
        int c;
        System.out.print(a + " " + b + " ");

        for (int i = 3; i <= 10; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

    }
}
