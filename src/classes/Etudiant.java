/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

/**
 *
 * @author Youness
 */
public class Etudiant {
    private int cne;
    private String cin;
    private String nom;
    private String prenom;
    private String email;
    private String tel;
    private String adresse;
    private String filiere;

    public Etudiant() {
   
    }

    public Etudiant(int cne, String cin, String nom, String prenom, String email, String tel, String adresse, String filiere) {
        this.cne = cne;
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.tel = tel;
        this.adresse = adresse;
        this.filiere = filiere;
    }

    public int getCne() {
        return cne;
    }
    
    public String toString()
    {
    return " HELLO I AM "+this.prenom;
    }

    public void setCne(int cne) {
        this.cne = cne;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }
    

    
    
    
}
