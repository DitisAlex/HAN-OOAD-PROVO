package han.oose.ooad;

import java.util.ArrayList;
import java.util.List;


public class Database {
    private List<Student> studentList = new ArrayList<>();
    private List<Vraag> vragenList = new ArrayList<>();

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
        // Vraag 1:
        MeerkeuzeVraag v1= new MeerkeuzeVraag("Wat is het beste?");
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
        vragenList.add(v1);

        // Vraag 2:
        MeerkeuzeVraag v2 = new MeerkeuzeVraag("Wat is het beste?");
        MeerkeuzeVraagAntwoord v2a1 = new MeerkeuzeVraagAntwoord(false,"Antwoord A", "A");
        MeerkeuzeVraagAntwoord v2a2 = new MeerkeuzeVraagAntwoord(false,"Antwoord B", "B");
        MeerkeuzeVraagAntwoord v2a3 = new MeerkeuzeVraagAntwoord(true,"Antwoord C", "C");
        MeerkeuzeVraagAntwoord v2a4 = new MeerkeuzeVraagAntwoord(false,"Antwoord D", "D");

        List<MeerkeuzeVraagAntwoord> vraag2Antwoorden = new ArrayList<>();
        vraag2Antwoorden.add(v2a1);
        vraag2Antwoorden.add(v2a2);
        vraag2Antwoorden.add(v2a3);
        vraag2Antwoorden.add(v2a4);

        v2.setAntwoorden(vraag2Antwoorden);
        vragenList.add(v2);

        return vragenList;
    }

    public boolean getLokalen(int lokaalnummer){
        if(lokaalnummer == 123){
            return true;
        } else {
            return false;
        }
    }
}
