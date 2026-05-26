import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        ArrayList<Conta> contas = new ArrayList<>(); 

        contas.add(new Conta(1, "Wilson", 250)); 
        contas.add(new Conta(2, "Henriquue", 400));
        contas.add(new Conta(3, "Juliano", 9000)); 
        contas.add(new Conta(4, "Gabriel", 19500)); 

        Conta contaComMaiorSaldo = contas.get(0); 

        for(Conta conta : contas){
            if(conta.getSaldo() > contaComMaiorSaldo.getSaldo()){
                contaComMaiorSaldo = conta; 
            }
        }

        System.out.println("Conta com maior saldo: ");
        System.out.println(contaComMaiorSaldo);
        
    }
}
