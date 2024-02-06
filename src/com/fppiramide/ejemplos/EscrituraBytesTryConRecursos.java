package com.fppiramide.ejemplos;
/*
Ejemplo de escritura en un fichero de bytes con try con recursos
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscrituraBytesTryConRecursos {

    public static void main(String[] args) {

        try(FileOutputStream fos = new FileOutputStream("src/com/fppiramide/recursos/datos.dat")) {

            fos.write(65);

        }catch (FileNotFoundException f){
            System.out.println("No he encontrado el fichero");
        }catch (IOException e){
            System.out.println("Problemas con el flujo de datos");
        }
    }

}
