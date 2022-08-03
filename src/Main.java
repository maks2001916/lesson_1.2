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
        float massInKilogrsms = totalMassOfProducts / (float)oneKilogramms;
        System.out.println("Масса завтрака " + massInKilogrsms + " кг");
        //четвёртая задача
        int weightLoss = 7000;
        int weightLossOne = 250;
        int weightLossTwo = 500;
        int numberOfDaysOne = weightLoss / weightLossOne;
        int numberOfDaysTwo = weightLoss / weightLossTwo;
        System.out.println(numberOfDaysOne + " дней уйдёт на похудение при потере 250 грамм массы в день ");
        System.out.println(numberOfDaysTwo + " дней уйдёт на похудение при потере 500 грамм массы в день ");
        int generalValue = numberOfDaysOne + numberOfDaysTwo;
        byte quantity = 2;
        int averageValue = generalValue / quantity;
        System.out.println("в среднем уйдёт " + averageValue + " день на похудение");
        //дятая задача
        int mashasSalary = 67_760;
        int denissSalary = 83_690;
        int kristinasSalary = 76_230;
        int newMashasSalary = mashasSalary / 10;
        int newDenissSalary = denissSalary / 10;
        int newKristinasSalary = kristinasSalary / 10;
        int newMashasSalaryTwo = mashasSalary + newMashasSalary;
        int newDenissSalaryTwo = denissSalary + newDenissSalary;
        int newKristinasSalaryTwo = kristinasSalary + newKristinasSalary;
        int mashasSalaryYear = mashasSalary * 12;
        int denissSalaryYear = denissSalary * 12;
        int kristinasSalaryYear = kristinasSalary * 12;
        int newMashasSalaryYear = newMashasSalaryTwo * 12;
        int newDenissSalaryYear = newDenissSalaryTwo * 12;
        int newKristinasSalaryYear = newKristinasSalaryTwo * 12;
        int mashasDifference = newMashasSalaryYear - mashasSalaryYear;
        int denissDifference = newDenissSalaryYear - denissSalaryYear;
        int kristinasDifference = newKristinasSalaryYear - kristinasSalaryYear;
        System.out.println("увеличенная зарплата Маши составляет " + newMashasSalaryTwo + " руб");
        System.out.println("увеличенная зарплата Дениса составляет " + newDenissSalaryTwo + " руб");
        System.out.println("увеличенная зарплата Кристины составляет " + newKristinasSalaryTwo + " руб");
        System.out.println("годовой оклад Маши составляет " + mashasSalaryYear + " руб");
        System.out.println("годовой оклад Дениса составляет " + denissSalaryYear + " руб");
        System.out.println("годовой оклад Кристины составляет " + kristinasSalaryYear + " руб");
        System.out.println("Новый годовой оклад Маши составляет " + newMashasSalaryYear + " руб");
        System.out.println("Новый годовой оклад Дениса составляет " + newDenissSalaryYear + " руб");
        System.out.println("Новый годовой оклад Кристины составляет " + newKristinasSalaryYear + " руб");
        System.out.println("разница оклада Маши составляет " + mashasDifference + " руб");
        System.out.println("разница оклада Дениса составляет " + denissDifference + " руб");
        System.out.println("разница оклада Кристины составляет " + kristinasDifference + " руб");








    }
}