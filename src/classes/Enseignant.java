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
public class Enseignant {
    private int ppr;
    private String cin;
    private String nom;
    private String prenom;
    private String email;
    private String tel;
    private String adresse;
    private String d;

    public Enseignant() {
    }

    public Enseignant(int ppr, String cin, String nom, String prenom, String email, String tel, String adresse, String d) {
        this.ppr = ppr;
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.tel = tel;
        this.adresse = adresse;
        this.d = d;
    }

    public int getPpr() {
        return ppr;
    }

    public void setPpr(int ppr) {
        this.ppr = ppr;
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

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }
    

   
    
    
}
