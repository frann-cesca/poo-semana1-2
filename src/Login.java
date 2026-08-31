import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String usuarioCorrecto = "admin";
        String claveCorrecta = "1234";

        System.out.print("Usuario: ");
        String usuario = scanner.nextLine();

        System.out.print("Contraseña: ");
        String clave = scanner.nextLine();

        if (usuario.equals(usuarioCorrecto) && clave.equals(claveCorrecta)) {
            System.out.println("Login exitoso");
            System.out.println("Bienvenido, " + usuario);
        } else {
            System.out.println("Usuario o contraseña incorrectos");
        }

        scanner.close();
    }
}