
public class ManejoPila {
    //clase de proposito general para establecer el manejo de la pila
    //debo tener 2 métodos para saber si esta lleno y vacio porque son dos req. de la pila y la tope
    //sino voy a crear objetos la variable debe ser statica
    //métodos pila insertar y sacar  elementos

    static int tope = 0;
    static int tamano=5;
    static String vectorPila[] = new String[10];

    // método para saber si la pila esta llena
    public static boolean pilaLlena(){
        if (tope >= tamano) {
            return true;
        } else {
            return false;
        }
    }

    // método para saber si esta vacia

    public static boolean pilaVacia(){
        if (tope > 0) {
            return false;
        } else {
            return true;
        }
    }

    // método para insertar elementos
    public static void ingresarElementoPila(String nombre){
        if(pilaLlena()==true){
            System.out.println("no hay espacio en la pila");
        }else{
            vectorPila[tope]=nombre;
            tope=tope+1;
            System.out.println("El elemento fue ingresado");
        }
    }

    // método para desapilar
    public static void elementoEliminarPila(){
            String txt = "";
            if(pilaVacia() == true){
                txt ="No hay elementos para desapilar";
                System.out.println(txt);
            }else{
                tope=tope-1;
                txt = "Se ha quitado el elemento "+vectorPila[tope];
                System.out.println(txt);
            }
    }

    // método para imprimri el vector

    public static void imprimirVector(){
        if (pilaVacia() == true){
            System.out.println("La pila esta vacia");
        }else{
           for (int i = 0; i<tope; i++){
               System.out.println("el nombre "+(i+1)+"es: "+vectorPila[i]);
               i++;
           }
        }
    }


}
