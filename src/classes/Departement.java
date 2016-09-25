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
public class Departement {
    
    private int id_dept;
    private String libelle;
    private String chef_dept;

    public Departement() {
    }

    public Departement(int id_dept, String libelle, String chef_dept) {
        this.id_dept = id_dept;
        this.libelle = libelle;
        this.chef_dept = chef_dept;
    }

    public int getId_dept() {
        return id_dept;
    }

    public void setId_dept(int id_dept) {
        this.id_dept = id_dept;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getChef_dept() {
        return chef_dept;
    }

    public void setChef_dept(String chef_dept) {
        this.chef_dept = chef_dept;
    }
    
    

    
    
    
}
