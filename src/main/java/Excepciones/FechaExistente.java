
package Excepciones;

public class FechaExistente extends Exception{
    String message;
    
    public FechaExistente(String message){
        super(message);
    }
}
