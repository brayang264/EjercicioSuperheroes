/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;
import Model.Create;
import Control.Validate;
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 * Clase para la interfaz grafica para el registro de personas
 */
public class Register extends javax.swing.JPanel {
    private Create create = Create.getInstance();
    private Validate validate = new Validate();
    private static Register instance;
    /**
     * Creates new form Register
     */
    private Register() {
        initComponents();
        evilField.setVisible(false);
    }
    public static Register getInstance(){
        if(instance == null){
            instance = new Register();
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

        jLabel1 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ageField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        countryField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        weightField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        heightField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        availabilityCheck = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        singleCheck = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        evilField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        physicalCheck = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        mentalCheck = new javax.swing.JCheckBox();
        registerButton = new javax.swing.JButton();
        viewPersons = new javax.swing.JButton();
        calculateLevelEvil = new javax.swing.JButton();
        randomRegister = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        childField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre:");

        jLabel2.setText("Edad: ");

        jLabel3.setText("País: ");

        jLabel4.setText("Dirección: ");

        jLabel5.setText("Peso(kg): ");

        jLabel6.setText("Altura(Cm):");

        jLabel7.setText("¿Tiene disponibilidad?");

        availabilityCheck.setText("No tiene disponibilidad");
        availabilityCheck.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                changedAvailability(evt);
            }
        });

        jLabel8.setText("¿Es soltero?");

        singleCheck.setText("No es soltero");
        singleCheck.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                changedSingelCheck(evt);
            }
        });

        jLabel9.setText("Maldad: ");

        evilField.setEnabled(false);

        jLabel10.setText("¿Sufre de alguno condición física?");

        physicalCheck.setText("No sufre de alguna condición física");
        physicalCheck.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                changedPhysicalCheck(evt);
            }
        });

        jLabel11.setText("¿Tiene alguna enfermedad mental?");

        mentalCheck.setText("No sufre de alguna enfermedad mental");
        mentalCheck.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                changedMentalCheck(evt);
            }
        });

        registerButton.setText("Registrar!");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        viewPersons.setText("Ver personas registradas");
        viewPersons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPersonsActionPerformed(evt);
            }
        });

        calculateLevelEvil.setText("Calcular nivel de maldad");
        calculateLevelEvil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateLevelEvilActionPerformed(evt);
            }
        });

        randomRegister.setText("Registrar de manera aleatoria");
        randomRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randomRegisterActionPerformed(evt);
            }
        });

        jLabel12.setText("Número de hijos: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                    .addComponent(ageField)
                                    .addComponent(countryField)
                                    .addComponent(addressField)
                                    .addComponent(weightField)
                                    .addComponent(heightField)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(calculateLevelEvil))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(31, 31, 31)
                                        .addComponent(evilField, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(physicalCheck)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(availabilityCheck)
                                    .addComponent(jLabel8)
                                    .addComponent(singleCheck)))
                            .addComponent(mentalCheck)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(childField))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(viewPersons))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(randomRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(260, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(countryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(weightField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(heightField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(evilField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(calculateLevelEvil))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel7)
                        .addGap(4, 4, 4)
                        .addComponent(availabilityCheck)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(singleCheck)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel10)
                        .addGap(5, 5, 5)
                        .addComponent(physicalCheck)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addGap(27, 27, 27)
                        .addComponent(mentalCheck)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(childField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerButton)
                    .addComponent(viewPersons))
                .addGap(18, 18, 18)
                .addComponent(randomRegister)
                .addGap(46, 46, 46))
        );
    }// </editor-fold>//GEN-END:initComponents
//Cambia el texto de availabilityCheck si se selecciona o no
    private void changedAvailability(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_changedAvailability
        availabilityCheck.setText((availabilityCheck.isSelected())?"Tiene disponibilidad":"No tiene disponibilidad");
    }//GEN-LAST:event_changedAvailability

    private void changedSingelCheck(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_changedSingelCheck
        singleCheck.setText((singleCheck.isSelected())?"Está soltero":"No está soltero");
    }//GEN-LAST:event_changedSingelCheck

    private void changedPhysicalCheck(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_changedPhysicalCheck
       physicalCheck.setText((physicalCheck.isSelected())?"Sufre del aguna condición física":"No sufre de alguna condición física");
    }//GEN-LAST:event_changedPhysicalCheck

    private void changedMentalCheck(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_changedMentalCheck
        mentalCheck.setText((mentalCheck.isSelected())?"Sufre de alguna enfermedad mental":"No sufre de alguna enfermedad mental");
    }//GEN-LAST:event_changedMentalCheck
//Se hace un registro del usuario y se limpian los campos
    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        if(!validate.isANumber(ageField.getText())||!validate.isANumber(evilField.getText())
                ||!validate.isANumber(weightField.getText())||!validate.isANumber(heightField.getText())
              ||!validate.isANumber(childField.getText())){
            JOptionPane.showMessageDialog(null, "Se han ingresado datos de manera erronea",
                    "Datos incorrectos", 1);
        }else if(fieldsEmply()){
            JOptionPane.showMessageDialog(null, "Debe rellenar todos los campos solicitados","Error", 1);
        }else{
            create.createPerson(nameField.getText(), countryField.getText(),
                    validate.convertToFloat(ageField.getText()), availabilityCheck.isSelected(),
                    singleCheck.isSelected(), addressField.getText(), validate.convertToFloat(evilField.getText()), 
                    validate.convertToFloat(weightField.getText()),validate.convertToFloat(heightField.getText()) , physicalCheck.isSelected(),
                    mentalCheck.isSelected(),(int)validate.convertToFloat(childField.getText()));
            clearFields();
            JOptionPane.showMessageDialog(null, "Se hizo un registro exitoso",
                    "Registro hecho ", 1);
        }
    }//GEN-LAST:event_registerButtonActionPerformed
    //Comprueba que el usuario rellene todos los datos solicitados
    private boolean fieldsEmply(){
        return nameField.getText().isEmpty()||countryField.getText().isEmpty()||addressField.getText().isEmpty();
    }
//Metodo para ver las personas que se han registrado
    private void viewPersonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPersonsActionPerformed
        validate.print(create.printPersons());
    }//GEN-LAST:event_viewPersonsActionPerformed

    private void calculateLevelEvilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateLevelEvilActionPerformed
        int answer = JOptionPane.showConfirmDialog(null,"¿Alguna vez a realizado algun asesinato?", "Pregunta", 1);
        if(answer == JOptionPane.YES_OPTION){
            showTest();
        }else{
            evilField.setText("0");
            evilField.setVisible(true);
            calculateLevelEvil.setVisible(false);
        }
    }//GEN-LAST:event_calculateLevelEvilActionPerformed

    private void randomRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randomRegisterActionPerformed
       boolean flag = false;
       String numOfPersonsText;
       int numOfPersons=0;
        do{
            
           numOfPersonsText=JOptionPane.showInputDialog(null, "Ingrese el número de personas que desea generar"
                   + " aleatoriamente", 1);
           if(!validate.isANumber(numOfPersonsText)){
               validate.print("No se ingreso un valor de tipo númerico\nIngreselo nuevamente");
               continue;
           }
           else{
               numOfPersons = (int)validate.convertToFloat(numOfPersonsText);
           }if(numOfPersons <20){
               validate.print("Ingrese un número mayor a 20");
           }else if(numOfPersons %1 !=0){
               validate.print("Ingrese un número entero");
           }else{
               flag=true;
           }
       }while(!flag);
       create.randomPersons(numOfPersons);
       validate.print("Se han creado "+numOfPersons+" personas");
       
    }//GEN-LAST:event_randomRegisterActionPerformed
    private void showTest(){
        Viewer viewer = Viewer.getInstance();
        viewer.setVisible(false);
        TestViewer test = new TestViewer();
        test.setVisible(true);
    }
//Se hace una limpiesa de los textBox y checkBox
    private void clearFields(){
        nameField.setText("");
        ageField.setText("");
        countryField.setText("");
        availabilityCheck.setSelected(false);
        singleCheck.setSelected(false);
        addressField.setText("");
        evilField.setText("");
        weightField.setText("");
        heightField.setText("");
        physicalCheck.setSelected(false);
        mentalCheck.setSelected(false);
        childField.setText("");
    }
    public void setEvilLevel(String evil){
        evilField.setText(evil);
        calculateLevelEvil.setVisible(false);
        evilField.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.JTextField ageField;
    private javax.swing.JCheckBox availabilityCheck;
    private javax.swing.JButton calculateLevelEvil;
    private javax.swing.JTextField childField;
    private javax.swing.JTextField countryField;
    private javax.swing.JTextField evilField;
    private javax.swing.JTextField heightField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JCheckBox mentalCheck;
    private javax.swing.JTextField nameField;
    private javax.swing.JCheckBox physicalCheck;
    private javax.swing.JButton randomRegister;
    private javax.swing.JButton registerButton;
    private javax.swing.JCheckBox singleCheck;
    private javax.swing.JButton viewPersons;
    private javax.swing.JTextField weightField;
    // End of variables declaration//GEN-END:variables
}
