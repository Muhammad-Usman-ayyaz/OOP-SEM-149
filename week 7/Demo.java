public class Demo {
    public static void main(String[] args) {
        Principal P = new Principal("Saad", 67, 15);
        Student student1 = new Student("Uzi", 18, "001", "CS");
        Student student2 = new Student("Asd", 18, "002", "Expo");
        Student student3 = new Student("Ibrahi", 18, "003", "Maths");
        Student student4 = new Student("Usman", 18, "004", "Science");

        // Declare and initialize teachers
        Teacher teacher1 = new Teacher("Usman", 30, "Maths", "2783");
        Teacher teacher2 = new Teacher("Ali", 35, "Physics", "4567");

        // Initialize classes
        Class[] classes = new Class[2];
        classes[0] = new Class("Grade 10", "009", teacher1);
        classes[1] = new Class("Grade 11", "088", teacher2);

        // Add students
        classes[0].addstudent(student1, 0);
        classes[0].addstudent(student2, 1);
        classes[0].addstudent(student3, 2);
        classes[0].addstudent(student4, 3);

        classes[1].addstudent(student1, 0);
        classes[1].addstudent(student2, 1);
        classes[1].addstudent(student3, 2);
        classes[1].addstudent(student4, 4);

        // Print details
        System.out.println(student1.toString());
        System.out.println(student2.equals(student1));

        School school = new School("City School", "293 Main Street", classes, P);
        System.out.println(school.toString());
    }
}