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
    private Marge marge;
    private TauxTva tva;

    public void setMarge(Marge marge) {
        this.marge = marge;
    }

    public void setTva(TauxTva tva) {
        this.tva = tva;
    }

    @Override
    public String toString() { return marque + " " + modele + " (" + prix + ".- + " + marge+ " + " +tva+ ") ==> " + (int)((prix+((double)prix*marge.getMarge()/100))*(100+tva.getTaux())/100) + ".-"; }
}