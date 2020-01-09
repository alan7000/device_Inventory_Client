/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.freeboxos.ftb.client.dlg;

import fr.freeboxos.ftb.metier.entitys.HDD;
import fr.freeboxos.ftb.metier.entitys.SSD;
import fr.freeboxos.ftb.metier.enums.HddMarque;
import fr.freeboxos.ftb.metier.enums.SsdType;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
//todo verifier les warning

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
        //this.setSize(500, 580);
        this.jLabelTitre.setText("Ajout d'un disque dur");
        this.jComboBoxMarque.setModel(new DefaultComboBoxModel(HddMarque.values()));
        this.jComboBoxTypeMemoire.setModel(new DefaultComboBoxModel(SsdType.values()));
        this.getRootPane().setDefaultButton(jButtonOK);
        Image icone = Toolkit.getDefaultToolkit().getImage("./icone.png");
        this.setIconImage(icone);
    }

    public AddHDDDlg(java.awt.Frame parent, boolean modal, HDD hdd) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        //this.setSize(500, 580);
        this.getRootPane().setDefaultButton(jButtonOK);
        Image icone = Toolkit.getDefaultToolkit().getImage("./icone.png");
        this.setIconImage(icone);
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
        java.awt.GridBagConstraints gridBagConstraints;

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
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0, 5, 0};
        layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        getContentPane().setLayout(layout);

        jLabelTitre.setText("jLabel1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        getContentPane().add(jLabelTitre, gridBagConstraints);

        jLabel2.setText("Marque");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jLabel2, gridBagConstraints);

        jComboBoxMarque.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Samsung", "Western_Digital", "Toshiba", "Hitachi", "HP", "LDLC", "Seagate" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 27;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jComboBoxMarque, gridBagConstraints);

        jLabel3.setText("Modèle");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jLabel3, gridBagConstraints);

        jTextFieldModele.setText("?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jTextFieldModele, gridBagConstraints);

        jLabel4.setText("Interface ordinateur");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jLabel4, gridBagConstraints);

        jLabel5.setText("Format");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jLabel5, gridBagConstraints);

        jLabel6.setText("Capacité");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jLabel6, gridBagConstraints);

        jTextFieldCapacite.setText("?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jTextFieldCapacite, gridBagConstraints);

        jLabel7.setText("Vitesse de rotation");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jLabel7, gridBagConstraints);

        jLabel8.setText("Cache");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jLabel8, gridBagConstraints);

        jTextFieldCache.setText("?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jTextFieldCache, gridBagConstraints);

        jComboBoxInterface.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SAS 2.0 6Gb/s", "SAS 3.0 12Gb/s", "SATA 3Gb/s (SATA 2)", "SATA 6Gb/s (SATA 3)" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jComboBoxInterface, gridBagConstraints);

        jComboBoxFormat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2\" 1/2", "3\" 1/2" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jComboBoxFormat, gridBagConstraints);

        jComboBoxVitesse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5400 RPM", "7200 RPM" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.ipadx = 75;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jComboBoxVitesse, gridBagConstraints);

        jCheckBoxSSD.setText("SSD");
        jCheckBoxSSD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSSDActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jCheckBoxSSD, gridBagConstraints);

        jLabel9.setText("Type de mémoire");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jLabel9, gridBagConstraints);

        jCheckBoxNVME.setText("NVME");
        jCheckBoxNVME.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jCheckBoxNVME, gridBagConstraints);

        jLabel10.setText("Type de controleur");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jLabel10, gridBagConstraints);

        jTextFieldControleur.setText("?");
        jTextFieldControleur.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jTextFieldControleur, gridBagConstraints);

        jLabel11.setText("Vitesse de lecture");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jLabel11, gridBagConstraints);

        jTextFieldLecture.setText("?");
        jTextFieldLecture.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jTextFieldLecture, gridBagConstraints);

        jLabel12.setText("Vitesse d'écriture");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 26;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jLabel12, gridBagConstraints);

        jTextFieldEcriture.setText("?");
        jTextFieldEcriture.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 26;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jTextFieldEcriture, gridBagConstraints);

        jLabel13.setText("IOPS");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jLabel13, gridBagConstraints);

        jTextFieldIOPS.setText("0");
        jTextFieldIOPS.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jTextFieldIOPS, gridBagConstraints);

        jCheckBoxTrim.setText("Trim");
        jCheckBoxTrim.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jCheckBoxTrim, gridBagConstraints);

        jLabel14.setText("Prix");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 32;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jLabel14, gridBagConstraints);

        jTextFieldPrix.setText("?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 32;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jTextFieldPrix, gridBagConstraints);

        jButtonOK.setText("OK");
        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 34;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jButtonOK, gridBagConstraints);

        jButtonAnnuler.setText("Annuler");
        jButtonAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnnulerActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 34;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        getContentPane().add(jButtonAnnuler, gridBagConstraints);

        jComboBoxTypeMemoire.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MLC", "QLC", "TLC" }));
        jComboBoxTypeMemoire.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.ipadx = 113;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jComboBoxTypeMemoire, gridBagConstraints);

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
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(AddHDDDlg.class.getName()).log(Level.SEVERE, null, ex);
        }

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
