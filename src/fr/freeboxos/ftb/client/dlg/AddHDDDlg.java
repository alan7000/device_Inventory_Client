/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.freeboxos.ftb.client.dlg;

import fr.freeboxos.ftb.metier.entitys.HDD;
import fr.freeboxos.ftb.metier.entitys.SSD;
import fr.freeboxos.ftb.metier.enums.hddMarque;
import fr.freeboxos.ftb.metier.enums.ssdType;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author alan
 */
public class AddHDDDlg extends javax.swing.JDialog {

    private long id = 0;
    private HDD hdd = null;

    /**
     * Creates new form AddHDDDlg
     *
     * @param parent
     * @param modal
     */
    public AddHDDDlg(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.jLabelTitre.setText("Ajout d'un disque dur");
        this.jComboBoxMarque.setModel(new DefaultComboBoxModel(hddMarque.values()));
        this.jComboBoxTypeMemoire.setModel(new DefaultComboBoxModel(ssdType.values()));
    }

    public AddHDDDlg(java.awt.Frame parent, boolean modal, HDD hdd) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        /**
         * Mettre les valeurs pour les modification
         */
        this.id = hdd.getId();
        this.jLabelTitre.setText("Modification d'un disque dur");
        this.jComboBoxMarque.setSelectedItem(hdd.getMarque());
        this.jTextFieldModele.setText(hdd.getModele());
        this.jComboBoxInterface.setSelectedItem(hdd.getInterface_ordinateur());
        this.jComboBoxFormat.setSelectedItem(hdd.getFormat());
        this.jTextFieldCapacite.setText(hdd.getCapacite());
        this.jComboBoxVitesse.setSelectedItem(hdd.getVitesse_de_rotation());
        this.jTextFieldCache.setText(hdd.getCache());

        if (hdd instanceof SSD) {
            SSD ssd = (SSD) hdd;

            this.jCheckBoxSSD.setSelected(true);

            /**
             * Rendre enable les element au moment d'une modification
             */
            this.jComboBoxTypeMemoire.setEnabled(true);
            this.jCheckBoxNVME.setEnabled(true);
            this.jTextFieldControleur.setEnabled(true);
            this.jTextFieldLecture.setEnabled(true);
            this.jTextFieldEcriture.setEnabled(true);
            this.jTextFieldIOPS.setEnabled(true);
            this.jCheckBoxTrim.setEnabled(true);

            /**
             * Mettre les valeurs pour la modification
             */
            this.jComboBoxTypeMemoire.setSelectedItem(ssd.getType_memoire());
            if (ssd.isNvme() == true) {
                this.jCheckBoxNVME.setSelected(true);
            }
            this.jTextFieldControleur.setText(ssd.getControleur());
            this.jTextFieldLecture.setText(ssd.getLecture());
            this.jTextFieldEcriture.setText(ssd.getEcriture());
            this.jTextFieldIOPS.setText(String.valueOf(ssd.getIops()));
            if (ssd.isTrim() == true) {
                this.jCheckBoxTrim.setSelected(true);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxMarque = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldModele = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldCapacite = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldCache = new javax.swing.JTextField();
        jComboBoxInterface = new javax.swing.JComboBox<>();
        jComboBoxFormat = new javax.swing.JComboBox<>();
        jComboBoxVitesse = new javax.swing.JComboBox<>();
        jCheckBoxSSD = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jCheckBoxNVME = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldControleur = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldLecture = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldEcriture = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldIOPS = new javax.swing.JTextField();
        jCheckBoxTrim = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldPrix = new javax.swing.JTextField();
        jButtonOK = new javax.swing.JButton();
        jButtonAnnuler = new javax.swing.JButton();
        jComboBoxTypeMemoire = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelTitre.setText("jLabel1");

        jLabel2.setText("Marque");

        jComboBoxMarque.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Samsung", "Western_Digital", "Toshiba", "Hitachi", "HP", "LDLC", "Seagate" }));

        jLabel3.setText("Modèle");

        jTextFieldModele.setText("?");

        jLabel4.setText("Interface ordinateur");

        jLabel5.setText("Format");

        jLabel6.setText("Capacité");

        jTextFieldCapacite.setText("?");

        jLabel7.setText("Vitesse de rotation");

        jLabel8.setText("Cache");

        jTextFieldCache.setText("?");

        jComboBoxInterface.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SAS 2.0 6Gb/s", "SAS 3.0 12Gb/s", "SATA 3Gb/s (SATA 2)", "SATA 6Gb/s (SATA 3)" }));

        jComboBoxFormat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2\" 1/2", "3\" 1/2" }));

        jComboBoxVitesse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5400 RPM", "7200 RPM" }));

        jCheckBoxSSD.setText("SSD");
        jCheckBoxSSD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSSDActionPerformed(evt);
            }
        });

        jLabel9.setText("Type de mémoire");

        jCheckBoxNVME.setText("NVME");
        jCheckBoxNVME.setEnabled(false);

        jLabel10.setText("Type de controleur");

        jTextFieldControleur.setText("?");
        jTextFieldControleur.setEnabled(false);

        jLabel11.setText("Vitesse de lecture");

        jTextFieldLecture.setText("?");
        jTextFieldLecture.setEnabled(false);

        jLabel12.setText("Vitesse d'écriture");

        jTextFieldEcriture.setText("?");
        jTextFieldEcriture.setEnabled(false);

        jLabel13.setText("IOPS");

        jTextFieldIOPS.setText("0");
        jTextFieldIOPS.setEnabled(false);

        jCheckBoxTrim.setText("Trim");
        jCheckBoxTrim.setEnabled(false);

        jLabel14.setText("Prix");

        jTextFieldPrix.setText("?");

        jButtonOK.setText("OK");
        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKActionPerformed(evt);
            }
        });

        jButtonAnnuler.setText("Annuler");
        jButtonAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnnulerActionPerformed(evt);
            }
        });

        jComboBoxTypeMemoire.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MLC", "QLC", "TLC" }));
        jComboBoxTypeMemoire.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBoxTrim)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldPrix))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldControleur))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxMarque, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldModele))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxFormat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldCapacite))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxVitesse, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldCache))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxInterface, 0, 232, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldLecture))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldEcriture))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldIOPS))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBoxNVME)
                                    .addComponent(jCheckBoxSSD))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxTypeMemoire, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonOK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAnnuler)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jLabelTitre)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxMarque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldModele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxInterface, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxFormat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldCapacite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBoxVitesse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldCache, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxSSD)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBoxTypeMemoire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxNVME)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldControleur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldLecture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldEcriture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextFieldIOPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxTrim)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextFieldPrix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonOK)
                    .addComponent(jButtonAnnuler)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxSSDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSSDActionPerformed
        boolean actualState = this.jComboBoxTypeMemoire.isEnabled();
        actualState = !actualState;

        this.jComboBoxTypeMemoire.setEnabled(actualState);
        this.jCheckBoxNVME.setEnabled(actualState);
        this.jTextFieldControleur.setEnabled(actualState);
        this.jTextFieldLecture.setEnabled(actualState);
        this.jTextFieldEcriture.setEnabled(actualState);
        this.jTextFieldIOPS.setEnabled(actualState);
        this.jCheckBoxTrim.setEnabled(actualState);
    }//GEN-LAST:event_jCheckBoxSSDActionPerformed

    /**
     * Bouton ajouter "ok"
     *
     * @param evt
     */
    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
        try {
            String marque = this.jComboBoxMarque.getSelectedItem().toString();
            String modele = this.jTextFieldModele.getText();
            String interface_ordinateur = (String) this.jComboBoxInterface.getSelectedItem();
            String format = this.jComboBoxFormat.getSelectedItem().toString();
            String capacite = this.jTextFieldCapacite.getText();
            String vitesse_de_rotation = this.jComboBoxVitesse.getSelectedItem().toString();
            String cache = this.jTextFieldCache.getText();
            String prix = this.jTextFieldPrix.getText();

            if (marque.length() == 0) {
                throw new Exception("veuillez entrer une marque");
            }

            if (modele.length() == 0) {
                throw new Exception("veuillez entrer un modèle");
            }
            if (interface_ordinateur.length() == 0) {
                throw new Exception("veuillez entrer une interface ordinateur");
            }
            if (format.length() == 0) {
                throw new Exception("veuillez entrer un format");
            }
            if (capacite.length() == 0) {
                throw new Exception("veuillez entrer une capacité");
            }
            if (vitesse_de_rotation.length() == 0) {
                throw new Exception("veuillez entrer une vitesse de rotation");
            }
            if (cache.length() == 0) {
                throw new Exception("veuillez entrer un cache");
            }
            if (prix.length() == 0) {
                throw new Exception("veuillez entrer un prix");
            }

            if (this.jCheckBoxSSD.isSelected()) {
                String type_memoire = this.jComboBoxTypeMemoire.getSelectedItem().toString();
                boolean nvme;
                if (this.jCheckBoxNVME.isSelected()) {
                    nvme = true;
                } else {
                    nvme = false;
                }
                String controleur = this.jTextFieldControleur.getText();
                String lecture = this.jTextFieldLecture.getText();
                String ecriture = this.jTextFieldEcriture.getText();
                String iopsString = this.jTextFieldIOPS.getText();
                long iops = Long.parseLong(iopsString);
                boolean trim;
                if (this.jCheckBoxTrim.isSelected()) {
                    trim = true;
                } else {
                    trim = false;
                }

                if (type_memoire.length() == 0) {
                    throw new Exception("veuillez entrer un type de mémoire");
                }
                if (controleur.length() == 0) {
                    throw new Exception("veuillez entrer un controleur");
                }
                if (lecture.length() == 0) {
                    throw new Exception("veuillez entrer une vitesse de lecture");
                }
                if (ecriture.length() == 0) {
                    throw new Exception("veuillez entrer une vitesse d'écriture");
                }
                if (iopsString.length() == 0) {
                    throw new Exception("veuillez entrer une valeur de iops");
                }

                this.hdd = new SSD(type_memoire, nvme, controleur, lecture, ecriture, iops, trim, marque, modele, interface_ordinateur, format, capacite, vitesse_de_rotation, cache, prix);
//
//                SSD ssd = (SSD) this.hdd;
//                ssd.setControleur(controleur);
//                ssd.setEcriture(ecriture);
//                ssd.setIops(iops);
//                ssd.setLecture(lecture);
//                ssd.setNvme(nvme);
//                ssd.setTrim(trim);
//                ssd.setType_memoire(type_memoire);
            } else {
                this.hdd = new HDD(marque, modele, interface_ordinateur, format, capacite, vitesse_de_rotation, cache, prix);
            }

            this.hdd.setId(this.id);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonOKActionPerformed

    private void jButtonAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnulerActionPerformed
        hdd = null;
        dispose();
    }//GEN-LAST:event_jButtonAnnulerActionPerformed

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
            java.util.logging.Logger.getLogger(AddHDDDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddHDDDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddHDDDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddHDDDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override

            public void run() {
                AddHDDDlg dialog = new AddHDDDlg(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    public HDD getHdd() {
        return hdd;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnnuler;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JCheckBox jCheckBoxNVME;
    private javax.swing.JCheckBox jCheckBoxSSD;
    private javax.swing.JCheckBox jCheckBoxTrim;
    private javax.swing.JComboBox<String> jComboBoxFormat;
    private javax.swing.JComboBox<String> jComboBoxInterface;
    private javax.swing.JComboBox<String> jComboBoxMarque;
    private javax.swing.JComboBox<String> jComboBoxTypeMemoire;
    private javax.swing.JComboBox<String> jComboBoxVitesse;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelTitre;
    private javax.swing.JTextField jTextFieldCache;
    private javax.swing.JTextField jTextFieldCapacite;
    private javax.swing.JTextField jTextFieldControleur;
    private javax.swing.JTextField jTextFieldEcriture;
    private javax.swing.JTextField jTextFieldIOPS;
    private javax.swing.JTextField jTextFieldLecture;
    private javax.swing.JTextField jTextFieldModele;
    private javax.swing.JTextField jTextFieldPrix;
    // End of variables declaration//GEN-END:variables

}