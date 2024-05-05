package Collections;

import java.util.*;

public class CreacionHashSet {

    public static void main(String[] args){

        Scanner lectura = new Scanner(System.in);
        String nombre = null;

        Set nombres = new HashSet<String>();

        do{
            System.out.println("Ingrese un nombre: ");

            nombre = lectura.next();

            nombres.add(nombre);

        }while(!nombre.equals("0"));

        System.out.println(nombres);

        int numero = (int) (Math.random() * nombres.size()) + 1;

        System.out.println(numero);

        Map dato = new HashMap();
        dato.put(numero, nombres.toArray()[numero]);

        System.out.println(dato);
    }
}
