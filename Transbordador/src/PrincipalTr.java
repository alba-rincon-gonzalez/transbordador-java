import java.util.Scanner;

public class PrincipalTr {
    public static void main(String []args){

        Scanner teclado=new Scanner(System.in);
        Scanner teclado_string=new Scanner(System.in);
        boolean salir=false;
        System.out.println("BIENVENIDO AL PROGRAMA DE TRANSBORDADORES");
        System.out.println("-------------------------------------------");
        System.out.println("¿Qué peso tiene el transbordador?");
        int num=teclado.nextInt();
        Transbordador trns1=new Transbordador(num);

        while(!salir){
            System.out.println("¿Que quieres hacer?");
            System.out.println("1. Añadir un vehículo al transbordador");
            System.out.println("2. Mostrar los vehículos del transbordador");
            System.out.println("3. Salir del programa");
            int opcion=teclado.nextInt();

            switch(opcion){

                case 1:
                    System.out.println("¿Cuantos ocupantes hay en el vehículo?");
                    int ocupantes=teclado.nextInt();
                    System.out.println("¿matricula del vehículo?");
                    String matricula=teclado_string.nextLine();
                    System.out.println("Dime el peso del vehiculo");
                    int peso=teclado.nextInt();
                    Vehiculo vehiculo1=new Vehiculo(matricula, peso, ocupantes);
                    trns1.cargaVehiculo(vehiculo1);
                    break;
                case 2:
                    System.out.println(trns1.mostrar_transbordador());
                    trns1.mostrar_vehiculos();
                    break;
                case 3:
                    System.out.println("Finalizando el programa");
                    salir=true;
                    teclado_string.close();
                    teclado.close();
                    break;
            }
        }
    }
}

