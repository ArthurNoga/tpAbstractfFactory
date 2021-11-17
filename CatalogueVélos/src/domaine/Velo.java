package domaine;

public class Velo {
    private String type;
    private String marque;
    private String modele;
    private int prix;
    private String rouesOuCadre;

    public Velo(String type, String marque, String modele, int prix, String rouesOuCadre) {
        this.type = type;
        this.marque = marque;
        this.modele = modele;
        this.prix = prix;
        this.rouesOuCadre = rouesOuCadre;
    }

    @Override
    public String toString() { return marque + " " + modele + " (" + prix + ".- + " + new Marge() + " + " + new TauxTva() + ") ==> " + (int)((prix+((double)prix*new Marge().getMarge()/100))*(100+new TauxTva().getTaux())/100) + ".-"; }
}