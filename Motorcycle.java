public class Motorcycle extends Vehicle implements Serviceable{
      
      private String EngineType;
      
      public Motorcycle(
      String brand, 
      String model, 
      int year,
      String EngineType)
      
      {
       super(brand, model, year);
       this.EngineType = EngineType;
      }
      
      @Override
      public void displayInfo(){
            super.displayInfo();
            System.out.println("Engine: " + EngineType);
      }
      
      
      @Override
      public void moveForward(){
        System.out.println("A motorcycle moves forward.");
      }

      @Override
      public void moveBackward(){
        System.out.println("A motorcycle moves backward.");
      }
      
      @Override
      public void moveLeft(){
        System.out.println("A motorcyle moves left.");
      }
      
      @Override
      public void moveRight(){
        System.out.println("A motorcycle moves right.");
      }

      @Override
      public void service(){
        System.out.println("Motorcycle : inspect tires and brakes.");
      }
      
      
}