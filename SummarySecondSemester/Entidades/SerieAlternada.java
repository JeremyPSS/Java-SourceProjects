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
public class SerieAlternada {
    private int n;

    public SerieAlternada() {
    }

    public SerieAlternada(int n) {
        this.n = n;
    }

    public void calcular(){
        String serie="1";
        String signo;
        if(n>0){
            for(int i=1;i<=n;i++){
                //signo= String.valueOf(Math.pow((-1), i+n));
                if(i%2==0){
                    signo="+";
                }else{
                    signo="-";
                }
                serie+= signo+"1/" +(i+1);
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
