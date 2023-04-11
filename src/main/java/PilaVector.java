import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PilaVector {

    public static void imp(String mensaje){
        System.out.println(mensaje);
    }

    public static String lea(String txt){
        String data = "";
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        try{
            imp(txt);
            data=teclado.readLine();
        }catch (IOException error){
            System.out.println("Se cometio el error "+error);
        }
        return data;
    }

    public static void main(String[] args) {
        int options = 0;
        imp("PROGRAMA MANEJO DE PILA CON UN VECTOR");

        do{
            options=Integer.parseInt(lea("\n Menu principal\n 1. Ingresar Nombre\n 2.eliminar nombre"+
                    "\n 3.Imprimir nombres \n 0. Salir"));
            switch (options){
                case 1:
                    String nombre = lea("Digite el nombre para ingresarlo");
                    ManejoPila.ingresarElementoPila(nombre);
                    break;
                case 2:
                    ManejoPila.elementoEliminarPila();
                    break;
                case 3:
                    ManejoPila.imprimirVector();
                    break;
                case 0:
                    imp("FIN PROGRAMA");
                    break;
                default:
                    imp("INGRESO UN NÚM INCORRECTO");
                    break;
            }
        }while (options !=0);
    }
}
