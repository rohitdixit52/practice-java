interface Serviceable { 

    double serviceCost();

}

 class CarService implements Serviceable{

    public double serviceCost(){
        return 2500;
    }
 }
  

 class BikeService implements Serviceable{

    public double serviceCost(){
        return 2000;
    }
 }

 class TruckService implements Serviceable{

    public double serviceCost(){
        return 4000;
    }
 }
 
    
 
  
public class ServiceCenterDemo {
    public static void main(String[] args) {
         Serviceable[] services = { new CarService(), new BikeService(), new TruckService() };

        for (Serviceable s : services) {
            System.out.println(s.getClass().getSimpleName() + " cost: ₹" + s.serviceCost());
        }
    }
}
