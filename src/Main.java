public class Main {
    public static void main(String[] args) {
        // Домашнее задание № 1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Домашнее задание № 2
        int clientDeviceYear = 2014;          //год выпуска телефона
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке». ");
        }

        // Домашнее № 3
        int year = 2100;
        if (year % 400 == 0) {
            System.out.println(year + " високосный");
        } else if (year % 100 == 0) {
            System.out.println(year + " не високосный");
        } else if (year % 4 == 0) {
            System.out.println(year + "  високосный");
        } else
            System.out.println(year + " не високосный");

        // Домашнее задание № 4
        int deliveryDistance = 195;
        int i = 0;
        if (deliveryDistance < 20) {
            i = 1;
            System.out.println("время доставки " + i + " дней");
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            i = 2;
            System.out.println("время доставки " + i + " дней");
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            i = 3;
            System.out.println("время доставки " + i + " дней");
        }else
            System.out.println("Доставки нет");
        //Домашнее задание № 5
        int monthNumber= 58;
        switch (monthNumber){
            case 0:
            case 1:
            case 2:
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
                System.out.println("Такого номера не существует");

        }
    }
}


