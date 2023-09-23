import java.util.Scanner;

public class DeterminarAprobacion {


public static void main(String[]args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese la nota del estudiante:");
    int nota = scanner.nextInt();

    if(nota >= 100) {
        System.out.println("El estudiante ha aprobado.");
    }else{
        System.out.println("El estudiante no ha aprobado.");
    }

    scanner.close();

    }
}

