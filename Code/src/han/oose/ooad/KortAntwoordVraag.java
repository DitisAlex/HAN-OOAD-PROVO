package han.oose.ooad;

import java.util.List;

public class KortAntwoordVraag extends Vraag {
    private List<KortAntwoordVraagAntwoord> antwoorden;

    public KortAntwoordVraag(String vraag) {
        super(vraag);
    }

    @Override
    public void displayVraag() {
        System.out.println("\n[Short Answer Question]: " +  vraag);
    }

    @Override
    public boolean isGegevenAntwoordCorrect(String gegevenAntwoord) {
        for(KortAntwoordVraagAntwoord antwoord : antwoorden) {
            if(antwoord.isGegevenAntwoordCorrect(gegevenAntwoord)) {
                return true;
            }
        }
        return false;
    }

    public void setAntwoorden(List<KortAntwoordVraagAntwoord> antwoorden) {
        this.antwoorden = antwoorden;
    }
}