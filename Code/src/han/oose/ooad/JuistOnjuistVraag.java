package han.oose.ooad;

import java.util.List;

public class JuistOnjuistVraag extends Vraag {
    private JuistOnjuistVraagAntwoord antwoord;

    public JuistOnjuistVraag(String vraag) {
        super(vraag);
    }

    @Override
    public void displayVraag() {
        System.out.println("\n[True or False Question]: " +  vraag);
    }

    @Override
    public boolean isGegevenAntwoordCorrect(String gegevenAntwoord) {
        if(antwoord.isGegevenAntwoordCorrect(gegevenAntwoord)) {
            return true;
        } else {
            return false;
        }
    }

    public void setAntwoord(JuistOnjuistVraagAntwoord antwoord) {
        this.antwoord = antwoord;
    }
}