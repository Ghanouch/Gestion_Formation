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
public class Filiere {
    private int id_fil;
    private String libelle;
    private String d;

    public Filiere() {
    }

    public Filiere(int id_fil, String libelle, String d) {
        this.id_fil = id_fil;
        this.libelle = libelle;
        this.d = d;
    }

    public int getId_fil() {
        return id_fil;
    }

    public void setId_fil(int id_fil) {
        this.id_fil = id_fil;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }
    
    

    
    
    
}
