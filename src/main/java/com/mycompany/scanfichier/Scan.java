/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.scanfichier;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nelsonrogers
 */
public class Scan {
    
    
    public static void main(String[] args) {
        
        ArrayList<Personne> personnes = new ArrayList<>();
        Personne client1 = new Personne(1, "Claudel", "Jules", "Valery", null, "1", "20010512", "74270", "Chassenaz", "France");
        Personne client2 = new Personne(2, "Meyer", "Pierre", "Paul", null, "1", "19291218", "68368", "Wihr-au-Val", "France");
        Personne client3 = new Personne(3, "VANDELLE", "MARIE", "CLAUDE", null, "2", "19310313", "39297", "LONGCHAUMOIS", "France");
        Personne client4 = new Personne(4, "VANDELLE", "MARIE", "CLAUDE", "Jean", "2", "19310313", "39297", "LONGCHAUMOIS", "France");

        
        personnes.add(client1);
        personnes.add(client2);
        personnes.add(client3);
        personnes.add(client4);
        
        
        try {
            File fichierDeces = new File("/Users/nelsonrogers/Desktop/deces-2021-m02.txt");
            Scanner myReader = new Scanner(fichierDeces);
            String data = "";
            while (myReader.hasNextLine()) {
                data += myReader.nextLine();
            }
            for (Personne personne : personnes) {
            
                // La personne a forcément un prénom
                String ligne = personne.nom.toUpperCase() + "*" + personne.prenom1.toUpperCase();

                // si deuxième prénom
                if (personne.prenom2 != null) {
                    ligne += " " + personne.prenom2.toUpperCase();
                }
                //si troisième prénom
                if (personne.prenom3 != null) {
                    ligne += " " + personne.prenom3.toUpperCase();
                }

                // fin des prénoms
                ligne += "/";


                int longueur = ligne.length();

                // on complète par des espaces jusqu'à la position 81
                int nbEspaces = 80-longueur;
                for (int i=0 ; i < nbEspaces ; i++) {
                    ligne += " ";
                }


                ligne += personne.sexe + personne.dateNaiss + personne.codeLieuNaiss + personne.communeNaiss.toUpperCase();



                // Si né à l'étranger ou DOM/TOM on le précise
                if (!personne.paysNaiss.toUpperCase().equals("FRANCE")) {
                    longueur = ligne.length();
                    nbEspaces = 124 - longueur;
                    for (int i=0 ; i<nbEspaces ; i++) {
                        ligne += " ";
                    }
                    ligne += personne.paysNaiss.toUpperCase();
                }

                System.out.println(ligne);

                System.out.println(data.contains(ligne));
        
            }
            
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        
        
  }
}
