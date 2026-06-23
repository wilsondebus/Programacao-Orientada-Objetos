import java.io.DataInput; 
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class PrincipalServer{
    public static void main(String[] args) {
        
        try{
            //Criar o server socket e definir a porta de funcionamento 
            ServerSocket servidor = new ServerSocket(4567); 
            System.out.println("Server socket criado com sucesso!");

            while(true){
                //servidor aguarda uma conexeão de algum cliente 
                //o servidor bloqueia nesta linha enquanto o cliente não chega 
                //e quando o cliente conecta, ai ele segue o fluxo 
                Socket cliente = servidor.accept(); 
                //consigo fazer a leitura do que o cliente está me enviando 
                //esses dois objetos vão ser os streams de comunicação com o cliente 
                DataOutputStream out = new DataOutputStream(cliente.getOutputStream()); 
                DataInputStream in = new DataInputStream(cliente.getInputStream());

                //consigo fazer a leitura do que o cliente esta me enviando 
                float x, y, resposta; 
                //DataInputStream - leio o que o cliente envia 
                x = in.readFloat();
                y = in.readFloat(); 
                //consegui obter a solicitação do cliente 
                System.out.println("Cliente envio: "+x+" e "+y);

                resposta = x + y;

                out.writeFloat(resposta);
                cliente.close(); 

            }
        } catch (Exception e){
            System.out.println("Exceção ocorrida: "+e.getMessage());
        }
    }
}