public class Main {
    public static void main(String[] args) {
        byte bottleMinute = 8;
        int bottleTwenty = bottleMinute * 20;
        System.out.println("За 20 минут машина произвела " +bottleTwenty +" штук");
        int bottleDay = bottleMinute * 60 * 24;
        System.out.println("За сутки машина произвела " +bottleDay +" штук");
        int bottleThreeDay = bottleDay * 3;
        System.out.println("За 3 дня машина произвела " +bottleThreeDay +" штук");
        int bottleMonth = bottleDay * 30;
        System.out.println("За 30 дней машина произвела " +bottleMonth +" штук");
    }
}