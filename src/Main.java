public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        //первая задача
        byte pencil = 8;
        short sheet = 1_023;
        int letter = 50_637;
        long sign = 222_457_159L;
        float part = 1.5f;
        double particle = 3.847562764653;
        char figure = 5;
        boolean theory = true;
        System.out.println(pencil + sheet + letter + sign + part + particle + figure);
        //вторая задача
        float weightOfOneBoxer = 78.2f;
        float weightOfTheSecondBoxer = 82.7f;
        float totalWeight = weightOfOneBoxer + weightOfTheSecondBoxer;
        System.out.println("общий вес боксёров " + totalWeight + " кг.");
        float difference = weightOfTheSecondBoxer - weightOfOneBoxer;
        System.out.println("разница в весе боксёров " + difference + " кг");
        //третья задача
        //количество продуктов
        byte bananas = 5;
        short milk = 2;
        byte iceCream = 2;
        byte eggs = 4;
        //масса единицы продукта
        byte weightOfOneBanana = 80;
        byte oneHundredMlMilk = 105;
        byte iceCreamBriquette = 100;
        byte oneEgg = 70;
        //подсчёт массы продуктов
        int weightOfBananas = bananas * weightOfOneBanana;
        int milkWeight = milk * oneHundredMlMilk;
        int massOfIceCream = iceCream * iceCreamBriquette;
        int eggWeight = eggs * oneEgg;
        long totalMassOfProducts = weightOfBananas + milkWeight + massOfIceCream + eggWeight;
        long oneKilogramms = 1000;
        float massInKilogrsms = totalMassOfProducts / oneKilogramms;
        System.out.println("Масса завтрака " + massInKilogrsms + " кг");




    }
}