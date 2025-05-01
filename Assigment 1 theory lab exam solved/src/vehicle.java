public class vehicle{
    public String LicencePlate;
    public String type;
    Owner owner ;
    public vehicle(String LicencePlate,String type ,Owner owner){
        this.LicencePlate=LicencePlate;
        this.type=type;
        this.owner=owner;
    }
    public Owner sharedowner(Owner o){
        owner=o;
        return owner;
    }
    public Owner deepcopy(Owner o){
        return new Owner(o.getname());
    }
    @Override
    public String toString() {
        return "License Plate: " + LicencePlate + ", Type: " + type + ", " + owner.toString();
    }
}