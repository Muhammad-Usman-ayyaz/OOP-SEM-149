public class ParkingSystem{
    public String Campusname;
    public static int c=0;
    public static int c1=0;
    Supervisor s;
    public static ParkingSystem instance;
    ParkingZone[] parkingzones=new ParkingZone[2];
    PermitHolder[] permitholders = new PermitHolder[2];
    public ParkingSystem(String Campusname,Supervisor s){
        this.Campusname=Campusname;
        this.s=s;

    }
    public static ParkingSystem getInstance(String campusName, Supervisor s) {
        if (instance == null) {
            instance = new ParkingSystem(campusName, s);
        } else {
            System.out.println("Warning: ParkingSystem instance already exists. Returning existing instance.");
        }
        return instance;
    }
    public void addzone(ParkingZone z){
        parkingzones[c]=z;
        c++;

    }
    public void addpermit(PermitHolder x){
        permitholders[c1]=x;
        c1++;

    }
    @Override
    public String toString(){
        System.out.println("Campus: " + Campusname);
        System.out.println(s);
        System.out.println("Zones: [");
        for(int i = 0; i < parkingzones.length ; i++){
            parkingzones[i].toString();
        }
        System.out.println("]");
        System.out.print("Permit Holders: " );
        for(int i = 0 ; i < permitholders.length ; i++){
            System.out.print(permitholders[i]);
            if (i < permitholders.length - 1) System.out.print(", ");
        }

        return "";


    }
}