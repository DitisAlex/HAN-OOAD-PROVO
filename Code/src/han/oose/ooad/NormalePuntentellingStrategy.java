package han.oose.ooad;

public class NormalePuntentellingStrategy implements IScoreStrategy{
    @Override
    public int berekenScore(int aantalGoedeVragen, int speeltijd) {
        int maxTijdInSeconden = 15 * aantalGoedeVragen;

        if(aantalGoedeVragen > 0 && speeltijd < maxTijdInSeconden){
            return aantalGoedeVragen + (Math.round(maxTijdInSeconden / 5));
        } else {
            return aantalGoedeVragen;
        }
    }
}