package Controlador;
import Entidades.Persona;
import Formularios.frmAdminPersona;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 * @author JeremyPrieto
 * @version 1.0
 * @created 13-mar-2021 10:24:18 a.m.
 */
public class TLista {

	public static List<Persona> ListaP = new ArrayList<Persona>();
//	private static final int Max=5;
//	private static int N;
//	public static TLista(){
//
//	}
	public static void Add(Persona op){
            ListaP.add(op);

	}
	public static void Edit(Persona op, int pos){
            ListaP.set(pos, op);

	}
	public static void Delete(int pos){
            ListaP.remove(pos);

	}
	public static int Buscar(String ced){
            int pos = -1;
            for(int i=0; i < ListaP.size() ; i++)
            {
                if(ListaP.get(i).getCedula().equals(ced))
                {
                    pos = i;
                    return pos;
                }
            }
            return pos;
	}
//	public static void ImprimirLista(){
//
//	}

//	public static int Count(){
//		return 0;
//	}

	
	public static Persona getPersona(int pos){
		return ListaP.get(pos);
	}

	public static DefaultTableModel Visualizar(){
            String[] Titulos = {"CEDULA", "NOMBRE","APELLIDOS","SEXO","EDAD"};//Titulos para las columnas de las tablas
            String[] Registros = new String[5];
            DefaultTableModel dtm=new DefaultTableModel(null,Titulos);//Crecaion de la tabla aun virtual
                for(int i=0; i < ListaP.size() ; i++){
                   Registros[0] =  ListaP.get(i).getCedula();
                   Registros[1] =  ListaP.get(i).getNombre();
                   Registros[2] =  ListaP.get(i).getApellido();
                   Registros[3] =  String.valueOf(ListaP.get(i).getSexo());
                   Registros[4] =  String.valueOf(ListaP.get(i).getEdad());

                   dtm.addRow(Registros);//Creacion de una nueva fila o columna creo
                }
                return dtm;//retornar la tabla
        }

	public static void Intercambiar(int i, int j){
            Persona aux = new Persona();
            aux = getPersona(i); ListaP.set(i, getPersona(j));
            ListaP.set(j, aux) ;

	}

	public static void OrdenacionIntercambio(){
            for(int i=0;i < ListaP.size()-1 ;i++){
                for(int j=i+1;j<ListaP.size();j++){
                    if(ListaP.get(i).getEdad() > ListaP.get(j).getEdad()){
                    Intercambiar(i, j);
                    }
                }
            }
	}

        /**
         * Ordenacion por dato EDAD
         * En cada interacion, se selecciona el menor elemento dle subvector no ordenado y se intecambia con el primer elemento
         * de este subvector
         */
	public static void OrdenacionSeleccion(){
            Persona tmp = null; //Un espacio reservado para un objeto
            int i,j,pos_min;
            int N = ListaP.size(); //Tamaño de la lista
            
            for(i=0;i<N-1;i++){
                pos_min=i;
                for(j=i+1;j<N;j++){
                    if(ListaP.get(j).getEdad()<ListaP.get(pos_min).getEdad()){ //Compara las edades
                        pos_min=j;
                    }
                }
                tmp = ListaP.get(i); //Guarda el objeto en el objeto auxiliar
                ListaP.set(i, ListaP.get(pos_min)); //Superpone el objeto en la lista en la posicion del for
                ListaP.set(pos_min, tmp); 
            }
	}


        /**
         * En cada iteracion, se inserta un elemento del subvector no ordenado en la posicion correcta dentro del subvector ordenado
         */
	public static void OrdenacionInsercion(){
            Persona tmp = null;
            int i,j;
            int N = ListaP.size();
            
            for(i=1;i<N;i++){
                tmp = ListaP.get(i); //en tmp se guarda un objeto, por lo que se incializar como un objeto
                for(j=i; (j>0)&&(tmp.getEdad()<ListaP.get(j-1).getEdad());j--){ 
                    ListaP.set(j, ListaP.get(j-1));
                }
                ListaP.set(j, tmp);
            }
	}

	/**
         * OrdenacionBurbuja
         */
	public static void OrdenacionShell(){
            Persona tmp = null;
            int i,j;
            int N = ListaP.size();
            for(i=1;i<N;i++){
                for(j=N-1;j>=i;j--){
                    if(ListaP.get(j).getEdad()<ListaP.get(j-1).getEdad()){
                        tmp = ListaP.get(j);
                        ListaP.set(j, ListaP.get(j-1));
                        ListaP.set(j-1, tmp);
                    }
                }
            }

	}

        
        
	/**
         * 1.Se toma un elemento arbitario del vector, al que dneominaremos pivote(p)
         * 2.Se divide el vector de tal forma que todos los elementos a la izquierda del pivote sean menores que el, mientras
         * que los que quedan a la derecha son mayores que el
         * 3.Ordenamos, por separado, las dos zonas delimitadas por el pivote
         */
	public static void OrdenacionQuicksort(int izda,int dcha){
            int pivote;
            if(izda<dcha){
                pivote = partir(izda,dcha);
                OrdenacionQuicksort(izda,pivote-1); //Osea creo que se puede invocar al mismo metodo dentro del el 
                OrdenacionQuicksort(pivote+1,dcha);
            }
	}
        public static int partir(int primero,int ultimo){
            double pivote = ListaP.get(primero).getEdad();
            Persona temporal = null;
            int izda = primero+1;
            int dcha = ultimo;
            do{
                while((izda<=dcha)&&(ListaP.get(izda).getEdad()<=pivote)){
                    izda++;
                }
                while((izda<=dcha)&&(ListaP.get(dcha).getEdad()>pivote)){
                    dcha--;
                }
                if(izda<dcha){
                    temporal = ListaP.get(izda);
                    ListaP.set(izda, ListaP.get(dcha));
                    ListaP.set(dcha, temporal);
                    dcha--;
                    izda++;
                }
            }while (izda <=dcha);
            
            temporal = ListaP.get(primero);
            ListaP.set(primero, ListaP.get(dcha));
            ListaP.set(dcha, temporal);
            return dcha;
        }

        /**
         * Busca por cedula y me devuelve la posicion del objeto
         */
	public static int BusquedaSecuencial(String ced){
            int i;
            int N = ListaP.size();
            int pos=-1;
            for(i=0;i<N;i++){
                if(ListaP.get(i).getCedula().equals(ced)){
                    pos=i;
                }
            }
            return pos;
	}
        /**
         * Version mejorada de BusquedaSecuancial
         */
        public static int BusquedaSecuencialMejorada(String ced){
            int i;
            int N = ListaP.size();
            int pos = -1;
            for(i=0;(i<N)&&(pos==-1);i++){
                if(ListaP.get(i).getCedula().equals(ced)){
                    pos = i;
                }
            }
            return pos;
        }

	/**
         * Busqueda binaria de un elemento en un vector
         * -Devuelve la posicion de "dato" en el vector
         * -Si"dato" no esta en el vector, devuelve -1;
         */
	public static int BusquedaBinaria(int eda){
            int izq=0;
            int der = ListaP.size()-1;
            int centro = (izq+der)/2;
            while((izq<=der)&&(ListaP.get(centro).getEdad()!=eda)){
                if(eda<ListaP.get(centro).getEdad()){
                    der = centro-1;
                }else{
                    izq=centro+1;
                }
                centro=(izq+der)/2;
            }
            if(izq>der){
                return -1;
            }else{
                return centro;
            }
	}

}