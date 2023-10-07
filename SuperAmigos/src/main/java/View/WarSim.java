/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Model.Alfis;
import Model.Create;
import Model.Hero;
import Model.WarMechanics;
import Model.Validate;
import java.util.ArrayList;
import Model.Validate;

public class WarSim extends javax.swing.JPanel {
    private Create create = Create.getInstance();
    private Validate validate = new Validate();
    private static WarSim instance;
    WarMechanics primer = new WarMechanics();
    public WarSim() {
        initComponents();
    }
    public static WarSim getInstance(){
        if(instance == null){
            instance = new WarSim();
        }
        return instance;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        canvas1 = new java.awt.Canvas();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
        jComboBox8 = new javax.swing.JComboBox<>();
        jComboBox9 = new javax.swing.JComboBox<>();
        jComboBox10 = new javax.swing.JComboBox<>();
        jComboBox11 = new javax.swing.JComboBox<>();
        startSimulation = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jLabel5.setText("Posición 1");

        jLabel6.setText("Posición 2");

        jLabel7.setText("Posición 3");

        jLabel8.setText("Posición 4");

        jLabel9.setText("Posición 5");

        jLabel10.setText("Posición 6");

        jLabel11.setText("Posición 7");

        jLabel12.setText("Posición 8");

        jLabel13.setText("Posición 9");

        jLabel14.setText("Posición 10");

        jLabel2.setText("Super Humanos");

        jLabel3.setText("Invasores Alfi");

        jLabel33.setText("Posición 1");

        jLabel34.setText("Posición 2");

        jLabel35.setText("Posición 3");

        jLabel36.setText("Posición 4");

        jLabel37.setText("Posición 5");

        jLabel38.setText("Posición 6");

        jLabel39.setText("Posición 7");

        jLabel40.setText("Posición 8");

        jLabel41.setText("Posición 9");

        jLabel42.setText("Posición 10");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Atacar", "Usar Artefacto" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Atacar", "Usar Artefacto" }));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Atacar", "Usar Artefacto" }));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Atacar", "Usar Artefacto" }));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Atacar", "Usar Artefacto" }));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Atacar", "Usar Artefacto" }));

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Atacar", "Usar Artefacto" }));
        jComboBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox8ActionPerformed(evt);
            }
        });

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Atacar", "Usar Artefacto" }));
        jComboBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox9ActionPerformed(evt);
            }
        });

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Atacar", "Usar Artefacto" }));

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Atacar", "Usar Artefacto" }));
        jComboBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox11ActionPerformed(evt);
            }
        });

        startSimulation.setText("Iniciar");
        startSimulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startSimulationActionPerformed(evt);
            }
        });

        jButton1.setText("Simular batalla");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jToggleButton1.setText("Llamar refuerzos");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Comenzar nueva ronda");

        jButton3.setText("Bajas en combate");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox8, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox6, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox7, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox10, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox9, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox11, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel5))
                                .addGap(113, 113, 113)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel42)
                                    .addComponent(jLabel35)
                                    .addComponent(jLabel36)
                                    .addComponent(jLabel37)
                                    .addComponent(jLabel38)
                                    .addComponent(jLabel39)
                                    .addComponent(jLabel40)
                                    .addComponent(jLabel41)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel3)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(133, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(startSimulation)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton3))))
                        .addContainerGap(87, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(startSimulation)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel33))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel34))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel35))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel36))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel37))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel38))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel39)))
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel40))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel41))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel42))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(36, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void startSimulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startSimulationActionPerformed
        ArrayList<Alfis> alfis = create.createAlfi(20);
        ArrayList<Hero> sP = create.getHeroArray();
        if(sP.size()<20){
            validate.print("No se han creado suficientes super humanos, porfavor cree un minimo de 20");
            return;
        }
        primer = new WarMechanics(sP, alfis);
        primer.FillPositions();
        showLabels();
        
        
        
        

        
    }//GEN-LAST:event_startSimulationActionPerformed

    private void jComboBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox8ActionPerformed
        
    }//GEN-LAST:event_jComboBox8ActionPerformed

    private void jComboBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox11ActionPerformed

    private void jComboBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(!primer.EndofFight()){
            int index = 0;
            if(jComboBox11.getSelectedItem().equals("Atacar") && !primer.isdead(primer.getAlfiSide().get(index)) && !primer.isdead(primer.getHeroSide().get(index)) ){
                primer.AttackAction(primer.getHeroSide().get(index), primer.getAlfiSide().get(index));
                primer.AttackAction(primer.getAlfiSide().get(index), primer.getHeroSide().get(index));
            }
            else if (jComboBox11.getSelectedItem().equals("Usar Artefacto") && !primer.isdead(primer.getHeroSide().get(index)) && !primer.isdead(primer.getAlfiSide().get(index))){
                primer.DeviceAction(primer.getHeroSide().get(index), primer.getAlfiSide().get(index));
                primer.AttackAction(primer.getAlfiSide().get(index), primer.getHeroSide().get(index));
            }
            index = 1;
            if(jComboBox9.getSelectedItem().equals("Atacar") && !primer.isdead(primer.getAlfiSide().get(index)) && !primer.isdead(primer.getHeroSide().get(index)) ){
                primer.AttackAction(primer.getHeroSide().get(index), primer.getAlfiSide().get(index));
                primer.AttackAction(primer.getAlfiSide().get(index), primer.getHeroSide().get(index));
            }
            else if (jComboBox9.getSelectedItem().equals("Usar Artefacto") && !primer.isdead(primer.getHeroSide().get(index)) && !primer.isdead(primer.getAlfiSide().get(index))){
                primer.DeviceAction(primer.getHeroSide().get(index), primer.getAlfiSide().get(index));
                primer.AttackAction(primer.getAlfiSide().get(index), primer.getHeroSide().get(index));
            };
            index = 2;
            if(jComboBox8.getSelectedItem().equals("Atacar") && !primer.isdead(primer.getAlfiSide().get(index)) && !primer.isdead(primer.getHeroSide().get(index)) ){
                primer.AttackAction(primer.getHeroSide().get(index), primer.getAlfiSide().get(index));
                primer.AttackAction(primer.getAlfiSide().get(index), primer.getHeroSide().get(index));
            }
            else if (jComboBox8.getSelectedItem().equals("Usar Artefacto") && !primer.isdead(primer.getHeroSide().get(index)) && !primer.isdead(primer.getAlfiSide().get(index))){
                primer.DeviceAction(primer.getHeroSide().get(index), primer.getAlfiSide().get(index));
                primer.AttackAction(primer.getAlfiSide().get(index), primer.getHeroSide().get(index));
            }
            index = 3;
            if(jComboBox2.getSelectedItem().equals("Atacar") && !primer.isdead(primer.getAlfiSide().get(index)) && !primer.isdead(primer.getHeroSide().get(index)) ){
                primer.AttackAction(primer.getHeroSide().get(index), primer.getAlfiSide().get(index));
                primer.AttackAction(primer.getAlfiSide().get(index), primer.getHeroSide().get(index));
            }
            else if (jComboBox2.getSelectedItem().equals("Usar Artefacto") && !primer.isdead(primer.getHeroSide().get(index)) && !primer.isdead(primer.getAlfiSide().get(index))){
                primer.DeviceAction(primer.getHeroSide().get(index), primer.getAlfiSide().get(index));
                primer.AttackAction(primer.getAlfiSide().get(index), primer.getHeroSide().get(index));
            }
            index = 4;
            if(jComboBox3.getSelectedItem().equals("Atacar") && !primer.isdead(primer.getAlfiSide().get(index)) && !primer.isdead(primer.getHeroSide().get(index)) ){
                primer.AttackAction(primer.getHeroSide().get(index), primer.getAlfiSide().get(index));
                primer.AttackAction(primer.getAlfiSide().get(index), primer.getHeroSide().get(index));
            }
            else if (jComboBox3.getSelectedItem().equals("Usar Artefacto") && !primer.isdead(primer.getHeroSide().get(index)) && !primer.isdead(primer.getAlfiSide().get(index))){
                primer.DeviceAction(primer.getHeroSide().get(index), primer.getAlfiSide().get(index));
                primer.AttackAction(primer.getAlfiSide().get(index), primer.getHeroSide().get(index));
            }
            index = 5;
            if(jComboBox4.getSelectedItem().equals("Atacar") && !primer.isdead(primer.getAlfiSide().get(index)) && !primer.isdead(primer.getHeroSide().get(index)) ){
                primer.AttackAction(primer.getHeroSide().get(index), primer.getAlfiSide().get(index));
                primer.AttackAction(primer.getAlfiSide().get(index), primer.getHeroSide().get(index));
            }
            else if (jComboBox4.getSelectedItem().equals("Usar Artefacto") && !primer.isdead(primer.getHeroSide().get(index)) && !primer.isdead(primer.getAlfiSide().get(index))){
                primer.DeviceAction(primer.getHeroSide().get(index), primer.getAlfiSide().get(index));
                primer.AttackAction(primer.getAlfiSide().get(index), primer.getHeroSide().get(index));
            }
            index = 6;
            if(jComboBox5.getSelectedItem().equals("Atacar") && !primer.isdead(primer.getAlfiSide().get(index)) && !primer.isdead(primer.getHeroSide().get(index)) ){
                primer.AttackAction(primer.getHeroSide().get(index), primer.getAlfiSide().get(index));
                primer.AttackAction(primer.getAlfiSide().get(index), primer.getHeroSide().get(index));
            }
            else if (jComboBox5.getSelectedItem().equals("Usar Artefacto") && !primer.isdead(primer.getHeroSide().get(index)) && !primer.isdead(primer.getAlfiSide().get(index))){
                primer.DeviceAction(primer.getHeroSide().get(index), primer.getAlfiSide().get(index));
                primer.AttackAction(primer.getAlfiSide().get(index), primer.getHeroSide().get(index));
            }
            index = 7;
            if(jComboBox6.getSelectedItem().equals("Atacar") && !primer.isdead(primer.getAlfiSide().get(index)) && !primer.isdead(primer.getHeroSide().get(index)) ){
                primer.AttackAction(primer.getHeroSide().get(index), primer.getAlfiSide().get(index));
                primer.AttackAction(primer.getAlfiSide().get(index), primer.getHeroSide().get(index));
            }
            else if (jComboBox6.getSelectedItem().equals("Usar Artefacto") && !primer.isdead(primer.getHeroSide().get(index)) && !primer.isdead(primer.getAlfiSide().get(index))){
                primer.DeviceAction(primer.getHeroSide().get(index), primer.getAlfiSide().get(index));
                primer.AttackAction(primer.getAlfiSide().get(index), primer.getHeroSide().get(index));
            }
            index = 8;
            if(jComboBox7.getSelectedItem().equals("Atacar") && !primer.isdead(primer.getAlfiSide().get(index)) && !primer.isdead(primer.getHeroSide().get(index)) ){
                primer.AttackAction(primer.getHeroSide().get(index), primer.getAlfiSide().get(index));
                primer.AttackAction(primer.getAlfiSide().get(index), primer.getHeroSide().get(index));
            }
            else if (jComboBox7.getSelectedItem().equals("Usar Artefacto") && !primer.isdead(primer.getHeroSide().get(index)) && !primer.isdead(primer.getAlfiSide().get(index))){
                primer.DeviceAction(primer.getHeroSide().get(index), primer.getAlfiSide().get(index));
                primer.AttackAction(primer.getAlfiSide().get(index), primer.getHeroSide().get(index));
            }
            index = 9;
            if(jComboBox10.getSelectedItem().equals("Atacar") && !primer.isdead(primer.getAlfiSide().get(index)) && !primer.isdead(primer.getHeroSide().get(index)) ){
                primer.AttackAction(primer.getHeroSide().get(index), primer.getAlfiSide().get(index));
                primer.AttackAction(primer.getAlfiSide().get(index), primer.getHeroSide().get(index));
            }
            else if (jComboBox10.getSelectedItem().equals("Usar Artefacto") && !primer.isdead(primer.getHeroSide().get(index)) && !primer.isdead(primer.getAlfiSide().get(index))){
                primer.DeviceAction(primer.getHeroSide().get(index), primer.getAlfiSide().get(index));
                primer.AttackAction(primer.getAlfiSide().get(index), primer.getHeroSide().get(index));
            }

            primer.ApplyVulnerabilities(primer.getAlfiSide());
            showLabels();
        
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Validate validate = new Validate();
        String deathList = "";
        for (String elements : primer.CombatDeaths()) {
            deathList += elements;
            deathList += "\n---------------------------------------------------------------------------------------------------------------------";
            deathList += "\n"; 
        }
        validate.print(deathList);
        primer.CombatDeaths().clear();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed

        primer.Replace();
        showLabels();
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private java.awt.Canvas canvas1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton startSimulation;
    // End of variables declaration//GEN-END:variables
public void showLabels(){
            jLabel5.setText(primer.heroToString().get(0));
            jLabel6.setText(primer.heroToString().get(1));
            jLabel7.setText(primer.heroToString().get(2));
            jLabel8.setText(primer.heroToString().get(3));
            jLabel9.setText(primer.heroToString().get(4));
            jLabel10.setText(primer.heroToString().get(5));
            jLabel11.setText(primer.heroToString().get(6));
            jLabel12.setText(primer.heroToString().get(7));
            jLabel13.setText(primer.heroToString().get(8));
            jLabel14.setText(primer.heroToString().get(9));

            jLabel33.setText(primer.alfisToString().get(0));
            jLabel34.setText(primer.alfisToString().get(1));
            jLabel35.setText(primer.alfisToString().get(2));
            jLabel36.setText(primer.alfisToString().get(3));
            jLabel37.setText(primer.alfisToString().get(4));
            jLabel38.setText(primer.alfisToString().get(5));
            jLabel39.setText(primer.alfisToString().get(6));
            jLabel40.setText(primer.alfisToString().get(7));
            jLabel41.setText(primer.alfisToString().get(8));
            jLabel42.setText(primer.alfisToString().get(9));
}
}


