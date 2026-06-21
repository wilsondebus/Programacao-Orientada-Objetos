import java.util.Scanner; 

public abstract class Conta{
    
    Scanner teclado = new Scanner(System.in); 

    float saldo;
    float limite; 

    abstract void depositar(); 

    abstract void sacar(); 

}