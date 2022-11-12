/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import javax.swing.JOptionPane;

/**
 *
 * @author WUSUARIO
 */
public class SerieGeometrica {
    private int n;

    public SerieGeometrica() {
    }

    public SerieGeometrica(int n) {
        this.n = n;
    }

    public void calculo(){
        String serie="1";
        if(n>0){
            for(int i=1;i<=n;i++){
                serie+="+ 1/"+Math.pow(2,i);
            }
        }else{
            serie+="...error......";
        }
        JOptionPane.showMessageDialog(null, serie);
    }
    
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    
}
