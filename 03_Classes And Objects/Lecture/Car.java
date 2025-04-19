public class Car {

    static int noOfCarSold = 0;
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

    static {
        noOfCarSold = 0;
        System.out.println("I'm in Static Block");
    }

    {
        noOfCarSold++;
        System.out.println("I'm in Init Block");
    }

    Car(String color){
        noOfWheels = 4;
        this.color = color;
        maxSpeed = 150;
        currentFuelInLiters = 2;
        noOfSeats = 5;
    }

    Car(){
        this("Black");
    }

    public float getCurrentFuelLevel(){
        return currentFuelInLiters;
    }

    public void addFuel(float currentFuelInLiters){
        this.currentFuelInLiters += currentFuelInLiters;
    }

    public Car start (){
        if(currentFuelInLiters == 0) {
            System.out.println("Car is out of it Fuel, can not start");
        } else if(currentFuelInLiters < 5){
            System.out.println("Car is in reserved mode, please refule");
        } else{
            System.out.println("Car is started..   bruhhhh");
            currentFuelInLiters--;
        }
        return this;
    }

    public void drive(){
        currentFuelInLiters--;
        System.out.println("Car is driving");
    }
}
