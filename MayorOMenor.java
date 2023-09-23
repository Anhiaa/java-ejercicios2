import java.util.Scanner;

class MayorOMenor {
    public static void main(String[] args) {
    //Crear un objeto Scanner para leer la entrada del usuario
    Scanner scanner = new Scanner(System.in);

    //Solicitar al usuario que ingrese un numero
    int numero;
    System.out.println("Por favor, ingresa un numero: ");
    numero = scanner.nextInt();

    //Cerrar el objeto Scanner scanner.close();
    scanner.close();

    //Verificar si el numero es mayor que 10 y menor que 20
    if(numero > 10 && numero < 20){
        System.out.println("El numero cumple con la condicion");

    }else{
        System.out.println("El numero no cumple con la condicion");
    }
    }
} 