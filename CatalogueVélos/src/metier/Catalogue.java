package metier;

import dao.BikeDao;
import domaine.Velo;

public class Catalogue {
    public void afficherListePrix(String magasin) {
        System.out.println("Liste de prix " + magasin + " :");
        for (Velo velo : BikeDao.listeVelos(magasin)) { System.out.println(velo); }
    }
}