package mensajes_app;

public class Mensajes {
    int id_messages;
    String message;
    String autor_message;
    String fecha_message;

    public Mensajes(){

    }
    public Mensajes(int id_messages, String message, String autor_message, String fecha_message) {
        this.id_messages = id_messages;
        this.message = message;
        this.autor_message = autor_message;
        this.fecha_message = fecha_message;
    }

    public int getId_messages() {
        return id_messages;
    }

    public void setId_messages(int id_messages) {
        this.id_messages = id_messages;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAutor_message() {
        return autor_message;
    }

    public void setAutor_message(String autor_message) {
        this.autor_message = autor_message;
    }

    public String getFecha_message() {
        return fecha_message;
    }

    public void setFecha_message(String fecha_message) {
        this.fecha_message = fecha_message;
    }
}
