package han.oose.ooad;

import java.util.ArrayList;
import java.util.List;


public class Database {
    private List<Student> studentList = new ArrayList<>();

    public Database(){
        genereerMockDatabase();
    }

    public void genereerMockDatabase(){
        Student studentA = new Student("Alex");
        Student studentB = new Student("Rowan");


        studentList.add(studentA);
        studentList.add(studentB);
    }
    public List<Student>  getStudent(){
        return studentList;
    }
}
