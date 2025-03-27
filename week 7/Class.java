public class Class {
    String classname;
    String classCode;
    private int counter=0;
    Teacher teacher;
    Student[] student = new Student[5];
    public Class(String className, String classCode, Teacher teacher) {
        this.classname = className;
        this.classCode = classCode;
        this.teacher = teacher;
        for(int i = 0; i < student.length; i++){
            student[i]=null;
        }
    }
    public void addstudent(Student s,int index){
        student[index]=s;
        counter++;
    }
    public boolean isfull(){
        System.out.println("Full Class");
        return counter==student.length;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(classname);
        sb.append(classCode);
        sb.append(teacher.toString());
        for(int i = 0; i < student.length; i++) {
            if(student[i]!=null){
                sb.append(student[i].toString());
            }
        }
        return sb.toString();
    }

}