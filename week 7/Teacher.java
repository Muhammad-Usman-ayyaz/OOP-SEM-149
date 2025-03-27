public class Teacher extends Person {
    private String subject ;
    private String id;
    public Teacher(String name, int age , String subject, String id) {
        super(name, age);
        this.subject = subject;
        this.id = id;

    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    @Override
    public String toString() {
        System.out.println("Teacher : ");
        return super.toString() + "Subject : " + subject + " ID : " + id;
    }
    @Override
    public boolean equals(Object o) {
        Teacher t = (Teacher) o;
        return t.getId().equals(id);

    }
}
