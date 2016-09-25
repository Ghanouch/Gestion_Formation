/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Methodes;
import Gestion.Ajouter_etd;
import Gestion.Authentification_admin;
import Gestion.Etudiants;
import classes.Administrateur;
import classes.Departement;
import classes.Enseignant;
import classes.Etudiant;
import classes.Filiere;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Youness
 */
public class Traitement {
    String log="";
    Connection cnx;
    public void Ajouter_etd(Etudiant e) {
        try {
            cnx = DriverManager.getConnection("jdbc:mysql:3306//localhost/gestionformation", "root", "i");
            Statement st = cnx.createStatement();
            st.executeUpdate("insert into etudiant(cne,cin,nom,prenom,adresse,tel,email,login,mot_de_passe,filiere) "
                    + "values('"+e.getCne()+"','"+e.getCin()+"','"+e.getNom()+"','"+e.getPrenom()+"','"+e.getAdresse()+"',"
                    + "'"+e.getTel()+"','"+e.getEmail()+"','"+e.getCin()+"','"+e.getCne()+"','"+e.getFiliere()+"');");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void Ajouter_ens(Enseignant ens){
        try {
            cnx = DriverManager.getConnection("jdbc:mysql://localhost/gestionformation", "root", "i");
            Statement st = cnx.createStatement();
            st.executeUpdate("insert into enseignant(ppr,cin,login,mot_de_passe,nom,prenom,Email,Tel,departement) "
                    + "values ('"+ens.getPpr()+"','"+ens.getCin()+"','"+ens.getPpr()+"','"+ens.getCin()+"',"
                    + "'"+ens.getNom()+"','"+ens.getPrenom()+"','"+ens.getEmail()+"','"+ens.getTel()+"','"+ens.getD()+"');");
                   
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    
    }
    
    public void Ajouter_departement(Departement d){
        try {
            cnx = DriverManager.getConnection("jdbc:mysql://localhost/gestionformation", "root", "i");
            Statement st = cnx.createStatement();
            st.executeUpdate("insert into departement(libelle,chef_departement) values('"+d.getLibelle()+"', '"+d.getChef_dept()+"');");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void Ajouter_filiere(Filiere f){
        
        try {
            cnx = DriverManager.getConnection("jdbc:mysql://localhost/gestionformation", "root", "i");
            Statement st = cnx.createStatement();
            st.executeUpdate("insert into filiere(libelle,departement) values "
                    + "('"+f.getLibelle()+"', '"+f.getD()+"');");
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
        }
    
    
    }
    
    public boolean SeConnecter(Etudiant e){
        boolean con = false;
         Statement st; ResultSet rs; 
        
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/gestionformation", "root", "i");
            st = cn.createStatement();
            rs = st.executeQuery("select * from etudiant where login = '"+e.getCin()+"';");
            
            if(rs.next()){
                con=true;
                log=e.getCin();
            }
            else{
                con=false;
            }
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } 
        return con;
       
    }
  
}
