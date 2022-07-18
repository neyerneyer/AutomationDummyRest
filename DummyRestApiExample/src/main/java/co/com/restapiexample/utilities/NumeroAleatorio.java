package co.com.restapiexample.utilities;

import java.util.Random;

public class NumeroAleatorio {

    public static Object generarNumero(){
        Random r = new Random();
        return r.nextInt(23) + 1;
    }
}