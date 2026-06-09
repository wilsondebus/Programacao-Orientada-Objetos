public class Principal {
    public static void main(String[] args) {
        

        ContaCorrente contaCorrente = new ContaCorrente(); 
        contaCorrente.depositar();
        contaCorrente.sacar();

        ContaInvestimento contaInvestimento = new ContaInvestimento();
        contaInvestimento.depositar();
        contaInvestimento.sacar();
        
    }
}
