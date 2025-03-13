public class demo {
    public static void main(String[] args) {
        pc p = new pc("001", "Lenovo", "8GB", "256GB");
        lab labs = new lab("CS Lab", p);
        person departmentHead = new person("Dr. Smith", "HOD");
        Department department = new Department("Computer Science", departmentHead, labs, p);
		
        campus campuss = new campus("COMSATS", department, labs, p);
        campuss.campusdisplay();
    }
}