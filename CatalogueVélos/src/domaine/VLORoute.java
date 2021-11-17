package domaine;

public class VLORoute extends Velo {
    private String nomDesRoues;

    public VLORoute(String marque, String modele, int prix, String nomDesRoues) {
        super(marque, modele, prix);
        this.nomDesRoues = nomDesRoues;
    }
}
