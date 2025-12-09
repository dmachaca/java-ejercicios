package pe.com.den;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.next();
        System.out.println("¡Hola "+nombre+"!");
    }
}