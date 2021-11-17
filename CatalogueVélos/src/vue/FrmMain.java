package vue;

import metier.Catalogue;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmMain extends JFrame {
    private JPanel panel;
    private JButton btnCatalogue;
    private JRadioButton rbBikeImportGeneve;
    private JRadioButton rbBikeShopGeneve;
    private JRadioButton rbBikeShopAnnemasse;
    private ButtonGroup grpMagasin = new ButtonGroup();

    public FrmMain() {
        setType(Type.UTILITY); setContentPane(panel); setTitle("Catalogue vélo"); pack();
        setLocationRelativeTo(null); setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        grpMagasin.add(rbBikeImportGeneve); grpMagasin.add(rbBikeShopGeneve); grpMagasin.add(rbBikeShopAnnemasse);

        btnCatalogue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String magasin = null;
                switch (grpMagasin.getSelection().getActionCommand()) {
                    case "BikeImportGeneve": magasin = "BikeImportGeneve"; break;
                    case "BikeShopGeneve": magasin = "BikeShopGeneve"; break;
                    case "BikeShopAnnemasse": magasin = "BikeShopAnnemasse"; break;
                }
                new Catalogue().afficherListePrix(magasin);
            }
        });
    }
}