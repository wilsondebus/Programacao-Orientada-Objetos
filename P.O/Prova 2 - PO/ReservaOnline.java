public class ReservaOnline extends Reserva{
 
    private double cupomDesconto; 

    public ReservaOnline(String nomeCliente, int numeroQuarto, double valorDiaria, String statusreserva, double cupomDesconto){
        super(nomeCliente, numeroQuarto, valorDiaria, statusreserva);
        this.cupomDesconto = cupomDesconto; 
    }

    public void realizarReserva(){
        System.out.println("Reserva realizada pelo "+nomeCliente);
        System.out.println(nomeCliente+" tem "+cupomDesconto+"% de desconto na reserva");
    }

    public void cancelarReserva(){
        System.out.println("A reserva só pode ser cancelada após 24 horas");
    }

    public double getCupomDesconto() {
        return cupomDesconto;
    }

    public void setCupomDesconto(double cupomDesconto) {
        this.cupomDesconto = cupomDesconto;
    }

    @Override
    public String toString() {
        return "Reserva Online \n Nome Cliente: " + nomeCliente + ", Cupom Desconto: " + cupomDesconto + ", Numero Quarto: "
                + numeroQuarto + ", Valor Diaria: " + valorDiaria + ", Status Reserva: " + statusReserva;
    }

    
}
