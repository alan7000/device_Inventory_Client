/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.freeboxos.ftb.client;

import fr.freeboxos.ftb.metier.MetierFactory;
import fr.freeboxos.ftb.metier.entitys.Autre;
import fr.freeboxos.ftb.metier.entitys.Cable;
import fr.freeboxos.ftb.metier.entitys.HDD;
import fr.freeboxos.ftb.metier.entitys.Memoire;
import fr.freeboxos.ftb.metier.entitys.Processeur;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author alan
 */
public class MainIhm extends javax.swing.JFrame {

    /**
     * Creates new form MainIhm
     *
     * @throws java.lang.Exception
     */
    public MainIhm() throws Exception {
        super("Inventaire informatique");
        initComponents();
        //this.setSize(420, 180);
        this.setLocationRelativeTo(null);
        this.jLabel_cpu.setText(String.valueOf(MetierFactory.getProcesseurService().getCount()));
        this.jLabel_autre.setText(String.valueOf(this.getAutres()));
        this.jLabel_cable.setText(String.valueOf(this.getCable()));
        this.jLabel_hdd.setText(String.valueOf(MetierFactory.getHDDService().getCount()));
        this.jLabel_ram.setText(String.valueOf(MetierFactory.getMemoireService().getCount()));
        this.jLabel_prixTotal.setText("Le prix totale est de " + this.getPrix() + "€");
        Image icone = Toolkit.getDefaultToolkit().getImage("./icone.png");
        this.setIconImage(icone);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel_cpu = new javax.swing.JLabel();
        jLabel_ram = new javax.swing.JLabel();
        jLabel_hdd = new javax.swing.JLabel();
        jLabel_cable = new javax.swing.JLabel();
        jLabel_autre = new javax.swing.JLabel();
        jLabel_prixTotal = new javax.swing.JLabel();
        jButton_Quitter = new javax.swing.JButton();
        jButtonUtilisateur = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0};
        layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        getContentPane().setLayout(layout);

        jLabel1.setText("Inventaire");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 9;
        getContentPane().add(jLabel1, gridBagConstraints);

        jButton1.setText("Processeur");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jButton1, gridBagConstraints);

        jButton2.setText("Memoire");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jButton2, gridBagConstraints);

        jButton3.setText("Disque dur");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(jButton3, gridBagConstraints);

        jButton4.setText("Cable");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jButton4, gridBagConstraints);

        jButton5.setText("Autre");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jButton5, gridBagConstraints);

        jLabel_cpu.setText("jLabel2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        getContentPane().add(jLabel_cpu, gridBagConstraints);

        jLabel_ram.setText("jLabel3");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        getContentPane().add(jLabel_ram, gridBagConstraints);

        jLabel_hdd.setText("jLabel4");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        getContentPane().add(jLabel_hdd, gridBagConstraints);

        jLabel_cable.setText("jLabel5");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        getContentPane().add(jLabel_cable, gridBagConstraints);

        jLabel_autre.setText("jLabel6");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 4;
        getContentPane().add(jLabel_autre, gridBagConstraints);

        jLabel_prixTotal.setText("jLabel7");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 9;
        getContentPane().add(jLabel_prixTotal, gridBagConstraints);

        jButton_Quitter.setText("Quitter");
        jButton_Quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_QuitterActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 9;
        getContentPane().add(jButton_Quitter, gridBagConstraints);

        jButtonUtilisateur.setText("Utilisateur");
        jButtonUtilisateur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUtilisateurActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        getContentPane().add(jButtonUtilisateur, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_QuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_QuitterActionPerformed
        dispose();
    }//GEN-LAST:event_jButton_QuitterActionPerformed

    private float getPrix() throws Exception {
        float prix = 0;
        List<Processeur> processeurs = MetierFactory.getProcesseurService().getAll();
        List<Memoire> memoires = MetierFactory.getMemoireService().getAll();
        List<HDD> hdds = MetierFactory.getHDDService().getAll();

        Processeur processeur;
        Memoire memoire;
        HDD hdd;

        for (int i = 0; i < processeurs.size(); i++) {
            processeur = processeurs.get(i);
            prix = prix + Float.valueOf(processeur.getPrix());
        }

        for (int i = 0; i < memoires.size(); i++) {
            memoire = memoires.get(i);
            prix = prix + Float.valueOf(memoire.getPrix());
        }

        for (int i = 0; i < hdds.size(); i++) {
            hdd = hdds.get(i);
            prix = prix + Float.valueOf(hdd.getPrix());
        }
        this.jLabel_cpu.repaint();
        this.jLabel_ram.repaint();

        return prix;
    }

    private int getAutres() throws Exception {
        int nombre = 0;
        List<Autre> a = MetierFactory.getAutreService().getAll();
        Autre autre;
        for (int i = 0; i < a.size(); i++) {
            autre = a.get(i);
            nombre = nombre + autre.getNombre();
        }
        return nombre;
    }

    private int getCable() throws Exception {
        int nombre = 0;
        List<Cable> cables = MetierFactory.getCableService().getAll();
        Cable cable;
        for (int i = 0; i < cables.size(); i++) {
            cable = cables.get(i);
            nombre = (int) (nombre + cable.getNombre());
        }
        return nombre;
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ProcesseurIHM processeurIHM = null;
        try {
            processeurIHM = new ProcesseurIHM(this, true);
        } catch (Exception ex) {
            Logger.getLogger(MainIhm.class.getName()).log(Level.SEVERE, null, ex);
        }
        processeurIHM.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonUtilisateurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUtilisateurActionPerformed
        AdministrateurIHM administrateurIHM = null;
        try {
            administrateurIHM = new AdministrateurIHM(this, true);
        } catch (Exception e) {
            Logger.getLogger(MainIhm.class.getName()).log(Level.SEVERE, null, e);
        }
        administrateurIHM.setVisible(true);
    }//GEN-LAST:event_jButtonUtilisateurActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        CableIhm cableIhm = null;
        try {
            cableIhm = new CableIhm(this, true);
        } catch (Exception e) {
            Logger.getLogger(MainIhm.class.getName()).log(Level.SEVERE, null, e);
        }
        cableIhm.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        AutreIhm autreIhm = null;
        try {
            autreIhm = new AutreIhm(this, true);
        } catch (Exception e) {
            Logger.getLogger(MainIhm.class.getName()).log(Level.SEVERE, null, e);
        }
        autreIhm.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        HDDIhm hDDIhm = null;
        try {
            hDDIhm = new HDDIhm(this, true);
        } catch (Exception e) {
            Logger.getLogger(MainIhm.class.getName()).log(Level.SEVERE, null, e);

        }
        hDDIhm.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MemoireIhm memoireIhm = null;
        try {
            memoireIhm = new MemoireIhm(this, true);
        } catch (Exception e) {
            Logger.getLogger(MainIhm.class.getName()).log(Level.SEVERE, null, e);
        }
        memoireIhm.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainIhm.class.getName()).log(Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new MainIhm().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(MainIhm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonUtilisateur;
    private javax.swing.JButton jButton_Quitter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_autre;
    private javax.swing.JLabel jLabel_cable;
    private javax.swing.JLabel jLabel_cpu;
    private javax.swing.JLabel jLabel_hdd;
    private javax.swing.JLabel jLabel_prixTotal;
    private javax.swing.JLabel jLabel_ram;
    // End of variables declaration//GEN-END:variables
}
