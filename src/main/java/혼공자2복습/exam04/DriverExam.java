package 혼공자2복습.exam04;

public class DriverExam {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Vehicle vehicle = new Vehicle();
        driver.drive(vehicle);

        Bus bus = new Bus();
        driver.drive(bus);

        Taxi taxi = new Taxi();
        driver.drive(taxi);
    }
}
