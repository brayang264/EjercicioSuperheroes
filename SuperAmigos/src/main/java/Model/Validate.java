/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

/**
 *
 * @author Admin
 */
public class Validate {
    //Convierte el string a float, en caso de que no se pueda convertir devuleve un 0
    public float convertToFloat(String number){
        return (!isANumber(number))?-1: Float.parseFloat(number);
    }
    //Se comprueba si se pude convertir al string a float.
    public boolean isANumber(String number){
        try{
            Float.parseFloat(number);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
    public void print(String text){
        JTextArea textArea = new JTextArea(10, 40);
        textArea.setText(text);
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Configura el cuadro de diálogo personalizado
        scrollPane.setPreferredSize(new Dimension(400, 200));
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        // Muestra el cuadro de diálogo personalizado
        JOptionPane.showMessageDialog(null, scrollPane, text, JOptionPane.INFORMATION_MESSAGE);
    }
}
