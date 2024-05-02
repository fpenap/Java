package Collections;

import java.util.ArrayList;

public class LejanoCeroHilo extends Thread{

    ArrayList<Integer> numeros = null;
    public LejanoCeroHilo(ArrayList<Integer> numeros){
        this.numeros = numeros;
    }
    @Override
    public void run() {
        int res = numeros.get(0);

        for (Integer numero : numeros) {

            int temp;

            if (numero < 0) {
                temp = numero * (-1);
            } else {
                temp = numero;
            }

            if (temp >= res) {
                res = numero;
            }

            System.out.println("Lejano: " + numero);
        }
        System.out.println("El numero mas lejano a cero es: " + res);

        /*
        for(Integer numero : numeros){
            System.out.println("Lejano: " + numero);
        }
        */
    }

}
