import java.util.Scanner;

public class VerificarAcceso {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre de usuario:");
        String nombreUsuario = scanner.nextLine();
        System.out.println("Ingrese su contraseña:");
        String contraseña = scanner.nextLine();
        
        if(nombreUsuario.equals("usuario.valido") && contraseña.equals("contraseñavalida"))
        {
            System.out.println("Acceso concedido.");
        } else {
            System.out.println("Acceso denegado.");
        }
        scanner.close();

    }
}
