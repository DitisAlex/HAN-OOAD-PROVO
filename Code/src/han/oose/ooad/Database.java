package han.oose.ooad;

import java.util.ArrayList;
import java.util.List;


public class Database {
    private final List<Student> studentList = new ArrayList<>();
    private final List<Vraag> vragenList = new ArrayList<>();

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
        MeerkeuzeVraag v1= new MeerkeuzeVraag("What type of animal is at the centre of the film Racing Stripes?");
        MeerkeuzeVraagAntwoord v1a1 = new MeerkeuzeVraagAntwoord(true,"Zebra", "A");
        MeerkeuzeVraagAntwoord v1a2 = new MeerkeuzeVraagAntwoord(false,"Horse", "B");
        MeerkeuzeVraagAntwoord v1a3 = new MeerkeuzeVraagAntwoord(false,"Donkey", "C");
        MeerkeuzeVraagAntwoord v1a4 = new MeerkeuzeVraagAntwoord(false,"Manatee", "D");

        addAntwoorden(v1, v1a1, v1a2, v1a3, v1a4);

        // Vraag 2:
        MeerkeuzeVraag v2 = new MeerkeuzeVraag("In 2007, which film topped the list of the American Film Institute`s top 100 films of all time?");
        MeerkeuzeVraagAntwoord v2a1 = new MeerkeuzeVraagAntwoord(false,"The Dark Knight", "A");
        MeerkeuzeVraagAntwoord v2a2 = new MeerkeuzeVraagAntwoord(false,"Star Wars The Phantom Menance", "B");
        MeerkeuzeVraagAntwoord v2a3 = new MeerkeuzeVraagAntwoord(true,"Citizen Kane", "C");
        MeerkeuzeVraagAntwoord v2a4 = new MeerkeuzeVraagAntwoord(false,"Blade Runner", "D");

        addAntwoorden(v2, v2a1, v2a2, v2a3, v2a4);

        // Vraag 3:
        KortAntwoordVraag v3 = new KortAntwoordVraag("Which is the only dwarf that never speaks in Snow White And The Seven Dwarfs?");
        KortAntwoordVraagAntwoord v3a1 = new KortAntwoordVraagAntwoord("Dopey");
        KortAntwoordVraagAntwoord v3a2 = new KortAntwoordVraagAntwoord("Stoetel");

        List<KortAntwoordVraagAntwoord> vraag3Antwoorden = new ArrayList<>();
        vraag3Antwoorden.add(v3a1);
        vraag3Antwoorden.add(v3a2);

        v3.setAntwoorden(vraag3Antwoorden);
        vragenList.add(v3);

        // Vraag 4:
        KortAntwoordVraag v4 = new KortAntwoordVraag("At the end of the 2005/06 Premiership season, which football team had the stadium with the highest capacity?");
        KortAntwoordVraagAntwoord v4a1 = new KortAntwoordVraagAntwoord("Manchester United");
        KortAntwoordVraagAntwoord v4a2 = new KortAntwoordVraagAntwoord("Old Trafford");

        List<KortAntwoordVraagAntwoord> vraag4Antwoorden = new ArrayList<>();
        vraag4Antwoorden.add(v4a1);
        vraag4Antwoorden.add(v4a2);

        v4.setAntwoorden(vraag4Antwoorden);
        vragenList.add(v4);

        // Vraag 5:
        JuistOnjuistVraag v5 = new JuistOnjuistVraag("Does a bee have 5 eyes?");
        JuistOnjuistVraagAntwoord a1 = new JuistOnjuistVraagAntwoord("true");
        v5.setAntwoord(a1);

        vragenList.add(v5);

        return vragenList;
    }

    private void addAntwoorden(MeerkeuzeVraag v1, MeerkeuzeVraagAntwoord v1a1, MeerkeuzeVraagAntwoord v1a2, MeerkeuzeVraagAntwoord v1a3, MeerkeuzeVraagAntwoord v1a4) {
        List<MeerkeuzeVraagAntwoord> vraag1Antwoorden = new ArrayList<>();
        vraag1Antwoorden.add(v1a1);
        vraag1Antwoorden.add(v1a2);
        vraag1Antwoorden.add(v1a3);
        vraag1Antwoorden.add(v1a4);

        v1.setAntwoorden(vraag1Antwoorden);
        vragenList.add(v1);
    }

    public boolean getLokalen(int lokaalnummer){
        return lokaalnummer == 123;
    }
}
