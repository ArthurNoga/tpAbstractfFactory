package domaine;

public abstract class Velo {

    private String marque;
    private String modele;
    private int prix;


    public Velo(String marque, String modele, int prix) {

        this.marque = marque;
        this.modele = modele;
        this.prix = prix;

    }

    @Override
    public String toString() { return marque + " " + modele + " (" + prix ;}}/*+ ".- + " + new Marge() + " + " + new TauxTva() + ") ==> " + (int)((prix+((double)prix*new Marge().getMarge()/100))*(100+new TauxTva().getTaux())/100) + ".-"; }
}*/