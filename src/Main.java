public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    // Задание 1
    public static void task1() {
        System.out.println("Задание 1");

        int clientOS = 1;

        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
        }
        System.out.println("-----------------");
    }

    // Задание 2
    public static void task2() {
        System.out.println("Задание 2");

        int clientOS = 0;
        int clientDeviceYear = 2014;

        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("-----------------");
    }

    // Задание 3
    public static void task3() {
        System.out.println("Задание 3");

        int year = 2021;

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println("-----------------");
    }

    // Задание 4
    public static void task4() {
        System.out.println("Задание 4");

        int deliveryDistance = 95;
        int deliveryDays = 1;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance > 20) {
            System.out.println("Потребуется дней: " + ((deliveryDistance / 40) + deliveryDays));
        }
        System.out.println("-----------------");
    }

    // Задание 5
    public static void task5() {
        System.out.println("Задание 5");

        int monthNumber = 12;

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Номер месяца больше 13");
        }
        System.out.println("-----------------");
    }

    // Задание 6
    public static void task6() {
        System.out.println("Задание 6");

        int age = 19;
        int salary = 58_000;

        if (age >= 23) {
            if (salary >= 50_000) {
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 3) * 1.2 + " рублей");
            } else if (salary >= 80_000) {
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 3) * 1.5 + " рублей");
            }
        } else if (age < 23) {
            if (salary >= 50_000) {
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 2) * 1.2 + " рублей");
            } else if (salary >= 80_000) {
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 2) * 1.5 + " рублей");
            }
        }
        System.out.println("-----------------");
    }

}