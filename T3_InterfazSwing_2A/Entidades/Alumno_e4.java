
package Entidades;

/**
 *
 * @author Jeremy Prieto
 */
public class Alumno_e4 {
    private String nombre;
    private String FPago;
    private double MPagar;
    private double descuento;
    private double incremento;

    public Alumno_e4() {
    }

    public Alumno_e4(String nombre, String FPago) {
        this.nombre = nombre;
        this.FPago = FPago;
        this.MPagar = MPagar;
    }

    public void calcular(int t,String x){
    
        double total = t;
        if(x.equals("c")){
            descuento=total*0.05;
        }
        if(x.equals("cr")){
            incremento=total*0.07;
        }
        MPagar=total-descuento+incremento;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getFPago() {
        return FPago;
    }

    public void setFPago(String FPago) {
        this.FPago = FPago;
    }

    public double getMPagar() {
        return MPagar;
    }

    public void setMPagar(double MPagar) {
        this.MPagar = MPagar;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getIncremento() {
        return incremento;
    }

    public void setIncremento(double incremento) {
        this.incremento = incremento;
    }
    
    
    
    
    
}
