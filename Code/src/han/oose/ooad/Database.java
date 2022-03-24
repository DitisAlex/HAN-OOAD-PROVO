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

    public List<Vraag> getVragen() {
        List<Vraag> vragenToets = new ArrayList<>();

        MeerkeuzeVraag v1= new MeerkeuzeVraag("Wat is het beste?", "A");
        MeerkeuzeVraagAntwoord v1a1 = new MeerkeuzeVraagAntwoord(true,"Antwoord A", "A");
        MeerkeuzeVraagAntwoord v1a2 = new MeerkeuzeVraagAntwoord(false,"Antwoord B", "B");
        MeerkeuzeVraagAntwoord v1a3 = new MeerkeuzeVraagAntwoord(false,"Antwoord C", "C");
        MeerkeuzeVraagAntwoord v1a4 = new MeerkeuzeVraagAntwoord(false,"Antwoord D", "D");

        List<MeerkeuzeVraagAntwoord> vraag1Antwoorden = new ArrayList<>();
        vraag1Antwoorden.add(v1a1);
        vraag1Antwoorden.add(v1a2);
        vraag1Antwoorden.add(v1a3);
        vraag1Antwoorden.add(v1a4);

        v1.setAntwoorden(vraag1Antwoorden);
        vragenToets.add(v1);

        return vragenToets;
    }
}
