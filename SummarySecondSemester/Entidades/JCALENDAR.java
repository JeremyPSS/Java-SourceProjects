/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import javax.swing.JOptionPane;

/**
 *
 * @author Extrar datos con el jcalendar
 */
public class JCALENDAR {
    
    /**
     * Extraer la fecha en el formulario del jframe
     */
    /**
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if (jTextField1.getText()!="" && jComboBox1.getSelectedIndex()!=0){
            String cliente = jTextField1.getText();
            String modelo = jComboBox1.getSelectedItem().toString();
            int Dias= Dia(jDateChooser1.getDate(),jDateChooser2.getDate()); //Extraer en int la diferencia entre la fecha de inicio y final
            String fecha_e=String.valueOf(jDateChooser1.getDate()); //Extraer en caracteres las fechas de inicio la fecha de primer jdatechooser
            String fecha_d=String.valueOf(jDateChooser2.getDate()); //Lo mismo que el anterior
            Empresa op = new Empresa(cliente, modelo, fecha_e, fecha_d, Dias);
            if(Funcion.equals("Insertar"))
            {
                TLista.Insert(op);
            }
            else
            {
                int pos = TLista.Buscar(modelo);
                TLista.Edit( pos  , op);
            }
            frmEmpresa.MostrarDatos();
            this.dispose();
        }else {
            JOptionPane.showMessageDialog(null,"Ingrese todos los campos");
        }
    }
    */
    
    
    /**
     *  Colocar la fecha en los jdatechosser
     *  Esto sirve para el boton modificar
     */
    /**
    public void setDatos(Empresa op)
    {
       jTextField1.setText(op.getCliente());
       jComboBox1.setSelectedItem(String.valueOf(op.getModelo()));
       jDateChooser1.setDateFormatString(String.valueOf(op.getFe()));
       jDateChooser2.setDateFormatString(String.valueOf(op.getFd()));
       
   }
   */ 
    
    /**
     * Utilizar la diferencia de dias para calcular el importe
     */
    /**
    public double CalcularDescuento(){
        double total=0;
        if (dias>15){
                total = CalcularImporte()*0.10;
        }
        return total;
    }
    */
}
