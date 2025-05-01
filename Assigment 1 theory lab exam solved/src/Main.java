public class Main{
    public static void main(String[] args){
        Supervisor supervisor = new Supervisor("Dr ayesha",5);
        ParkingSystem system = ParkingSystem.getInstance("CUI LAHORE", supervisor);
        ParkingSystem secondattempt = ParkingSystem.getInstance("Should not work",supervisor);
        ParkingZone zone1 = new ParkingZone();
        ParkingZone zone2 = new ParkingZone();
        Owner owner1 = new Owner("Ali");
        Owner owner2 = new Owner("zara");
        //System.out.println(owner1);
        //System.out.println(owner2);
        //owner1.display();
        vehicle v1= new vehicle("LEA123","Car",owner1);
        vehicle v2= new vehicle("LEA345","Bike",owner2);
        vehicle v3= new vehicle("LEA123","Car",owner1);
        zone1.addvehicle(v1);
        zone1.addvehicle(v2);
        zone1.addvehicle(v3);
        system.addzone(zone1);
        system.addzone(zone2);
        PermitHolder ph1 = new PermitHolder("Sara");
        PermitHolder ph2 = new PermitHolder("Hassan");
        system.addpermit(ph1);
        system.addpermit(ph2);
        System.out.println(system);




    }
}