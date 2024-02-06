package com.fppiramide.ejercicios;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio1 {

    public static void main(String[] args) {
        String nombreFichero = "src/com/fppiramide/recursos/texto.txt";

        System.out.printf("El fichero %s tiene %d vocales",nombreFichero, cuentaVocalesFichero(nombreFichero) );
    }

    public static int cuentaVocalesFichero(String nombreFichero) {

        int cuenta = 0;
        try(FileReader fr = new FileReader(nombreFichero)){

            int leido;

            while((leido = fr.read())!=-1){
                char carLeido = (char)leido;

                if( carLeido=='a'|| carLeido =='A'||
                    carLeido=='e'|| carLeido =='E'||
                    carLeido=='i'|| carLeido =='I'||
                    carLeido=='o'|| carLeido =='O'||
                    carLeido=='u'|| carLeido =='U')
                    cuenta++;
            }


        } catch (IOException e) {
            System.out.println("No se ha podido contar las vocales");;
        }

        return cuenta;
    }

}
