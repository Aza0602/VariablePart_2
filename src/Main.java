public class Main {
    public static void main(String[] args) {
        task1 ();
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

        byte typeByte = 127;
        short typeShort = 32767;
        int typeInt = 2147483647;
        long typeLong = 9223372036854775807L;
        float typeFloat = 3.1254789f;
        double typeDouble = 1.7895641236547896;

        System.out.println("«Значение переменной typeByte с типом byte равно " + typeByte + "».");
        System.out.println("«Значение переменной typeShort с типом short равно " + typeShort + "».");
        System.out.println("«Значение переменной typeInt с типом int равно " + typeInt + "».");
        System.out.println("«Значение переменной typeLong с типом long равно " + typeLong + "».");
        System.out.println("«Значение переменной typeFloat с типом float равно " + typeFloat + "».");
        System.out.println("«Значение переменной typeDouble с типом Double равно " + typeDouble + "».");
    }

    public static void task2 () {

        System.out.println("Задача 2");

        double tFloat = 27.12;
        long tLong = 987678965549L;
        float tDouble = 2.786f;
        short tShort = 569;
        short tyShort = -159;
        short typShort = 27897;
        byte tByte = 67;

    }

    public static void task3 () {

        System.out.println("Задача 3");

        int allPaper = 480;
        int LudmilaPavlovna = 23;
        int AnnaSergeevna = 27;
        int EkaterinaAndreevna = 30;


        int studenPaper = allPaper / (LudmilaPavlovna + AnnaSergeevna + EkaterinaAndreevna);

        System.out.println("«На каждого ученика рассчитано " + studenPaper + " листов бумаги».");

    }

    public static void task4 () {

        System.out.println("Задача 4");

        int bottles = 16 / 2;
        int month = 30;
        int day = 24 * 60;

        long twentyMinutes = 20 * bottles;
        System.out.println("«За 20 минут, машина произвела " + twentyMinutes + " штук бутылок».");

        long oneDay = day * bottles;
        System.out.println("«В сутки, машина произвела " + oneDay + " штук бутылок».");

        long threeDays = (day * 3) * bottles;
        System.out.println("«За 3 дня, машина произвела " + threeDays + " штук бутылок».");

        long oneMonth = (month * day) * bottles;
        System.out.println("«За 1 месяц, машина произвела " + oneMonth + " штук бутылок».");
    }

    public static void task5 () {

        System.out.println("Задача 5");

        int paint = 120;
        int whitePaint = 2;
        int brownPaint = 4;
        int classRoom = whitePaint + brownPaint;
        int allRooms = paint / classRoom;
        int resultWhitePaint = whitePaint * allRooms;
        int resultBrownPaint = brownPaint * allRooms;

        System.out.println("«В школе, где " + allRooms + " классов, нужно " + resultWhitePaint + " банок белой краски и " + resultBrownPaint + " банок коричневой краски».");
    }

    public static void task6 () {

        System.out.println("Задача 6");

        double bananas = 5;
        double milk = 200;
        double iceCream = 2;
        double eggs = 4;
        double ml = 1.05;

        double grBananas = bananas * 80;
        double grMilk = ml * milk;
        double grIceCream = iceCream * 100;
        double grEggs = eggs * 70;
        double kg = 1000;

        double grResult = grBananas + grMilk + grIceCream + grEggs;

        double kgResult = grResult / kg;

        System.out.println("Вес спортивного завтрака составил " + (int) grResult + " грамм в граммах и " + kgResult + " кг в килограммах.");
    }

    public static void task7 () {

        System.out.println("Задача 7");

        double excessWeight = 7 * 1000;
        double minWeight = 0.250 * 1000;
        double maxWeight = 0.500 * 1000;

        double resultMinWeight = excessWeight / minWeight;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, то через " + (int) resultMinWeight + " дней он похудеет на 7 кг.");

        double resultMaxWeight = excessWeight / maxWeight;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, то через " + (int) resultMaxWeight + " дней он похудеет на 7 кг.");
    }

    public static void task8 () {

        System.out.println("Задача 8");

        int plusPercent = 10;

        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int year = 12;

        int payMasha = masha * year;
        int upMasha = masha + (masha * plusPercent) / 100;
        int yearPayMasha = (upMasha * 12) - payMasha;
        System.out.println("«Маша теперь получает " + upMasha + " рублей. Годовой доход вырос на " + yearPayMasha + " рублей».");

        int payDenis = denis * year;
        int upDenis = denis + (denis * plusPercent) / 100;
        int yearPayDenis = (upDenis * 12) -payDenis;
        System.out.println("«Денис теперь получает " + upDenis + " рублей. Годовой доход вырос на " + yearPayDenis + " рублей».");

        int payKristina = kristina * year;
        int upKristina = kristina + (kristina * plusPercent) / 100;
        int yearPayKristina = (upKristina * 12) -payKristina;
        System.out.println("«Кристина теперь получает " + upKristina + " рублей. Годовой доход вырос на " + yearPayKristina + " рублей».");

    }

}