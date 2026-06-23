package ExemploCliente;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class PrincipalCliente{
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in); 
         
        try{
            //criar entao o cliente socket e tentar se conectar ao servidor 
            Socket s = new Socket("localhost", 4567);
            System.out.println("Conexão estabelecida");

            //declarar os streams para comunicar-se com o servidor 
            DataOutputStream out = new DataOutputStream(s.getOutputStream());
            DataInputStream in = new DataInputStream(s.getInputStream());

            float x, y, resultado; 
            System.out.println("Digite um numero: ");
            x = teclado.nextFloat();
            System.out.println("Digite outro numero: ");
            y = teclado.nextFloat();
            //fiz a leitura dos dois numeros e vou enviar ao servidor 
            out.writeFloat(x);
            out.writeFloat(y); 
            //enviada a solicitação, aguarda a resposta 
            resultado = in.readFloat(); 
            System.out.println("Resultado: "+resultado);
            
            s.close(); 


        } catch (Exception e) {
            System.out.println("Erro na conexão: "+e.getMessage());
        }

        teclado.close();

    }
}