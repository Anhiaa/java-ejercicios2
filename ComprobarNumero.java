import java.util.Scanner;

public class ComprobarNumero {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un numero: ");
        int numero = scanner.nextInt();

        if(numero > 0 && numero != 0) {

            System.out.println("El numero es positivo y no es igual a cero.");
        }else{
            System.out.println("El numero no cumple con las condiciones.");
        }
        scanner.close();//Agrega esta linea para cerrar el objeto Scanner
    }
}
