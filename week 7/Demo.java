

public class Demo {
    public static void main(String[] args) {
        Teacher teach1 = new Teacher("Mr.usman", 50,"cs","111");
        Teacher teach2 = new Teacher("MS takreema", 30,"Expo","112");
        Principal P= new Principal("saad",67,15);
        Student student1 =new Student("uzi",18,"001","cs");
        Student student2 =new Student("asd",18,"002","expo");
        Student student3 =new Student("ibrahi",18,"003","maths");
        Student student4 =new Student("usman",18,"004","science");
        Class[] classes = new Class[2];
        classes[0]=new Class("garde 10","009",new Teacher("Usman",30,"Maths","2783"));
        classes[0].addstudent(student1,0);
        classes[0].addstudent(student2,1);
        classes[0].addstudent(student3,2);
        classes[0].addstudent(student4,3);
        student2.equals(student1);

        classes[1]=new Class("garde 11","088",teach2);
        classes[1].addstudent(student1,1);
        classes[1].addstudent(student2,2);
        classes[1].addstudent(student3,3);
        classes[1].addstudent(student4,4);
        School school = new School("City school ", "293 main street",classes,P);
        school.toString();


    }
}
