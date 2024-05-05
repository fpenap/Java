package Collections;

import java.util.ArrayList;
import java.util.List;

public class Hilos {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<Integer>();

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


        CercanoZeroHilo cercano = new CercanoZeroHilo((ArrayList<Integer>) numeros);
        LejanoCeroHilo lejano = new LejanoCeroHilo((ArrayList<Integer>) numeros);

        lejano.start();
        cercano.start();
    }
}