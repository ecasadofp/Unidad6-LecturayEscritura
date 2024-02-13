package com.fppiramide.ejemplos;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class LecturaScanner {
    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("src/com/fppiramide/recursos/datos.txt")) {
            Scanner sc = new Scanner(fis);
            String leido;
            double total = 0;
            while ((sc.hasNextDouble()))
                total += sc.nextDouble();
            System.out.println(total);
        } catch (IOException ex) {
            System.out.println("No se ha podido leer el fichero");
        }
    }
}