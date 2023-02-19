public class Main {
    public static void main(String[] args) {
        task1 ();
        task2();
        task3();
        task4();
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

}