package metier;

import dao.BikeDao;
import domaine.Velo;

import java.io.IOException;

public class Catalogue {
    public void afficherListePrix(String magasin) {
        System.out.println("Liste de prix " + magasin + " :");
        try {
            for (Velo velo : BikeDao.listeVelos(magasin)) { System.out.println(velo); }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}