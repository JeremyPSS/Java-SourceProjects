package Entidades;

import javax.swing.JOptionPane;

/**
 * @author WUSUARIO
 * @version 1.0
 * @created 22-feb-2021 08:27:56 a.m.
 */
public class ChoferA {
    //ESTA clase es normal
	private int IdChofer;
	private String Nombres;
	private int Edad;
	private char Sexo;

	public ChoferA(){

	}

	public ChoferA(int id, String nom, int eda, char sex){
            this.IdChofer=id;
            this.Nombres=nom;
            this.Edad=eda;
            this.Sexo=sex;
	}

	public void Imprimir(){
            JOptionPane.showMessageDialog(null, "Codigo: " + IdChofer + "\nNombre: " + Nombres + "\nEdad: " + Edad );
	}

	public String getNombres(){
		return Nombres;
	}
	public void setNombres(String newVal){
		Nombres = newVal;
	}
	public int getIdChofer(){
		return IdChofer;
	}	
	public void setIdChofer(int newVal){
		IdChofer = newVal;
	}
	public int getEdad(){
		return Edad;
	}
	
	public void setEdad(int newVal){
		Edad = newVal;
	}
	public char getSexo(){
		return Sexo;
	}
	
	public void setSexo(char newVal){
		Sexo = newVal;
	}
}