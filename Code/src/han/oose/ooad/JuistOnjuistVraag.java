package han.oose.ooad;

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
        return antwoord.isGegevenAntwoordCorrect(gegevenAntwoord);
    }

    public void setAntwoord(JuistOnjuistVraagAntwoord antwoord) {
        this.antwoord = antwoord;
    }
}