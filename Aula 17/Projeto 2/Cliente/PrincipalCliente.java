package Cliente;

import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import model.Numero;
import model.Resposta; 

public class PrincipalCliente {
    public static void main(String[] args) {
        
        try{
            Socket s = new Socket("localhost", 1020); 
            System.out.println("Conexão efetuada com sucesso");

            ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());
            ObjectInput in = new ObjectInputStream(s.getInputStream());

            Numero n = new Numero(13.4f, 4.77f); 
            //enviando o objeto
            out.writeObject(n); 

            Resposta res; 
            //obter retorno do servidor
            res = (Resposta) in.readObject(); 

            System.out.println("Resposta: "+res.getResultado());

            s.close(); 

        } catch (Exception e) {
            System.out.println("Erro: "+e.getMessage());
        }
    }
}
