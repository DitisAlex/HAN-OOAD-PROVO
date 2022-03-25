package han.oose.ooad;

import java.util.List;

public class Lokaal {
    private int lokaalNummer = 123;
    private Database db = new Database();
    private List<Student> studentList = db.getStudent();
    private List<Vraag> vragen = db.getVragen();

    public void meldAan(String naam, int lokaal){
        if(lokaal == lokaalNummer){
            voegToeAanLokaal(naam);

            Kennistoets kennistoets = new Kennistoets(lokaalNummer, vragen);
            UitvoeringKennistoets nieuweToets = new UitvoeringKennistoets(kennistoets);
            //TODO: how to actually load uitvoeringKennisToets
            nieuweToets.speelKennistoets();
        } else {
            //TODO: Betere error handling toevoegen dan alleen restarten (maybe room opnieuw kunnen invoeren zoals op provo.java?)
            System.out.println("\nRoom doesn't exist, signing user out...");
        }
    }

    public void voegToeAanLokaal(String naam){
        Student student = new Student(naam);
        studentList.add(student);
    }
}
