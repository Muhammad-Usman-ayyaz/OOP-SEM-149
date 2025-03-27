public class School {
    String name;
    String address;
    Class[] classes;
    Principal principal;
    public School(String name, String address, Class[] classes,Principal principal) {
        this.name = name;
        this.address = address;
        this.classes = classes;
        this.principal = principal;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("School [name=");
        builder.append(name);
        builder.append(", address=");
        builder.append(address);
        builder.append(", classes=");
       for(Class c : classes) {
           builder.append(c.toString());
       }
        builder.append(", principal=");
        builder.append(principal);
        builder.append("]");
        return builder.toString();
    }


}
