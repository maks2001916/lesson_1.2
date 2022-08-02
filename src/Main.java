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
        System.out.println(pencil + sheet + letter + sign + part + particle);
        //вторая задача
        float weightOfOneBoxer = 78.2f;
        float weightOfTheSecondBoxer = 82.7f;
        float totalWeight = weightOfOneBoxer + weightOfTheSecondBoxer;
        System.out.println("общий вес боксёров " + totalWeight + " кг.");
        float difference = weightOfTheSecondBoxer - weightOfOneBoxer;
        System.out.println("разница в весе бовсёров " + difference + " кг");


    }
}