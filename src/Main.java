import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float limiteTarjeta;
        String nombreProducto;
        float valorProducto;
        int opcionMenu;

        Scanner teclado = new Scanner(System.in);



        ArrayList<Listado> compras = new ArrayList<>();




        System.out.println("Escribe el limite de la tarjeta: ");
        limiteTarjeta = teclado.nextFloat();


        while (true){
            Scanner in = new Scanner(System.in);
            if (limiteTarjeta==0){
                System.out.println("sin saldo#######");
                break;
            }

            System.out.println("Escriba la descripcion de la compra:");
            nombreProducto = in.nextLine();

            System.out.println("Escriba el valor de la compra:");
            valorProducto = in.nextFloat();

            if (valorProducto<=limiteTarjeta){

                compras.add(new Listado(nombreProducto, valorProducto));
                // Ordenando lista de compras
                Collections.sort(compras);

                limiteTarjeta -= valorProducto;

                System.out.println("Compra realizada!");

                System.out.println("Escribe 0 para salir 1 para continuar");

                opcionMenu = in.nextInt();

                if (opcionMenu==0){
                    System.out.println("#########################");

                    for (int i = 0; i < compras.size(); i++) {
                        System.out.println(compras.get(i));
                    }


                    System.out.println("#########################");
                    break;
                }

            }else{
                System.out.println("El saldo es insuficiente");
                System.out.println("#########################");

                for (int i = 0; i < compras.size(); i++) {
                    System.out.println(compras.get(i));
                }

                System.out.println("#########################");
                break;
            }
        }

        


    }

}