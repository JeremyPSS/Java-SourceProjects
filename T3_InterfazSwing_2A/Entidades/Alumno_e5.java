
package Entidades;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeremy Prieto
 */
public class Alumno_e5 {
    private String nombre;
    private String categoria;
    private String Fpago;
    private double Matricula;
    private double CostoT;
    private double PsgoM;

    public Alumno_e5() {
    }

    public Alumno_e5(String nombre, String categoria, String Fpago, double CostoT,double Matricula) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.Fpago = Fpago;
        this.CostoT = CostoT;
        this.Matricula=Matricula;
    }

    public void Calcular(float ctotal){
//        int cuenta = cu;
//        float mat=0,ctotal=0,pmen=0;
//        for(int i=0;i<cuenta;i++){
////            ctotal = ctotal+Float.parseFloat((String)model4.elementAt(i));
//            ctotal = ctotal+Float.parseFloat((String)model4.elementAt(i));
//            
//        }
//        if(ctotal==0){
//            JOptionPane.showMessageDialog(null,"Selecciona y agrega el menos un curso");
//            return;
//        }
//        if(cuenta==1) mat =ctotal+0.8f;
//        if(cuenta==2) mat =ctotal+0.6f;
//        if(cuenta>=3) mat =ctotal+0.5f;
//        if(cboFPago.getSelectedItem().equals("<Seleccionar>")){
//            ctotal=ctotal*1.1f;
//            JOptionPane.showMessageDialog(null, "Selecciona una forma de pago");
//            return;
//        }
//        if(cboFPago.getSelectedItem().equals("Contado")){
//            ctotal=ctotal*0.9f;
//            pmen=0;
//        }
//        if(cboFPago.getSelectedItem().equals("Credito")){
//            ctotal=ctotal+1.1f;
//            JOptionPane.showMessageDialog(null, "Ctotal es"+ctotal);
//            pmen=ctotal/4;
//            JOptionPane.showMessageDialog(null, "Pmen es"+pmen);
//        }
//        
//        float pmen=0;
        
        CostoT = ctotal;
        if(Fpago.equals("<Seleccionar>")){
            CostoT=CostoT*1.1f;
            JOptionPane.showMessageDialog(null, "Selecciona una forma de pago");
            return;
        }
        if(Fpago.equals("Contado")){
            CostoT=CostoT*0.9f;
            PsgoM=0;
        }
        if(Fpago.equals("Credito")){
            CostoT=CostoT+1.1f;
            JOptionPane.showMessageDialog(null, "Ctotal es"+CostoT);
            PsgoM=CostoT/4;
            JOptionPane.showMessageDialog(null, "Pmen es"+PsgoM);
        }
        
        
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFpago() {
        return Fpago;
    }

    public void setFpago(String Fpago) {
        this.Fpago = Fpago;
    }

    public double getMatricula() {
        return Matricula;
    }

    public void setMatricula(double Matricula) {
        this.Matricula = Matricula;
    }

    public double getCostoT() {
        return CostoT;
    }

    public void setCostoT(double CostoT) {
        this.CostoT = CostoT;
    }

    public double getPsgoM() {
        return PsgoM;
    }

    public void setPsgoM(double PsgoM) {
        this.PsgoM = PsgoM;
    }
    
    
    
    
}
