
import java.util.ArrayList;

public class Transbordador {
    private int peso_maximo_soportado;
    private int peso_actual;
    private ArrayList<Vehiculo> lista_vehiculos;

    public Transbordador(int peso_maximo_soportado){
        this.peso_actual=0;
        this.peso_maximo_soportado=peso_maximo_soportado;
        this.lista_vehiculos=new ArrayList<>();
    }

    public void cargaVehiculo(Vehiculo vehiculo1){
        if(vehiculo1.getpeso()+this.peso_actual<=peso_maximo_soportado){

            this.peso_actual=(this.peso_actual)+(vehiculo1.getpeso());
            lista_vehiculos.add(vehiculo1);

        }
        else{

            System.out.println("No es puede cargar, supera el peso máximo del transbordador");

        }
    }

    public void mostrar_vehiculos(){
        for(int i=0;i<lista_vehiculos.size();i++){
            System.out.println(lista_vehiculos.get(i).mostrarVehiculo());
        }
    }

    public void buscaVehiculo(int numOcupantes,int  peso){
        Vehiculo encontrado;
        ArrayList <Vehiculo> vehiculos_montador= new ArrayList<>();
        for (int i = 0; i<lista_vehiculos.size()-1;i++){
            if(lista_vehiculos.get(i).getnumOcupantes()==(numOcupantes) && lista_vehiculos.get(i).getpeso()==peso){
                encontrado=lista_vehiculos.get(i);
                System.out.print("Este vehiculo esta y tiene las siguientes caracteristicas"); 
                encontrado.mostrarVehiculo();
                
            }
            else{
                System.out.println("No se ha encontardo");
            }
        }
    }

    public void vaciarTransbordador(){
        this.peso_actual=0;
        lista_vehiculos.clear();
    }

    public String mostrar_transbordador(){
        return "El transbordador tiene un peso actual de "+this.peso_actual+ "  tiene un peso maximo soportao de "+peso_maximo_soportado;
    }
    
}
