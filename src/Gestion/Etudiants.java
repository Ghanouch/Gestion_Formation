/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gestion;

import classes.Etudiant;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import Gestion.Ajouter_etd;

/**
 *
 * @author Youness
 */
public class Etudiants extends javax.swing.JFrame {
    private DefaultTableModel Tetds;
    private Statement st7;
    private ResultSet r;
 

   
    public Etudiants() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    Ajouter_etd aj= new Ajouter_etd();
    
    
    public void vider(){
        
        text1.setText("");
            cin.setText(null);
            nom.setText(null);
            prenom.setText(null);
            filiere.setText(null);
            email.setText(null);
            tel.setText(null);
            adresse.setText(null);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        cne = new javax.swing.JLabel();
        cne1 = new javax.swing.JLabel();
        cne2 = new javax.swing.JLabel();
        cne3 = new javax.swing.JLabel();
        cne4 = new javax.swing.JLabel();
        cne5 = new javax.swing.JLabel();
        text1 = new javax.swing.JTextField();
        nom = new javax.swing.JTextField();
        prenom = new javax.swing.JTextField();
        tel = new javax.swing.JTextField();
        cin = new javax.swing.JTextField();
        adresse = new javax.swing.JTextField();
        cne6 = new javax.swing.JLabel();
        cne7 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        filiere = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        etudiants = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        gi = new javax.swing.JRadioButton();
        ma = new javax.swing.JRadioButton();
        igi = new javax.swing.JRadioButton();
        rtt = new javax.swing.JRadioButton();
        msg = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 153));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        cne.setText("CNE :");

        cne1.setText("CIN :");

        cne2.setText("Nom :");

        cne3.setText("Prénom :");

        cne4.setText("Tel :");

        cne5.setText("Adress :");

        cne6.setText("Filière:");

        cne7.setText("Email :");

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cne1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cne2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cne3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cne4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cne5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cne, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cne6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cne7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prenom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adresse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filiere, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cne, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text1))
                .addGap(10, 10, 10)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cne1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cin))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cne2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cne3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prenom))
                .addGap(13, 13, 13)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cne6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filiere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cne4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cne7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email))
                .addGap(12, 12, 12)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cne5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adresse))
                .addContainerGap())
        );
        jLayeredPane2.setLayer(cne, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(cne1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(cne2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(cne3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(cne4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(cne5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(text1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(nom, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(prenom, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(tel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(cin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(adresse, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(cne6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(cne7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(email, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(filiere, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setText("Supprimer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        etudiants.setBackground(new java.awt.Color(153, 255, 153));
        etudiants.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        etudiants.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etudiantsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(etudiants);

        jButton2.setText("Modifier");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Veuillez choisir une filiere", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        buttonGroup1.add(gi);
        gi.setText("GI");
        gi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giActionPerformed(evt);
            }
        });

        buttonGroup1.add(ma);
        ma.setText("MA");
        ma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maActionPerformed(evt);
            }
        });

        buttonGroup1.add(igi);
        igi.setText("IGI");
        igi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igiActionPerformed(evt);
            }
        });

        buttonGroup1.add(rtt);
        rtt.setText("RTT");
        rtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rttActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(gi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(igi, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ma)
                    .addComponent(rtt))
                .addGap(23, 23, 23))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gi)
                    .addComponent(ma))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(igi)
                    .addComponent(rtt)))
        );
        jLayeredPane3.setLayer(gi, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(ma, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(igi, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(rtt, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton3.setText("Accueil_admin");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));

        jButton4.setText("Ajouter");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                .addComponent(msg)
                .addGap(193, 193, 193)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 7, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLayeredPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(msg))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLayeredPane2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void etudiantsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etudiantsMouseClicked
        // TODO add your handling code here:
        Statement st;
        ResultSet rs; 
        
        try {
            int row = etudiants.getSelectedRow();
            String table_clic =(etudiants.getModel().getValueAt(row, 0).toString());
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/gestionformation", "root", "");
            st = cn.createStatement();
            rs = st.executeQuery("select * from etudiant where cin='"+table_clic+"';");
            if(rs.next()){
            String cne= rs.getString("cne");
            text1.setText(cne);
            String cin1= rs.getString("cin");
            cin.setText(cin1);
            String nom1= rs.getString("nom");
            nom.setText(nom1);
            String prenom1= rs.getString("prenom");
            prenom.setText(prenom1);
            String filiere1= rs.getString("filiere");
            filiere.setText(filiere1);
            
            String email1= rs.getString("Email");
            email.setText(email1);
            String tel1=rs.getString("Tel");
            tel.setText(tel1);
            String adresse1= rs.getString("adresse");
            adresse.setText(adresse1);
            
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_etudiantsMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          
        Statement st;   ResultSet rs; 
     try {
       
          Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/gestionformation", "root", "");
          st = cn.createStatement();
          int p = JOptionPane.showConfirmDialog(null, "Voulez vous vraiment supprimer ?", "Supression", JOptionPane.YES_NO_OPTION);
          if(p==0){
          st.executeUpdate("delete from etudiant where cne='"+text1.getText()+"';");
     JOptionPane.showMessageDialog(null,"Bon , Suppression effectuée .", "SUPPRESSION ",JOptionPane.INFORMATION_MESSAGE);
    vider();
     
          }
     
     }
     catch (Exception ex) {
             Logger.getLogger(Etudiants.class.getName()).log(Level.SEVERE, null, ex);
        }      
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
             Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/gestionformation", "root", "");
            Statement st = cn.createStatement();
            st.executeUpdate("update etudiant set cin='"+cin.getText()+"',cne='"+text1.getText()+"',nom='"+nom.getText()+"',prenom='"+prenom.getText()+"',Tel='"+tel.getText()+"',adresse='"+adresse.getText()+"'where cin='"+cin.getText()+"';");
            JOptionPane.showMessageDialog(null, "Bien modifié", "Modification", JOptionPane.INFORMATION_MESSAGE);
            vider();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void giActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giActionPerformed
        // TODO add your handling code here:
        vider();
        msg.setText("Liste des étudiants GI :");
         Tetds = new DefaultTableModel();
        Tetds.addColumn("CIN");
        Tetds.addColumn("CNE");
        Tetds.addColumn("Nom");
        Tetds.addColumn("Prenom");
        Tetds.addColumn("Filiere");
        Tetds.addColumn("Email");
        Tetds.addColumn("Tel");
        Tetds.addColumn("Adresse");
        etudiants.setModel(Tetds);
        int nb=0;
                 try {
             
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/gestionformation", "root", "");
            Tetds.setRowCount(0);
            st7 =cn.createStatement();

            r = st7.executeQuery("select * from etudiant where filiere='"+gi.getText()+"';");
            
            jLabel1.setText("");
            while (r.next()) {
                String acin = r.getString("cin");
                int acne = r.getInt("cne");
                String anom =r.getString("nom");
                String aprenom =r.getString("prenom");
                String filiere=r.getString("filiere");
                String email=r.getString("email");
                String atel = r.getString("Tel");
                String adr =r.getString("adresse");
                nb++;
             Etudiant E1= new Etudiant(acne,acin,anom,aprenom,email,atel,adr,filiere);
                System.out.println(E1);
                //Object[] tab = {r.getString("cin"), r.getInt("cne"), r.getString("nom"), r.getString("prenom"), r.getInt("Tel"), r.getString("adresse")};
             Object tab[] ={acin, acne, anom, aprenom, filiere, email, atel, adr};  
             Tetds.addRow(tab);
            }
           if(nb==0){ jLabel1.setText("Aucun etudiant"); }
        } catch (Exception e) {
            System.err.println(e.getMessage());
                    
        }
    }//GEN-LAST:event_giActionPerformed

    private void maActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maActionPerformed

        vider();
        msg.setText("Liste des étudiants MA :");
        Tetds = new DefaultTableModel();
        Tetds.addColumn("CIN");
        Tetds.addColumn("CNE");
        Tetds.addColumn("Nom");
        Tetds.addColumn("Prenom");
        Tetds.addColumn("Filiere");
        Tetds.addColumn("Email");
        Tetds.addColumn("Tel");
        Tetds.addColumn("Adresse");
        etudiants.setModel(Tetds);
        int nb=0;
                 try {
             
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/gestionformation", "root", "");
            Tetds.setRowCount(0);
            st7 =cn.createStatement();
            jLabel1.setText("");

            r = st7.executeQuery("select * from etudiant where filiere='"+ma.getText()+"';");
            
           

            while (r.next()) {
                String acin = r.getString("cin");
                int acne = r.getInt("cne");
                String anom =r.getString("nom");
                String aprenom =r.getString("prenom");
                String filiere=r.getString("filiere");
                String email=r.getString("email");
                String adr =r.getString("adresse");
                String atel = r.getString("Tel");
                nb++;
            
                //Object[] tab = {r.getString("cin"), r.getInt("cne"), r.getString("nom"), r.getString("prenom"), r.getInt("Tel"), r.getString("adresse")};
             Object tab[] ={acin, acne, anom, aprenom, filiere, email, atel, adr};  
             Tetds.addRow(tab);
            }
            if(nb==0){
                jLabel1.setText("Aucun etudiant");
            }
           
        } catch (Exception e) {
            
                    System.out.println(e.getMessage());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_maActionPerformed

    private void igiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igiActionPerformed
        
        vider();
        msg.setText("Liste des étudiants IGI :");
         Tetds = new DefaultTableModel();
        Tetds.addColumn("CIN");
        Tetds.addColumn("CNE");
        Tetds.addColumn("Nom");
        Tetds.addColumn("Prenom");
        Tetds.addColumn("Filiere");
        Tetds.addColumn("Email");
        Tetds.addColumn("Tel");
        Tetds.addColumn("Adresse");
        etudiants.setModel(Tetds);
        int nb=0;
        
                 try {
            jLabel1.setText("");
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/gestionformation", "root", "");
            Tetds.setRowCount(0);
            st7 =cn.createStatement();

            r = st7.executeQuery("select * from etudiant where filiere='"+igi.getText()+"';");
            

            while (r.next()) {
                String acin = r.getString("cin");
                int acne = r.getInt("cne");
                String anom =r.getString("nom");
                String aprenom =r.getString("prenom");
                String filiere=r.getString("filiere");
                String email=r.getString("email");
                String adr =r.getString("adresse");
                String atel = r.getString("Tel");
                
                nb++;
                
            
                //Object[] tab = {r.getString("cin"), r.getInt("cne"), r.getString("nom"), r.getString("prenom"), r.getInt("Tel"), r.getString("adresse")};
             Object tab[] ={acin, acne, anom, aprenom, filiere, email, atel, adr};  
             Tetds.addRow(tab);
            }
            if(nb==0){ jLabel1.setText("Aucun etudiant");  }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
                    
        }        // TODO add your handling code here:
    }//GEN-LAST:event_igiActionPerformed

    private void rttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rttActionPerformed
 
        vider();
        msg.setText("Liste des étudiants RTT :");
         Tetds = new DefaultTableModel();
        Tetds.addColumn("CIN");
        Tetds.addColumn("CNE");
        Tetds.addColumn("Nom");
        Tetds.addColumn("Prenom");
        Tetds.addColumn("Filiere");
        Tetds.addColumn("Email");
        Tetds.addColumn("Tel");
        Tetds.addColumn("Adresse");
        etudiants.setModel(Tetds);
        int nb=0;
                 try {
             
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/gestionformation", "root", "");
            Tetds.setRowCount(0);
            st7 =cn.createStatement();

            r = st7.executeQuery("select * from etudiant where filiere='"+rtt.getText()+"';");

            while (r.next()) {
                jLabel1.setText(null);
                String acin = r.getString("cin");
                int acne = r.getInt("cne");
                String anom =r.getString("nom");
                String aprenom =r.getString("prenom");
                String filiere=r.getString("filiere");
                String email=r.getString("email");
                String adr =r.getString("adresse");
                String atel = r.getString("Tel");
                
                nb++;
            
                //Object[] tab = {r.getString("cin"), r.getInt("cne"), r.getString("nom"), r.getString("prenom"), r.getInt("Tel"), r.getString("adresse")};
             Object tab[] ={acin, acne, anom, aprenom, filiere, email, atel, adr};  
             Tetds.addRow(tab);
            }
            if(nb==0){ jLabel1.setText("Aucun etudiant");  }
  
        } catch (Exception e) {
            System.out.println(e.getMessage());
                    
        }        // TODO add your handling code here:
    }//GEN-LAST:event_rttActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
      Accuiel_admin adm = new Accuiel_admin();
        adm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
       
    }//GEN-LAST:event_formWindowOpened

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Ajouter_etd aj = new Ajouter_etd();
        aj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Etudiants.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Etudiants.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Etudiants.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Etudiants.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Etudiants().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adresse;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField cin;
    private javax.swing.JLabel cne;
    private javax.swing.JLabel cne1;
    private javax.swing.JLabel cne2;
    private javax.swing.JLabel cne3;
    private javax.swing.JLabel cne4;
    private javax.swing.JLabel cne5;
    private javax.swing.JLabel cne6;
    private javax.swing.JLabel cne7;
    private javax.swing.JTextField email;
    private javax.swing.JTable etudiants;
    private javax.swing.JTextField filiere;
    private javax.swing.JRadioButton gi;
    private javax.swing.JRadioButton igi;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton ma;
    private javax.swing.JLabel msg;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField prenom;
    private javax.swing.JRadioButton rtt;
    private javax.swing.JTextField tel;
    private javax.swing.JTextField text1;
    // End of variables declaration//GEN-END:variables
}
