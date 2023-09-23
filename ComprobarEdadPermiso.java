import java.util.Scanner;

public class ComprobarEdadPermiso {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la edad de la persona: ");
        int edad = scanner.nextInt();

        System.out.println("¿La persona tiene permiso de conducir?(si/no):");
        String permiso = scanner.next();

        if(edad >= 18 && permiso.equalsIgnoreCase("Si")){
            System.out.println("La persona es mayor de edad y tiene un permiso de conducir.");
        }else{
            System.out.println("La persona no cumple con los requisitos.");
        }
        scanner.close();
    }
}

