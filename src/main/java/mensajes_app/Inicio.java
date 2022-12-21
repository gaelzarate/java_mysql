package mensajes_app;

import java.sql.Connection;
import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("-------------------------");
            System.out.println("1. crear mensaje");
            System.out.println("2. listar mensajes");
            System.out.println("3. eliminar mensaje");
            System.out.println("4. editar mensaje");
            System.out.println("5. salir");
            option = sc.nextInt();

            switch (option){
                case 1:
                    MensajesServices.createMessage();
                    break;
                case 2:
                    MensajesServices.readAllMessage();
                    break;
                case 3:
                    MensajesServices.deleteMessage();
                    break;
                case 4:
                    MensajesServices.editMessage();
                    break;
                default:
                    break;
            }
        }while (option != 5);

    }

}
