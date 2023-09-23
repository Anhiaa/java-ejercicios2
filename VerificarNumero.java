import java.util.Scanner;
public class VerificarNumero {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int numero = scanner.nextInt();

        if(numero <50 || numero > 100){
            System.out.println("El numero es menor que 50 o mayor que 100.");

        }else{
            System.out.println("El numero cumpe con los requisitos.");
        }
        scanner.close();
    }
    
}
