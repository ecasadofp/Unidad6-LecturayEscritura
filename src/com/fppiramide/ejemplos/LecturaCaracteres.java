package com.fppiramide.ejemplos;
/*
Ejemplo de lectura de caracteres con try con recursos
 */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LecturaCaracteres {
    public static void main(String[] args) {

        try(FileReader fr = new FileReader("texto.txt")){
            int leido;
            while((leido=fr.read())!=-1)
                System.out.print((char) leido);

        } catch (FileNotFoundException e) {
            System.out.println("Sin fichero");
        } catch (IOException e) {
            System.out.println("No se puede leer");
        }
    }
}
