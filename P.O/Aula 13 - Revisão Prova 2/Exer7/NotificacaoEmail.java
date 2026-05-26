public class NotificacaoEmail extends Notificacao{
    
    public NotificacaoEmail(String mensagem){
        super(mensagem); 
    }

    public void enviar(){
        System.out.println("Enviando email..."+mensagem);
    }

    public void enviar(String destinatario1){
        System.out.println("Enviando email..."+mensagem+" para "+destinatario1);
    }

    public void enviar(String destinario1, String destinatario2){
        System.out.println("Enviando email..."+mensagem+" para "+destinario1+" e "+destinatario2);
    }
    
}
