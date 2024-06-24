public class Vehiculo {
    /*
    * ATRIBUTOS
    */
    private String matricula;
    private int peso;
    private int numOcupantes;

    public Vehiculo(String matricula, int peso, int numOcupantes){
        /*
        * CONSTRUCTOR
        */
        this.matricula=matricula;
        this.peso=peso;
        this.numOcupantes=numOcupantes;
    }

    public String getMatricula(){
        return matricula;
    }

    public void setMatricula(String matricula){
        this.matricula=matricula;
    }

    public int getpeso(){
        return peso;
    }

    public void setPeso(int peso){
        this.peso= peso;
    }

    public int getnumOcupantes(){
        return numOcupantes;
    }

    public void setnumOcupantes(int numOcupantes){
        this.numOcupantes= numOcupantes;
    }

    public String mostrarVehiculo(){
        return "Vehículo con la matricula " +this.matricula+ " tiene un peso de " +this.peso+ " y " +this.numOcupantes+ " ocupantes";
    }

}
