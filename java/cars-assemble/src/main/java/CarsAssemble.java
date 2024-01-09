public class CarsAssemble {

    public double productionRatePerHour(int speed) {

        if (0 <= speed && speed <=10){

            if(speed <= 4){
                return ((double) speed * 221);
            }
            if(speed >= 5 && speed <= 8){

                return ((double)speed * 221 * 0.90);
            }
            if(speed == 9){

                return ((double)speed * 221 * 0.80);
            }
            if(speed == 10){

                return ((double)speed * 221 * 0.77);
            }
            else{
                System.out.println("Select speed between 0 & 10");
                return -1;
            }

        }
        else {
            System.out.println("Select speed between 0 & 10");
            return -1;
        }


    }

    public int workingItemsPerMinute(int speed) {

        double workingItemsProducedPerHour;
        int workingItemsPerMinute;

        workingItemsProducedPerHour = productionRatePerHour(speed);

        workingItemsPerMinute = (int) workingItemsProducedPerHour / 60;

        return workingItemsPerMinute;


    }
}
