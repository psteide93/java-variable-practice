class App {
  public static void main(String args[]){
    String vin = "1_258_874";
    String vehicleMake = "Ford";
    String vehicleModel = "F-150";
    String vehicleColor = "blue";
    boolean towingPackage = true;
    int odom = 157_845;
    int price = 10_000;
    char quality = 'C'; 

    System.out.println(vin);
    System.out.println(String.format("The make of my %s vehcie is %s and it's a %s",vehicleColor,vehicleMake,vehicleModel));
    System.out.println(odom);
    System.out.println(price);
    System.out.println(String.format("The quality of my vehicle is %c",quality));
    System.out.println(towingPackage);
    
  }
}
