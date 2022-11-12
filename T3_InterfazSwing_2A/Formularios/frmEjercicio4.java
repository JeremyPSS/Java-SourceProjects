/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Entidades.Alumno_e4;
import javax.swing.DefaultListModel;

/**
 *
 * @author Jeremy Prieto
 */
public class frmEjercicio4 extends javax.swing.JFrame {

    private DefaultListModel modelo1 = new DefaultListModel();
    private DefaultListModel modelo2 = new DefaultListModel();
    
    /**
     * Creates new form frmEjercicio4
     */
    public frmEjercicio4() {
        initComponents();
        setLocationRelativeTo(this);
        setSize(590,470);
        lstCursel.setModel(modelo1);
        lstCos.setModel(modelo2);
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        
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
        jLabel1 = new javax.swing.JLabel();
        txtAlu = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstCursos = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstCostos = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstCursel = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstCos = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        rbCon = new javax.swing.JRadioButton();
        rbCre = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtIncre = new javax.swing.JTextField();
        txtMonto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Alumno:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));
        getContentPane().add(txtAlu, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 140, -1));

        jLabel2.setText("Seleccionar Cursos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        lstCursos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Visual Basic", "Power Builder", "Visual Java", "Aplicaciones Web", "Internet" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstCursos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstCursosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstCursos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 120, 140));

        lstCostos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "180", "160", "150", "170", "140" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lstCostos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 40, 140));

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));

        lstCursel.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstCurselValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(lstCursel);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 110, 150));

        jScrollPane4.setViewportView(lstCos);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 60, 150));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Formas de pago"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(rbCon);
        rbCon.setText("Contado");
        jPanel1.add(rbCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 24, -1, -1));

        buttonGroup1.add(rbCre);
        rbCre.setText("Credito");
        jPanel1.add(rbCre, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 24, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 220, 70));

        jLabel3.setText("Total:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, -1, -1));
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 60, -1));

        jButton3.setText("CALCULAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, -1));

        jButton4.setText("LIMPIAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, -1, -1));

        jButton5.setText("CERRAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, -1, -1));

        jLabel4.setText("Cursos Seleccionados");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));

        jLabel5.setText("Descuento:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));
        getContentPane().add(txtDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 90, -1));

        jLabel6.setText("Incremento:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, -1, -1));

        jLabel7.setText("Monto a Pagar:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, -1, -1));
        getContentPane().add(txtIncre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 90, -1));
        getContentPane().add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 80, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lstCursosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstCursosValueChanged
        int indice;
        indice = lstCursos.getSelectedIndex();
        lstCostos.setSelectedIndex(indice);
        jButton1.setEnabled(true);
    }//GEN-LAST:event_lstCursosValueChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String curso, costo;
        int cuenta,i,total=0;
        curso = (String) lstCursos.getSelectedValue();
        costo = (String) lstCostos.getSelectedValue();
        modelo1.addElement(curso);
        modelo2.addElement(costo);
        cuenta = modelo2.size();
        for(i=0;i<cuenta;i++){
            total = total+Integer.parseInt((String)modelo2.elementAt(i));
        }
        txtTotal.setText(String.valueOf(total));
        jButton1.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lstCurselValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstCurselValueChanged
        int indice;
        indice = lstCursel.getSelectedIndex();
        lstCos.setSelectedIndex(indice);
        jButton2.setEnabled(true);
    }//GEN-LAST:event_lstCurselValueChanged

    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int indice,cuenta,i,total=0;
        indice=lstCursel.getSelectedIndex();
        modelo1.remove(indice);
        modelo2.remove(indice);
        cuenta = modelo2.size();
        for(i=0;i<cuenta;i++){
            total = total+Integer.parseInt((String)modelo2.elementAt(i));
        }
        txtTotal.setText(String.valueOf(total));
        jButton2.setEnabled(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//        double desc=0,incre=0,monto;
        int total;
        total=Integer.parseInt(txtTotal.getText());
        
//        if(rbCon.isSelected()){
//            desc=total*0.05;
//        }
//        if(rbCre.isSelected()){
//            incre=total*0.07;
//        }
//        monto=total-desc+incre;
//        txtDesc.setText(String.valueOf(desc));
//        txtIncre.setText(String.valueOf(incre));
//        txtMonto.setText(String.valueOf(monto));
        
        String FPago="",c="";
        if(rbCon.isSelected()){
            c="c";
            FPago="contado";
        }
        if(rbCre.isSelected()){
            c ="cr";
            FPago="credito";
        }
        String nombre = txtAlu.getText();
        Alumno_e4 oa = new Alumno_e4(nombre,FPago);
        oa.calcular(total, c);
        txtDesc.setText(String.valueOf(oa.getDescuento()));
        txtIncre.setText(String.valueOf(oa.getIncremento()));
        txtMonto.setText(String.valueOf(oa.getMPagar()));
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    public void Limpiar(){
        txtAlu.setText("");
        modelo1.clear();
        modelo2.clear();
        txtTotal.setText("");
        txtDesc.setText("");
        txtIncre.setText("");
        txtMonto.setText("");
        lstCursos.setSelectedIndex(5);
        lstCostos.setSelectedIndex(5);
        txtAlu.requestFocus();
    }
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Limpiar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(frmEjercicio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEjercicio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEjercicio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEjercicio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEjercicio4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> lstCos;
    private javax.swing.JList<String> lstCostos;
    private javax.swing.JList<String> lstCursel;
    private javax.swing.JList<String> lstCursos;
    private javax.swing.JRadioButton rbCon;
    private javax.swing.JRadioButton rbCre;
    private javax.swing.JTextField txtAlu;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtIncre;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}