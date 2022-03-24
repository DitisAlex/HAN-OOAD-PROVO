package han.oose.ooad;

import java.util.List;

public class Kennistoets {
    private int id;
    private List<Vraag> vragen;

    public Kennistoets(int id, List<Vraag> vragen) {
        this.id = id;
        this.vragen = vragen;
    }

    public int vragenAantal() { return vragen.size();}

    public Vraag getVraag(int vraagnummer) {
        return vragen.get(vraagnummer);
    }

    public void displayVraag(int vraagnummer) {
        vragen.get(vraagnummer).displayVraag();
    }
}
