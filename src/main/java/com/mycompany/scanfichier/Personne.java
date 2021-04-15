/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.scanfichier;

/**
 *
 * @author nelsonrogers
 */
public class Personne {
    int id;
    String nom;
    String prenom1;
    String prenom2;
    String prenom3;
    String sexe;
    String dateNaiss;
    String codeLieuNaiss; //code postal
    String communeNaiss;
    String paysNaiss;

    public Personne(int id, String nom, String prenom1, String prenom2, String prenom3, String sexe, String dateNaiss, String codeLieuNaiss, String communeNaiss, String paysNaiss) {
        this.id = id;
        this.nom = nom;
        this.prenom1 = prenom1;
        this.prenom2 = prenom2;
        this.prenom3 = prenom3;
        this.sexe = sexe;
        this.dateNaiss = dateNaiss;
        this.codeLieuNaiss = codeLieuNaiss;
        this.communeNaiss = communeNaiss;
        this.paysNaiss = paysNaiss;
    }
    
    
    
}
