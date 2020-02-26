/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.freeboxos.ftb.client.dlg;

import fr.freeboxos.ftb.metier.entitys.Memoire;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author jupiter
 */
public class AddMemoireDlg extends javax.swing.JDialog {

    private long id = 0;
    private Memoire memoire = null;

    /**
     * Creates new form AddMemoireDlg
     *
     * @param parent
     * @param modal
     */
    public AddMemoireDlg(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.jLabelTitre.setText("Ajout d'une barette mémoire");
        this.getRootPane().setDefaultButton(jButton1);
        Image icone = Toolkit.getDefaultToolkit().getImage("./icone.png");
        this.setIconImage(icone);
        this.repaint();
        this.pack();
    }

    public AddMemoireDlg(java.awt.Frame parent, boolean modal, Memoire memoire) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.jLabelTitre.setText("Modification d'une barette mémoire");
        this.getRootPane().setDefaultButton(jButton1);
        Image icone = Toolkit.getDefaultToolkit().getImage("./icone.png");
        this.setIconImage(icone);

        /**
         * Attribution des valeur
         */
        this.id = memoire.getId();
        this.jComboBoxMarque.setSelectedItem(memoire.getMarque());
        this.jTextFieldModele.setText(memoire.getModele());
        this.jComboBoxType.setSelectedItem(memoire.getType());
        this.jComboBoxFormat.setSelectedItem(memoire.getFormat());
        this.jComboBoxFréquence.setSelectedItem(memoire.getFrequence_memoire());
        this.jTextFieldCapacité.setText(memoire.getCapacite());
        this.jTextFieldECC.setText(memoire.getECC());
        this.jTextFieldRadiateur.setText(memoire.getRadiateur());
        this.jTextFieldTension.setText(memoire.getTension());
        this.jTextFieldPrix.setText(memoire.getPrix());

        this.repaint();
        this.pack();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabelTitre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxMarque = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldModele = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxType = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxFormat = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldCapacité = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxFréquence = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldECC = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldRadiateur = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldTension = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldPrix = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabelTitre.setText("jLabel1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        jPanel1.add(jLabelTitre, gridBagConstraints);

        jLabel1.setText("Marque");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jLabel1, gridBagConstraints);

        jComboBoxMarque.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ramaxel", "Hynix", "Kingston", "Samsung", "Micron", "Hyundai", "Nanya", "LDLC", "Crucial" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jComboBoxMarque, gridBagConstraints);

        jLabel2.setText("Modèle");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jLabel2, gridBagConstraints);

        jTextFieldModele.setText("?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jTextFieldModele, gridBagConstraints);

        jLabel3.setText("Type de mémoire");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jLabel3, gridBagConstraints);

        jComboBoxType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DDR", "DDR2", "DDR3", "DDR4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jComboBoxType, gridBagConstraints);

        jLabel4.setText("Format de mémoire");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jLabel4, gridBagConstraints);

        jComboBoxFormat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DIMM 184 pins (DDR)", "DIMM 240 pins (DDR2)", "DIMM 240 pins (DDR3)", "DIMM 288 pins (DDR4)", "SO-DIMM 200 pins (DDR)", "SO-DIMM 200 pins (DDR2)", "SO-DIMM 204 pins (DDR3)", "SO-DIMM 260 pins (DDR4)" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jComboBoxFormat, gridBagConstraints);

        jLabel5.setText("Capacité");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jLabel5, gridBagConstraints);

        jTextFieldCapacité.setText("?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jTextFieldCapacité, gridBagConstraints);

        jLabel6.setText("Fréquence mémoire");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jLabel6, gridBagConstraints);

        jComboBoxFréquence.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DDR 333 MHz", "DDR 400 MHz", "DDR2 667 MHz", "DDR2 800 MHz ", "DDR3 1066 MHz", "DDR3 1333 MHz", "DDR3 1375 MHz", "DDR3 1600 MHz", "DDR3 1622 MHz", "DDR3 1800 MHz", "DDR3 1866 MHz", "DDR3 1900 MHz", "DDR3 2000 MHz", "DDR3 2133 MHz", "DDR3 2200 MHz", "DDR3 2250 MHz", "DDR3 2300 MHz", "DDR3 2333 MHz", "DDR3 2400 MHz", "DDR3 2600 MHz", "DDR3 2666 MHz", "DDR3 2800 MHz", "DDR3 2933 MHz", "DDR3 3000 MHz", "DDR3 3100 MHz", "DDR3 800 MHz", "DDR4 1600 MHz", "DDR4 1866 MHz", "DDR4 2133 MHz", "DDR4 2400 MHz", "DDR4 2666 MHz", "DDR4 2800 MHz", "DDR4 2933 MHz", "DDR4 3000 MHz", "DDR4 3200 MHz", "DDR4 3300 MHz", "DDR4 3333 MHz", "DDR4 3400 MHz", "DDR4 3466 MHz", "DDR4 3600 MHz", "DDR4 3666 MHz", "DDR4 3733 MHz", "DDR4 3800 MHz", "DDR4 3866 MHz", "DDR4 4000 MHz", "DDR4 4133 MHz", "DDR4 4200 MHz", "DDR4 4266 MHz", "DDR4 4300 MHz", "DDR4 4333 MHz", "DDR4 4400 MHz", "DDR4 4500 MHz", "DDR4 4600 MHz", "DDR4 4800 MHz" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jComboBoxFréquence, gridBagConstraints);

        jLabel7.setText("ECC");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jLabel7, gridBagConstraints);

        jTextFieldECC.setText("?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jTextFieldECC, gridBagConstraints);

        jLabel8.setText("Radiateur");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jLabel8, gridBagConstraints);

        jTextFieldRadiateur.setText("Non");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.ipadx = 130;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jTextFieldRadiateur, gridBagConstraints);

        jLabel9.setText("Tension");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jLabel9, gridBagConstraints);

        jTextFieldTension.setText("?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jTextFieldTension, gridBagConstraints);

        jLabel10.setText("Prix");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jLabel10, gridBagConstraints);

        jTextFieldPrix.setText("?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jTextFieldPrix, gridBagConstraints);

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jButton1, gridBagConstraints);

        jButton2.setText("Annuler");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel1.add(jButton2, gridBagConstraints);

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.memoire = null;
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String marque = this.jComboBoxMarque.getSelectedItem().toString();
            String modele = this.jTextFieldModele.getText();
            String type = this.jComboBoxType.getSelectedItem().toString();
            String format = this.jComboBoxFormat.getSelectedItem().toString();
            String capacité = this.jTextFieldCapacité.getText();
            String fréquence_mémoire = this.jComboBoxFréquence.getSelectedItem().toString();
            String ECC = this.jTextFieldECC.getText();
            String radiateur = this.jTextFieldRadiateur.getText();
            String tension = this.jTextFieldTension.getText();
            String prix = this.jTextFieldPrix.getText();

            if (marque.length() == 0) {
                throw new Exception("veuillez entrer une marque");
            }
            if (modele.length() == 0) {
                throw new Exception("veuillez entrer un modèle");
            }
            if (type.length() == 0) {
                throw new Exception("veuillez entrer un type de mémoire");
            }
            if (format.length() == 0) {
                throw new Exception("veuillez entrer un format de mémoire");
            }
            if (capacité.length() == 0) {
                throw new Exception("veuillez entrer une capacité");
            }
            if (fréquence_mémoire.length() == 0) {
                throw new Exception("veuillez entrer une fréquence mémoire");
            }
            if (ECC.length() == 0) {
                throw new Exception("veuillez entrer la valeur ECC");
            }
            if (radiateur.length() == 0) {
                throw new Exception("veuillez entrer un radiateur");
            }
            if (tension.length() == 0) {
                throw new Exception("veuillez entrer une tension");
            }
            if (prix.length() == 0) {
                throw new Exception("veuillez entrer un prix");
            }

            this.memoire = new Memoire(marque, modele, type, format, capacité, fréquence_mémoire, ECC, radiateur, tension, prix);
            this.memoire.setId(id);
            this.dispose();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("Convert2Lambda")
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(AddMemoireDlg.class.getName()).log(Level.SEVERE, null, ex);
        }

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                AddMemoireDlg dialog = new AddMemoireDlg(new javax.swing.JFrame(), true);
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

    public Memoire getMemoire() {
        return memoire;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBoxFormat;
    private javax.swing.JComboBox<String> jComboBoxFréquence;
    private javax.swing.JComboBox<String> jComboBoxMarque;
    private javax.swing.JComboBox<String> jComboBoxType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelTitre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldCapacité;
    private javax.swing.JTextField jTextFieldECC;
    private javax.swing.JTextField jTextFieldModele;
    private javax.swing.JTextField jTextFieldPrix;
    private javax.swing.JTextField jTextFieldRadiateur;
    private javax.swing.JTextField jTextFieldTension;
    // End of variables declaration//GEN-END:variables
}
