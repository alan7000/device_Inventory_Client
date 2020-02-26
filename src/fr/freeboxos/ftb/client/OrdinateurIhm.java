/*
 * Copyright (C) 2019 alan
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package fr.freeboxos.ftb.client;

import fr.freeboxos.ftb.client.dlg.AddOrdinateurDlg;
import fr.freeboxos.ftb.client.model.OrdinateurTableModel;
import fr.freeboxos.ftb.metier.MetierFactory;
import fr.freeboxos.ftb.metier.OrdinateurService;
import fr.freeboxos.ftb.metier.entitys.Ordinateur;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author alan
 */
public class OrdinateurIhm extends javax.swing.JDialog {

    private final OrdinateurService ordinateurService;
    private final OrdinateurTableModel model;

    /**
     * Creates new form OrdinateurIhm
     *
     * @param parent
     * @param modal
     * @throws java.lang.Exception
     */
    public OrdinateurIhm(java.awt.Frame parent, boolean modal) throws Exception {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.ordinateurService = MetierFactory.getOrdinateurService();
        this.model = new OrdinateurTableModel(this.ordinateurService.sort());
        this.jTable1.setModel(model);
        Image icone = Toolkit.getDefaultToolkit().getImage("./icone.png");
        this.setIconImage(icone);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonAjouter = new javax.swing.JButton();
        jButtonModifier = new javax.swing.JButton();
        jButtonSupprimer = new javax.swing.JButton();
        jButtonQuitter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0};
        layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0};
        getContentPane().setLayout(layout);

        jLabel1.setText("Liste des ordinateurs");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        getContentPane().add(jLabel1, gridBagConstraints);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jScrollPane1, gridBagConstraints);

        jButtonAjouter.setText("Ajouter");
        jButtonAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAjouterActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        getContentPane().add(jButtonAjouter, gridBagConstraints);

        jButtonModifier.setText("Modifier");
        jButtonModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModifierActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        getContentPane().add(jButtonModifier, gridBagConstraints);

        jButtonSupprimer.setText("Supprimer");
        jButtonSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSupprimerActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        getContentPane().add(jButtonSupprimer, gridBagConstraints);

        jButtonQuitter.setText("Quitter");
        jButtonQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuitterActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        getContentPane().add(jButtonQuitter, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuitterActionPerformed
        dispose();
        try {
            MainIhm ihm = new MainIhm();
            ihm.setVisible(true);
            dispose();
        } catch (Exception ex) {
            Logger.getLogger(MemoireIhm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonQuitterActionPerformed

    private void jButtonAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAjouterActionPerformed
        try {
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);

            AddOrdinateurDlg addOrdinateurDlg;
            addOrdinateurDlg = new AddOrdinateurDlg(frame, true);
            addOrdinateurDlg.setVisible(true);

            Ordinateur ordinateur = addOrdinateurDlg.getOrdinateur();

            if (ordinateur != null) {
                try {
                    this.ordinateurService.add(ordinateur);
                    this.model.update(this.ordinateurService.sort());
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Erreur pendant la mise a jour d'un ordinateur", "Erreur", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(OrdinateurIhm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonAjouterActionPerformed

    private void jButtonModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModifierActionPerformed
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        try {
            if (this.jTable1.getSelectedRow() == -1) {
                throw new Exception("Veuillez selectionner un ordinateur");
            }

            Ordinateur ordinateur = this.model.getOrdinateurAt(this.jTable1.getSelectedRow());

            AddOrdinateurDlg addOrdinateurDlg;
            addOrdinateurDlg = new AddOrdinateurDlg(frame, true, ordinateur);
            addOrdinateurDlg.setVisible(true);
            ordinateur = addOrdinateurDlg.getOrdinateur();

//            if (this.jTable1.getSelectedRow() != -1) {
//
//            }
            if (ordinateur != null) {
                try {
                    this.ordinateurService.update(ordinateur);
                    this.model.update(this.ordinateurService.sort());
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e.getMessage(), "erreur", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonModifierActionPerformed

    private void jButtonSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSupprimerActionPerformed
        try {
            if (this.jTable1.getSelectedRow() == -1) {
                throw new Exception("Veuillez selectionner un ordinateur");
            }

            Ordinateur ordinateur = this.model.getOrdinateurAt(this.jTable1.getSelectedRow());

            this.ordinateurService.remove(ordinateur);
            this.model.update(this.ordinateurService.sort());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erreur pendant la suppression d'un ordinateur", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonSupprimerActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        MainIhm ihm;
        try {
            ihm = new MainIhm();
            ihm.setVisible(true);

        } catch (Exception ex) {
            Logger.getLogger(OrdinateurIhm.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("Convert2Lambda")
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrdinateurIhm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    OrdinateurIhm dialog = new OrdinateurIhm(new javax.swing.JFrame(), true);
                    dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                        @Override
                        public void windowClosing(java.awt.event.WindowEvent e) {
                            System.exit(0);
                        }
                    });
                    dialog.setVisible(true);

                } catch (Exception ex) {
                    Logger.getLogger(OrdinateurIhm.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAjouter;
    private javax.swing.JButton jButtonModifier;
    private javax.swing.JButton jButtonQuitter;
    private javax.swing.JButton jButtonSupprimer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
