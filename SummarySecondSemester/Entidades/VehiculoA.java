package Entidades;

import javax.swing.JOptionPane;

/**
 * @author WUSUARIO
 * @version 1.0
 * @created 22-feb-2021 08:28:04 a.m.
 */
public class VehiculoA {

	private int IdVehiculo;
	private String Marca;
	private String Placa;
	private ChoferA m_Chofer; //Esto quiere decir que esta asociado con la otra clase
          //OJO no es nesesario poner este parametro en el UML, por que ya lo genera automaticamente


	public VehiculoA(){

	}

	public VehiculoA(int id, String mar, String plac, ChoferA oc){
            this.IdVehiculo=id;
            this.Marca=mar;
            this.Placa=plac;
            this.m_Chofer=oc;
	}

	public int getIdVehiculo(){
		return IdVehiculo;
	}


	public void setIdVehiculo(int newVal){
		IdVehiculo = newVal;
	}

	public String getMarca(){
		return Marca;
	}

	public void setMarca(String newVal){
		Marca = newVal;
	}

	public String getPlaca(){
		return Placa;
	}

	public void setPlaca(String newVal){
		Placa = newVal;
	}

	public void Imprimir(){
            JOptionPane.showMessageDialog(null,"Placa: " + Placa + "\nMarca: " + Marca );
            m_Chofer.Imprimir();
	}

        
        
}