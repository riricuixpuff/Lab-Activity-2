

public class Main {

   public static void printDetails(Vehicle vehicle){
   vehicle.displayInfo();
   }
   
   public static void main(String[] ARGS){
   //DEMO 1: A Parent refence holding a holding a child object
    System.out.println("===1 PARENT REFERENCE==="); 
    
    Vehicle vehicle = new Car ("Toyota", "Vios", 2023 , 4);
    vehicle.displayInfo();

    System.out.println(); 
   
   // 1.1 The same variable now refers to a Truck object
   System.out.println("TRUCK");
   
   vehicle  = new Truck ("Isuzu", "NHR", 2024 , 4);
   vehicle.displayInfo();
   
   System.out.println(); 
   
   // 1.2 The same variable now refers to a Motorcycle object
   System.out.println("MOTORCYCLE");
   
   vehicle  = new Motorcycle ("Suzuki", "Burgman Street 125 EX", 2024 , "4-stroke, single-cylinder, air-cooled, fuel-injected (SEP engine), 124cc");
   vehicle.displayInfo();
  
   System.out.println(); 
   
   //DEMO 2 : One method accepts different vehicle sub is class-
   System.out.println("\n===2 METHOD PARAMETER==="); 
   
   Truck truck  = new Truck ("Isuzu", "NHR", 2024 , 4);
   Motorcycle motor  = new Motorcycle ("Suzuki", "Burgman Street 125 EX", 2024 , "4-stroke, single-cylinder, air-cooled, fuel-injected (SEP engine), 124cc");
      printDetails(motor);
   
   
   System.out.println(); 

   //DEMO 3 :  One  holds different  Vehicle sub is class
   System.out.println("\n===3. POLYMORPHIC ARRAY===");
   
   Vehicle [] vehicles = {new Car ("Toyota", "Vios", 2023 , 4), 
                       new Truck ("Isuzu", "NHR", 2024 , 4), 
                       new Motorcycle ("Suzuki", "Burgman Street 125 EX", 2024 , "4-stroke, single-cylinder, air-cooled, fuel-injected (SEP engine), 124cc") };
                       
                       for (Vehicle currentVehicle: vehicles){
                       printDetails(currentVehicle);
                       System.out.println();
                       }
   
   
   
   }
 }
