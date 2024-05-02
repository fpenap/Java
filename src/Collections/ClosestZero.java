package Collections;


import java.util.ArrayList;
import java.util.List;

public class ClosestZero {

    public static void main (String[] args){

        List<Integer> numeros = new ArrayList<Integer>();
        int res;

        /*
        for(int i=0; i<=10; i++){

            numeros.add(i);
        }
        */

        numeros.add(8);
        numeros.add(-10);
        numeros.add(54);
        numeros.add(102);
        numeros.add(-20);
        numeros.add(-73);
        numeros.add(4);
        numeros.add(9);
        numeros.add(29);
        numeros.add(-12);
        numeros.add(-1);


        res = closestZero((ArrayList<Integer>) numeros);

        System.out.println("El numero mas cercano es el: " + res);

    }

    public static int closestZero(ArrayList<Integer> numeros){

        int res = numeros.get(0);

        for (Integer numero : numeros) {

            int temp;

            if (numero < 0) {
                temp = numero * (-1);
            } else {
                temp = numero;
            }

            if (temp <= res) {
                res = numero;
            }
        }

        return res;
    }
}
