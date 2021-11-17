package dao;

import domaine.Velo;
import metier.VLOFactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BikeDao {
    private static final String FILENAME = "ListeVelos.csv";

    public static List<Velo> listeVelos(String magasin) throws IOException {
        try {
            BufferedReader reader  = new BufferedReader(new FileReader(FILENAME));
            List<Velo> aLst = new ArrayList<>();
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                VLOFactory.CreateVelo(ligne);
               /* aLst.add(new Velo(type, marque, modele, prix, rouesOuCadre));*/
            }
            reader.close();
            return aLst;
        } catch (IOException e) {  e.printStackTrace(); return null; }
    }
}