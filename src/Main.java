public class Main {
    public static void main(String[] args) {


//        task#1
        int clientOS = 0;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке.");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке.");
                break;
        }
//        task#2
        int clientOs = 0;
        int clientDeviceYear = 2013;
        if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOs == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else if (clientOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }

//        task#3
        int year = 2001;
        if (year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else if (year % 100 == 0) {
            System.out.println(year + " год не является високосным.");
        } else if (year % 4 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }

//        task#4
        int deliveryDistance = 95;
        int day = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Доставка займёт " + day + " день.");
        } else if (deliveryDistance > 21 && deliveryDistance <= 60) {
            System.out.println("Доставка займёт " + day * 2 + " дня.");
        } else if (deliveryDistance > 61 && deliveryDistance <= 100) {
            System.out.println("Доставка займёт " + day * 3 + " дня.");
        } else {
            System.out.println("Доставки нет!");
        }

//        task#5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зимний сезон");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весенний сезон");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Летний сезон");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осенний сезон");
                break;
        }

    }
}