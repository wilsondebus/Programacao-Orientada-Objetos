package Servidor;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import model.Numero;
import model.Resposta; 

public class PrincipalServer {
    public static void main(String[] args) {
        
        try {
            ServerSocket servidor = new ServerSocket(1020); 
            System.out.println("Servidor criado com sucesso!");

            while(true) {
                Socket cliente = servidor.accept();
                
                ObjectOutputStream out = new ObjectOutputStream(cliente.getOutputStream()); 
                ObjectInputStream in = new ObjectInputStream(cliente.getInputStream()); 

                Numero n; //declarando, pois os valors de dentro da classe vem do cliente 
                Resposta res; 

                n = (Numero) in.readObject(); //leio o objeto do cliente, fazendo um cast

                System.out.println("Li do cliente: "+n.getX()+ " e "+n.getY());

                float resultado = n.getX() + n.getY(); 
                res = new Resposta (resultado);
                out.writeObject(res);
                cliente.close(); 

            }

        } catch (Exception e) {
            System.out.println("Erro na criação do servidor: "+e.getMessage());
        }
    }
}
