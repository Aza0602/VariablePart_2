public class Main {
    public static void main(String[] args) {
        task1 ();
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

}