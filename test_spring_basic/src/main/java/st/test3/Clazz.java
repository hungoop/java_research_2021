package st.test3;

import java.util.List;

public class Clazz {
    private Student student;
    private List<Student> students;

    public Clazz(Student student) {
        this.student = student;
    }

    public Clazz(List<Student> students) {
        this.students = students;
    }

    public Student getStudent() {
        return student;
    }

    public List<Student> getStudents() {
        return students;
    }

}
