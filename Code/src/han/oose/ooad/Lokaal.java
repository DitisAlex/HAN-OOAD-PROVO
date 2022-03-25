package han.oose.ooad;

import java.util.List;

public class Lokaal {
    private int lokaalNummer;
    private Database db = new Database();
    private List<Student> studentList = db.getStudent();
    private List<Vraag> vragen = db.getVragen();

    public Lokaal(int lokaalNummer){
        this.lokaalNummer = lokaalNummer;
    }

    public void meldAan(String naam){
            voegToeAanLokaal(naam);

            Kennistoets kennistoets = new Kennistoets(lokaalNummer, vragen);
            UitvoeringKennistoets nieuweToets = new UitvoeringKennistoets(kennistoets);

            nieuweToets.speelKennistoets();
    }

    public void voegToeAanLokaal(String naam){
        Student student = new Student(naam);
        studentList.add(student);
    }
}
