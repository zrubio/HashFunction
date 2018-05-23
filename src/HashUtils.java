import java.security.MessageDigest;

public class HashUtils {

    public static void main(String[] args) {

        try{
            // Obtiene una instancia MessageDigest con el algoritmo SHA
            MessageDigest messageDigest = MessageDigest.getInstance("SHA");
            String mensaje = "Hola";
            byte[] mensajeBytes = mensaje.getBytes();
            // Datos que se quieren calcular
            messageDigest.update(mensajeBytes);
            // Datos calculados
            byte[] mensajeCalculado = messageDigest.digest();
            System.out.println("Mensaje original: "+mensaje);
            System.out.println("Mensaje calculado: "+new String(mensajeCalculado));
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }


}
