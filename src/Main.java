public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }
    public static void task1 () {
        System.out.println("Задача 1");
        int    i = 1000000;
        byte   b = -117;
        short  s = 25000;
        long   l = 12345678987654321L;
        float  f = 3.75f;
        double d = 0.77777777;

        System.out.println("«Значение переменной i с типом int равно " + i + "».");
        System.out.println("«Значение переменной b с типом byte равно " + b + "».");
        System.out.println("«Значение переменной s с типом short равно " + s + "».");
        System.out.println("«Значение переменной l с типом long равно " + l + "».");
        System.out.println("«Значение переменной f с типом float равно " + f + "».");
        System.out.println("«Значение переменной d с типом double равно " + d + "».");

    }
    public static void task2 () {
        System.out.println("Задача 2");
        float  f = 27.12f;
        long   l = 987678965549L;
        float  f1 = 2.786f;
        short  s = 569;
        short  s1 = -159;
        short  s2 = 27897;
        byte   b = 67;
    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte  lud = 23;
        byte  ann = 27;
        byte  ek = 30;
        int   sum = lud + ann + ek;
        short p = 480;
        int   s = p / sum;
        System.out.println("«На каждого ученика рассчитано " + s + " листов бумаги»." );

    }
    public static void task4 () {
        System.out.println("Задача 4");
        byte a = 16;
        byte b = 2;
        byte c = 16 / 2;
        int d = c * 1440;
        int d3 = d * 3;
        int dm = d * 30;

        System.out.println("«За 20 минут машина произвела " + d + " штук бутылок».");
        System.out.println("«За 20 минут машина произвела " + d3 + " штук бутылок».");
        System.out.println("«За 20 минут машина произвела " + dm + " штук бутылок».");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte   a = 120;
        byte   b = 120 / (2 + 4);
        int    c = b * 2 ;
        int    d = b * 4;

        System.out.println("«В школе, где " + b + " классов, нужно " + c + " банок белой краски и " + d + " банок коричневой краски»." );

    }

    public static void task6 () {
        System.out.println("Задача 6");
        byte        b = 80;
        byte        m = 105;
        byte        p = 100;
        byte        y = 70;
        int       sum = (b * 5 + m * 2 + p * 2 + y * 4);
        float  weihgt = sum / 1000f;
        System.out.println("Общий вес бойцов в граммах = " + sum +  ", в килограммах - " + weihgt + ".");

    }

    public static void task7 () {
        System.out.println("Задача 7");
        byte  a = 7;
        byte  b = 7 * (1000 / 250);
        byte  c = 7 * (1000 / 500);
        float s = (b + c) / 2f;
        System.out.println("Дней потребуется при похудении в день на 250 грамм - " + b + ". При похудении на 50 грамм - " + c + " дней. Дней в среднем - " + s + ".");

    }

    public static void task8 () {
        System.out.println("Задача 8");
        int  m = 67760;
        int  d = 83690;
        int  k = 76230;
        double m1 = m + m * 0.1;
        double d1 = d + d * 0.1;
        double k1 = k + k * 0.1;
        double m0 = m1 - (12 - m * 12);
        double d0 = d1 * (12 - d * 12);
        double k0 = k1 * (12 - k * 12);
        System.out.println("«Маша теперь получает " + m1 + " рублей. Годовой доход вырос на " + m0 + " рублей».");
        System.out.println("«Денис теперь получает  "  + d1 + " рублей. Годовой доход вырос на " + d0 + " рублей».");
        System.out.println("«Кристина теперь получает " + k1 + " рублей. Годовой доход вырос на " + k0 + " рублей».");
    }

}