public class Main {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Toyota", "Camry", 2010);
        Vehicle v2 = new Vehicle("Ford", "Mustang", 1965);
        Vehicle v3 = new Vehicle("Honda", "Civic", 2025);

        // Getters
        System.out.println("Vehicle 1:");
        System.out.println("Brand: " + v1.getBrand() + ", Model: " + v1.getModel() + ", Year: " + v1.getYear());
        v1.displayInfo();
        System.out.println("Age: " + v1.calculateAge());
        System.out.println("Vintage: " + v1.isVintage());

        System.out.println();

        System.out.println("Vehicle 2:");
        System.out.println("Brand: " + v2.getBrand() + ", Model: " + v2.getModel() + ", Year: " + v2.getYear());
        v2.displayInfo();
        System.out.println("Age: " + v2.calculateAge());
        System.out.println("Vintage: " + v2.isVintage());

        System.out.println();

        System.out.println("Vehicle 3:");
        System.out.println("Brand: " + v3.getBrand() + ", Model: " + v3.getModel() + ", Year: " + v3.getYear());
        v3.displayInfo();
        System.out.println("Age: " + v3.calculateAge());
        System.out.println("Vintage: " + v3.isVintage());

        System.out.println();

        System.out.println("setYear() tests on Vehicle 1");
        System.out.println("setYear(2000): " + v1.setYear(2000));
        System.out.println("Stored year: " + v1.getYear());
        System.out.println("Age: " + v1.calculateAge());
        System.out.println("Vintage: " + v1.isVintage());

        System.out.println();

        System.out.println("setYear(1885): " + v1.setYear(1885));
        System.out.println("Stored year: " + v1.getYear());

        System.out.println("setYear(2027): " + v1.setYear(2027));
        System.out.println("Stored year: " + v1.getYear());

        System.out.println();

        // Constructor validation tests
        Vehicle invalidYear1 = new Vehicle("Test", "Vehicle 1885", 1885);
        System.out.println("New vehicle with year 1885: " + invalidYear1.getYear());

        Vehicle invalidYear2 = new Vehicle("Test", "Vehicle 2027", 2027);
        System.out.println("New vehicle with year 2027: " + invalidYear2.getYear());
    }
}