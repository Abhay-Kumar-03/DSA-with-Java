public class Driver {

    static int minAgeOfDriving = 18;

    String name;
    int age;
    String dateOfLicense;

    public boolean isAllowedToDrive(){
        return this.age >= minAgeOfDriving;
    }

    public static void main(String[] args) {
//        Car myCar = new Car();
//        myCar.addFuel(6);
//        myCar.drive();
//        myCar.drive();
//        myCar.drive();
//        myCar.addFuel(3);
//        myCar.drive();
//        System.out.println(myCar.getCurrentFuelLevel());

        Car swift = new Car("red");
        Car Thar = new Car();
        System.out.println(Thar.color);
//        swift.addFuel(6);
        swift.start().drive();
        System.out.println(swift.color);

//        Driver myDriver = new Driver();
//        myDriver.dateOfLicense = "1/Jan/2024";
//        System.out.println(Driver.minAgeOfDriving);

    }
}
