package com.fppiramide.ejemplos;
/*
Ejemplo de escritura en un fichero de datos sin utilizar
try con recursos
 */
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscrituraBytesClasico {
    public static void main(String[] args) {
        FileOutputStream fos = null;

        try {

            fos = new FileOutputStream("datos.dat");

            fos.write(66);

        }catch(FileNotFoundException e){

            System.out.println("No se puede acceder al fichero");

        }catch (IOException e){
            System.out.println("No se ha podido escribir en el fichero");
        }finally {
            if(fos!=null)
            try {

                fos.close();
            } catch (IOException e) {
                System.out.println("Problemas con el cierre del fichero");;
            }
        }
    }
}
