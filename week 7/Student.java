public class Student extends Person {
    private String rollNo;
    private String subject;
    public Student(String name, int age,String rollNo, String subject) {
        super(name, age);
        this.rollNo = rollNo;
        this.subject = subject;

    }
    public String getRollNo() {
        return rollNo;
    }
    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    @Override
    public String toString() {
        System.out.println("Student : ");
        return super.toString() + " Roll No : " + rollNo + " Subject : " + subject;
    }
    @Override
    public boolean equals(Object o) {
        Student student = (Student) o;
        return  student.getSubject().equals(subject);
    }
}
