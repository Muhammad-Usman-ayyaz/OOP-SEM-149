public class ParkingZone{
    public static int id=1;
    public static int counter=0;
    vehicle[] vehicles = new vehicle[5];
    public void addvehicle(vehicle v){
        if (doesexsist(v)) {

            return;
        }
        if (counter < vehicles.length) {
            vehicles[counter] = v;
            counter++;
            System.out.println("vehicle added ");
        } else {
            System.out.println("Zone full ");
            id++;
        }
    }
    public boolean doesexsist(vehicle v){
        for(int i=0 ; i <vehicles.length ; i++ ){
            if(vehicles[i]!= null && vehicles[i].LicencePlate.equals(v.LicencePlate)){
                System.out.println("acces denied same plate");
                return true;
            }

        }
        return false;
    }
    @Override
    public String toString() {
        System.out.print("Zone ID: Z" + id + ", Vehicles: [");
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] != null) {
                System.out.print(vehicles[i]);
            } else {
                System.out.print("null");
            }
            if (i < vehicles.length - 1) System.out.print(", ");
        }
        System.out.println("]");
        return "";
    }

}