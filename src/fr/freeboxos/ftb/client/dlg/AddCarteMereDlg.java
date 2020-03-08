/*
 * Copyright (C) 2020 alan
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
package fr.freeboxos.ftb.client.dlg;

import fr.freeboxos.ftb.client.ihm.MainIhm;
import fr.freeboxos.ftb.metier.entitys.CarteMere;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.SpinnerNumberModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author alan
 */
public class AddCarteMereDlg extends javax.swing.JDialog {

    private CarteMere carteMere;
    private long id = 0;

    /**
     * Creates new form AddCarteMereDlg
     *
     * @param parent
     * @param modal
     */
    public AddCarteMereDlg(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.getRootPane().setDefaultButton(jButtonOk);
        Image icone = Toolkit.getDefaultToolkit().getImage("./icone.png");
        this.setIconImage(icone);
        this.jLabelTitre.setText("Ajout d'une carte mère");
        this.setAllModelJSpinner();
        //todo : seter les jcombobox
        this.repaint();
        this.pack();
        this.setSize(this.getWidth() + 10, this.getHeight());
    }

    public AddCarteMereDlg(JFrame frame, boolean b, CarteMere carteMere) {
        super(frame, b);
        initComponents();
        this.setLocationRelativeTo(null);
        this.getRootPane().setDefaultButton(jButtonOk);
        Image icone = Toolkit.getDefaultToolkit().getImage("./icone.png");
        this.setIconImage(icone);
        this.setAllElements(carteMere);
        this.repaint();
        this.pack();
        this.setSize(this.getWidth() + 10, this.getHeight());
    }

    public CarteMere getCarteMere() {
        return carteMere;
    }

    /**
     * Cette methode va appeller tous les jspinner du jdialog et il vas setter
     * la valeur min et max.
     */
    private void setAllModelJSpinner() {
        Integer value = 0;
        Integer min = 0;
        Integer max = 99;
        Integer step = 1;
        SpinnerNumberModel model = new SpinnerNumberModel(value, min, max, step);
        this.jSpinnerNombreDeCpu.setModel(model);
        this.jSpinnerCapaciteMaximaleRamSlot.setModel(model);
        this.jSpinnerCapaciteMaximaleRamTotale.setModel(model);
        this.jSpinnerModeRaid.setModel(model);
        this.jSpinnerNombreCanauxAudio.setModel(model);
        this.jSpinnerPci.setModel(model);
        this.jSpinnerPciE16x20.setModel(model);
        this.jSpinnerPciE16x30.setModel(model);
        this.jSpinnerPciE1x20.setModel(model);
        this.jSpinnerPciE1x30.setModel(model);
        this.jSpinnerTailleMemoireVideo.setModel(model);
    }

    /**
     * Appelle tous les elements pour une modification de celui-ci.
     */
    private void setAllElements(CarteMere carteMere) {
        //todo : seter les jcombobox
        this.id = carteMere.getId();
        //todo : jcombobox marque
        this.jTextFieldModele.setText(carteMere.getModele());
        this.jTextFieldDesignation.setText(carteMere.getDesignation());
        this.jTextFieldSupportDuProcesseur.setText(carteMere.getSupportDuProcesseur());
        this.jSpinnerNombreDeCpu.setValue(carteMere.getNombreDeCpu());
        //todo : jcombobox format de la carte mère
        //todo : jcombobox chipset
        //todo : jcombobox type de memoire
        this.jTextFieldFrequenceMemoire.setText(carteMere.getFrequenceMemoire());
        //todo : jcombobox technologie memoire
        this.jSpinnerCapaciteMaximaleRamSlot.setValue(carteMere.getCapaciteMaximaleRamSlot());
        this.jSpinnerCapaciteMaximaleRamTotale.setValue(carteMere.getCapaciteMaximaleRam());
        this.jCheckBoxControleurGpuIntegre.setSelected(carteMere.getControleurGraphiqueIntegre());
        this.jCheckBoxGpuDansCpu.setSelected(carteMere.getGpuInCpu());
        //todo : jcombobox chipset graphique
        this.jSpinnerTailleMemoireVideo.setValue(carteMere.getTailleMemoireVideo());
        //todo : jcombobox type de multi-gpu
        //todo : jcombobox connecteur graphique
        this.jCheckBoxPci.setSelected(carteMere.getPci());
        this.jSpinnerPci.setValue(carteMere.getPciNum());
        this.jCheckBoxPciE1x20.setSelected(carteMere.getPciExpress1x20());
        this.jSpinnerPciE1x20.setValue(carteMere.getPciExpress1x20Num());
        this.jCheckBoxPciE16x20.setSelected(carteMere.getPciExpress16x20());
        this.jSpinnerPciE16x20.setValue(carteMere.getPciExpress16x20Num());
        this.jCheckBoxPciE1x30.setSelected(carteMere.getPciExpress1x30());
        this.jSpinnerPciE1x30.setValue(carteMere.getPciExpress1x30Num());
        this.jCheckBoxPciE16x30.setSelected(carteMere.getPciExpress16x30());
        this.jSpinnerPciE16x30.setValue(carteMere.getPciExpress16x30Num());
        //todo : jcombobox chipset audio
        this.jSpinnerNombreCanauxAudio.setValue(carteMere.getNombreCanauxAudio());
        this.jTextFieldControleurEthernet.setText(carteMere.getControleurEthernet());
        //todo : jcombobox norme réseaux
        this.jCheckBoxRaid.setSelected(carteMere.getRaid());
        //todo : jcombobox mode raid
        this.jCheckBoxLed.setSelected(carteMere.getLed());
        this.jTextFieldPrix.setText(String.valueOf(carteMere.getPrix()));
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
        jLabelMarque = new javax.swing.JLabel();
        jButtonOk = new javax.swing.JButton();
        jButtonAnnuler = new javax.swing.JButton();
        jLabelModele = new javax.swing.JLabel();
        jTextFieldModele = new javax.swing.JTextField();
        jLabelDesignation = new javax.swing.JLabel();
        jTextFieldDesignation = new javax.swing.JTextField();
        jLabelSupportDuProcesseur = new javax.swing.JLabel();
        jTextFieldSupportDuProcesseur = new javax.swing.JTextField();
        jLabelNombreDeCpu = new javax.swing.JLabel();
        jSpinnerNombreDeCpu = new javax.swing.JSpinner();
        jLabelFormatCarteMere = new javax.swing.JLabel();
        jLabelChipset = new javax.swing.JLabel();
        jComboBoxFormatCarteMere = new javax.swing.JComboBox<>();
        jComboBoxChipset = new javax.swing.JComboBox<>();
        jLabelFrequenceMemoire = new javax.swing.JLabel();
        jTextFieldFrequenceMemoire = new javax.swing.JTextField();
        jLabelTechnologieMemoire = new javax.swing.JLabel();
        jLabelCapaciteMaximaleRamSlot = new javax.swing.JLabel();
        jSpinnerCapaciteMaximaleRamSlot = new javax.swing.JSpinner();
        jLabelCapaciteMaximaleRamTotale = new javax.swing.JLabel();
        jSpinnerCapaciteMaximaleRamTotale = new javax.swing.JSpinner();
        jLabelTypeDeMemoire = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jCheckBoxControleurGpuIntegre = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jCheckBoxGpuDansCpu = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSpinnerTailleMemoireVideo = new javax.swing.JSpinner();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jComboBoxTypeMultiGpu = new javax.swing.JComboBox<>();
        jComboBoxChipsetGraphique = new javax.swing.JComboBox<>();
        jComboBoxControleurGpu = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jCheckBoxPci = new javax.swing.JCheckBox();
        jSpinnerPci = new javax.swing.JSpinner();
        jLabel19 = new javax.swing.JLabel();
        jCheckBoxPciE1x20 = new javax.swing.JCheckBox();
        jSpinnerPciE1x20 = new javax.swing.JSpinner();
        jLabel20 = new javax.swing.JLabel();
        jCheckBoxPciE16x20 = new javax.swing.JCheckBox();
        jSpinnerPciE16x20 = new javax.swing.JSpinner();
        jLabel21 = new javax.swing.JLabel();
        jCheckBoxPciE1x30 = new javax.swing.JCheckBox();
        jSpinnerPciE1x30 = new javax.swing.JSpinner();
        jLabel22 = new javax.swing.JLabel();
        jCheckBoxPciE16x30 = new javax.swing.JCheckBox();
        jSpinnerPciE16x30 = new javax.swing.JSpinner();
        jLabel23 = new javax.swing.JLabel();
        jComboBoxChipsetAudio = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        jSpinnerNombreCanauxAudio = new javax.swing.JSpinner();
        jLabel25 = new javax.swing.JLabel();
        jTextFieldControleurEthernet = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jComboBoxNormeReseau = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        jCheckBoxRaid = new javax.swing.JCheckBox();
        jLabel28 = new javax.swing.JLabel();
        jTextFieldConnecteurHdd = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jSpinnerModeRaid = new javax.swing.JSpinner();
        jLabel30 = new javax.swing.JLabel();
        jCheckBoxLed = new javax.swing.JCheckBox();
        jLabel31 = new javax.swing.JLabel();
        jTextFieldPrix = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListMarque = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {0, 5, 0, 5, 0};
        jPanel1Layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        jPanel1.setLayout(jPanel1Layout);

        jLabelTitre.setText("jLabel1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        jPanel1.add(jLabelTitre, gridBagConstraints);

        jLabelMarque.setText("Marque");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabelMarque, gridBagConstraints);

        jButtonOk.setText("Ok");
        jButtonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 68;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jButtonOk, gridBagConstraints);

        jButtonAnnuler.setText("Annuler");
        jButtonAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnnulerActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 68;
        jPanel1.add(jButtonAnnuler, gridBagConstraints);

        jLabelModele.setText("Modèle");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabelModele, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jTextFieldModele, gridBagConstraints);

        jLabelDesignation.setText("Désignation");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabelDesignation, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jTextFieldDesignation, gridBagConstraints);

        jLabelSupportDuProcesseur.setText("Support du processeur");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabelSupportDuProcesseur, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jTextFieldSupportDuProcesseur, gridBagConstraints);

        jLabelNombreDeCpu.setText("Nombre de cpu");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabelNombreDeCpu, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jSpinnerNombreDeCpu, gridBagConstraints);

        jLabelFormatCarteMere.setText("Format de la carte mère");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabelFormatCarteMere, gridBagConstraints);

        jLabelChipset.setText("Chipset");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabelChipset, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jComboBoxFormatCarteMere, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jComboBoxChipset, gridBagConstraints);

        jLabelFrequenceMemoire.setText("Fréquence mémoire");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabelFrequenceMemoire, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jTextFieldFrequenceMemoire, gridBagConstraints);

        jLabelTechnologieMemoire.setText("Téchnologie mémoire");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabelTechnologieMemoire, gridBagConstraints);

        jLabelCapaciteMaximaleRamSlot.setText("Capacité maximale ram slot");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabelCapaciteMaximaleRamSlot, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jSpinnerCapaciteMaximaleRamSlot, gridBagConstraints);

        jLabelCapaciteMaximaleRamTotale.setText("Capacité maximale ram totale");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 26;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabelCapaciteMaximaleRamTotale, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 26;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jSpinnerCapaciteMaximaleRamTotale, gridBagConstraints);

        jLabelTypeDeMemoire.setText("Type de mémoire");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabelTypeDeMemoire, gridBagConstraints);

        jLabel12.setText("Controleur graphique intégrer");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabel12, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jCheckBoxControleurGpuIntegre, gridBagConstraints);

        jLabel13.setText("GPU dans le CPU");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabel13, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jCheckBoxGpuDansCpu, gridBagConstraints);

        jLabel14.setText("Chipset graphique");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 32;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabel14, gridBagConstraints);

        jLabel15.setText("Taille mémoire vidéo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 34;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabel15, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 34;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jSpinnerTailleMemoireVideo, gridBagConstraints);

        jLabel16.setText("Type de multi-GPU");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 36;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabel16, gridBagConstraints);

        jLabel17.setText("Connecteur graphique");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 38;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabel17, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 36;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jComboBoxTypeMultiGpu, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 32;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jComboBoxChipsetGraphique, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 38;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jComboBoxControleurGpu, gridBagConstraints);

        jLabel18.setText("Pci");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabel18, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jCheckBoxPci, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 40;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        jPanel1.add(jSpinnerPci, gridBagConstraints);

        jLabel19.setText("PciExpress 1x 2.0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 42;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabel19, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 42;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jCheckBoxPciE1x20, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 42;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        jPanel1.add(jSpinnerPciE1x20, gridBagConstraints);

        jLabel20.setText("PciExpress 16x 2.0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 44;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabel20, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 44;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jCheckBoxPciE16x20, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 44;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        jPanel1.add(jSpinnerPciE16x20, gridBagConstraints);

        jLabel21.setText("PciExpress 1x 3.0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 46;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabel21, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 46;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jCheckBoxPciE1x30, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 46;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        jPanel1.add(jSpinnerPciE1x30, gridBagConstraints);

        jLabel22.setText("PciExpress 16x 3.0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 48;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabel22, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 48;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jCheckBoxPciE16x30, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 48;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        jPanel1.add(jSpinnerPciE16x30, gridBagConstraints);

        jLabel23.setText("Chipset Audio");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabel23, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 50;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jComboBoxChipsetAudio, gridBagConstraints);

        jLabel24.setText("Nombre de canaux audio");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 52;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabel24, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 52;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jSpinnerNombreCanauxAudio, gridBagConstraints);

        jLabel25.setText("Controleur ethernet");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 54;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabel25, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 54;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jTextFieldControleurEthernet, gridBagConstraints);

        jLabel26.setText("Norme réseau");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 56;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabel26, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 56;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jComboBoxNormeReseau, gridBagConstraints);

        jLabel27.setText("Raid");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 58;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabel27, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 58;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jCheckBoxRaid, gridBagConstraints);

        jLabel28.setText("Connecteur disque dur");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 60;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabel28, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 60;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jTextFieldConnecteurHdd, gridBagConstraints);

        jLabel29.setText("Mode raid");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 62;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabel29, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 62;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jSpinnerModeRaid, gridBagConstraints);

        jLabel30.setText("Led");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 64;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabel30, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 64;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jCheckBoxLed, gridBagConstraints);

        jLabel31.setText("Prix");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 66;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabel31, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 66;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jTextFieldPrix, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jComboBox2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jComboBox3, gridBagConstraints);

        jScrollPane2.setPreferredSize(new java.awt.Dimension(60, 50));

        jListMarque.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "test1", "test2" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jListMarque);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jScrollPane2, gridBagConstraints);

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnulerActionPerformed
        carteMere = null;
        dispose();
    }//GEN-LAST:event_jButtonAnnulerActionPerformed

    private void jButtonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkActionPerformed

        List<String> marque = this.jListMarque.getSelectedValuesList();
        carteMere = new CarteMere(marque, "fgnb", "fgn", "fgnb", 5, "trhbr", "gfhb", "hgb", "dtgbfh", 5, 5, "rtghbt", true, true, "gfbkjh", 51, "gerb", "ldibuhd", true, true, true, true, true, 561, 51, 51, 51, 51, "ubh", 51, "gbnkf", "kjnfgd", true, "iuhtg", 51, true, 50);
        dispose();
    }//GEN-LAST:event_jButtonOkActionPerformed

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("Convert2Lambda")
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainIhm.class.getName()).log(Level.SEVERE, null, ex);
        }

        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                AddCarteMereDlg dialog = new AddCarteMereDlg(new javax.swing.JFrame(), true);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnnuler;
    private javax.swing.JButton jButtonOk;
    private javax.swing.JCheckBox jCheckBoxControleurGpuIntegre;
    private javax.swing.JCheckBox jCheckBoxGpuDansCpu;
    private javax.swing.JCheckBox jCheckBoxLed;
    private javax.swing.JCheckBox jCheckBoxPci;
    private javax.swing.JCheckBox jCheckBoxPciE16x20;
    private javax.swing.JCheckBox jCheckBoxPciE16x30;
    private javax.swing.JCheckBox jCheckBoxPciE1x20;
    private javax.swing.JCheckBox jCheckBoxPciE1x30;
    private javax.swing.JCheckBox jCheckBoxRaid;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBoxChipset;
    private javax.swing.JComboBox<String> jComboBoxChipsetAudio;
    private javax.swing.JComboBox<String> jComboBoxChipsetGraphique;
    private javax.swing.JComboBox<String> jComboBoxControleurGpu;
    private javax.swing.JComboBox<String> jComboBoxFormatCarteMere;
    private javax.swing.JComboBox<String> jComboBoxNormeReseau;
    private javax.swing.JComboBox<String> jComboBoxTypeMultiGpu;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabelCapaciteMaximaleRamSlot;
    private javax.swing.JLabel jLabelCapaciteMaximaleRamTotale;
    private javax.swing.JLabel jLabelChipset;
    private javax.swing.JLabel jLabelDesignation;
    private javax.swing.JLabel jLabelFormatCarteMere;
    private javax.swing.JLabel jLabelFrequenceMemoire;
    private javax.swing.JLabel jLabelMarque;
    private javax.swing.JLabel jLabelModele;
    private javax.swing.JLabel jLabelNombreDeCpu;
    private javax.swing.JLabel jLabelSupportDuProcesseur;
    private javax.swing.JLabel jLabelTechnologieMemoire;
    private javax.swing.JLabel jLabelTitre;
    private javax.swing.JLabel jLabelTypeDeMemoire;
    private javax.swing.JList<String> jListMarque;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinnerCapaciteMaximaleRamSlot;
    private javax.swing.JSpinner jSpinnerCapaciteMaximaleRamTotale;
    private javax.swing.JSpinner jSpinnerModeRaid;
    private javax.swing.JSpinner jSpinnerNombreCanauxAudio;
    private javax.swing.JSpinner jSpinnerNombreDeCpu;
    private javax.swing.JSpinner jSpinnerPci;
    private javax.swing.JSpinner jSpinnerPciE16x20;
    private javax.swing.JSpinner jSpinnerPciE16x30;
    private javax.swing.JSpinner jSpinnerPciE1x20;
    private javax.swing.JSpinner jSpinnerPciE1x30;
    private javax.swing.JSpinner jSpinnerTailleMemoireVideo;
    private javax.swing.JTextField jTextFieldConnecteurHdd;
    private javax.swing.JTextField jTextFieldControleurEthernet;
    private javax.swing.JTextField jTextFieldDesignation;
    private javax.swing.JTextField jTextFieldFrequenceMemoire;
    private javax.swing.JTextField jTextFieldModele;
    private javax.swing.JTextField jTextFieldPrix;
    private javax.swing.JTextField jTextFieldSupportDuProcesseur;
    // End of variables declaration//GEN-END:variables
}