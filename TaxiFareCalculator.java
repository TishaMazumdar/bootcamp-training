public class TaxiFareCalculator{
    // Taxi fare Calculator
    // Base = 30 till 2 kms
    // Variable = 7 per km till 10 km
    // Variable 2 = increase 30% every 10 kms
    // per minute travelling time
    // per min charges - 2rs
    // You travelled from Delhi to Gurgaon 150 kms at an avg speed of 60 km/hr
    public static void main(String[] args) {
        float distance = 150f;
        float base_charge = 30f;
        float variable_charge = 7f;
        float total_distance_charge;

        // time
        float speed = 60f;
        float time = distance/speed;
        float time_charge = 2*60*time;
        System.out.println("Time Charge: "+time_charge);

        // distance
        if(distance <= 2){
            total_distance_charge = base_charge;
            System.out.println("Distance Charge: "+total_distance_charge);
        } else if (distance <= 10) {
            total_distance_charge = base_charge + (variable_charge * (distance - 2));
            System.out.println("Distance Charge: "+total_distance_charge);
        } else {
            total_distance_charge = base_charge + (variable_charge * 8);
            for(int i=10; i<=distance; i+=10){
                variable_charge *= 1.3f;
                total_distance_charge = total_distance_charge + variable_charge;
            }
            System.out.println("Distance Charge: "+total_distance_charge);
        }
        System.out.println("Total charge: " + (total_distance_charge+time_charge));
    }
}