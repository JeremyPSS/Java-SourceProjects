package Entidades;

/**
 * @author Jeremy Prieto
 * @version 1.0
 * @created 15-mar-2021 08:12:32 a.m.
 */
public interface Figura {
        //En las interfaces no van atributos, por lo tanto tampoco van contructores
        //Y en sus clases hijas que estan relacionadas con REALIZACION, no va la palabra
        //EXTENDS, lo que va es IMPLEMENTS (algo asi)
        //Similar a la herencia y clases abstractas, pero no igual
	public double Area();

	public void Imprimir();

}