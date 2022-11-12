
package Entidades;

/**
 *
 * @author Jeremy Prieto
 */
public class Alumno_e6 {
    private String nombre;
    private double n1,n2,n3;
    private String turno;
    private double promedio;

    public Alumno_e6() {
    }

    public Alumno_e6(String nombre, double n1, double n2, double n3, String turno) {
        this.nombre = nombre;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.turno = turno;
    }

    
    
    public void cacular(){
        
         promedio = (double)(n1+n2+n3)/(double)3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    
}
