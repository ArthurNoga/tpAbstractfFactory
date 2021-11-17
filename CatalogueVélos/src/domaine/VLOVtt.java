package domaine;

public class VLOVtt extends Velo{
    private String StyleCadre;

    public VLOVtt(String marque, String modele, int prix, String styleCadre) {
        super(marque, modele, prix);
        StyleCadre = styleCadre;
    }
}
