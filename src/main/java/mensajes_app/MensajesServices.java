package mensajes_app;

import java.util.Scanner;

public class MensajesServices {
    public static void createMessage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa tu mensaje");
        String message = sc.nextLine();
        System.out.println("nombre del autor");
        String author = sc.nextLine();

        Mensajes messageNew = new Mensajes();
        messageNew.setMessage(message);
        messageNew.setAutor_message(author);

        MensajesDAO.createMessageDB(messageNew);
    }
    public static void readAllMessage(){
        MensajesDAO.readMessageDB();
    }
    public static void deleteMessage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa id del mensaje a borrar");
        int id = sc.nextInt();
        MensajesDAO.deleteMessageDB(id);
    }
    public static void editMessage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa tu nuevo mensaje");
        String message = sc.nextLine();
        System.out.println("ingresa id del mensaje a actualizar");
        int id = sc.nextInt();

        Mensajes messageNew = new Mensajes();
        messageNew.setMessage(message);
        messageNew.setId_messages(id);

        MensajesDAO.updateMessageDB(messageNew);
    }
}
