public class Reserva {

    protected String nomeCliente;
    protected int numeroQuarto;
    protected double valorDiaria;
    protected String statusReserva; 

    public Reserva(String nomeCliente, int numeroQuarto, double valorDiaria, String statusReserva){
        this.nomeCliente = nomeCliente;
        this.numeroQuarto = numeroQuarto;
        this.valorDiaria = valorDiaria;
        this.statusReserva = statusReserva; 
    }

    public void realizarReserva(){
        System.out.println("Reserva realizada!");
    }

    public void cancelarReserva(){
        System.out.println("Reserva cancelada!");
    }

    @Override
    public String toString() {
        return "Reserva nomeCliente=" + nomeCliente + ", numeroQuarto=" + numeroQuarto + ", valorDiaria=" + valorDiaria
                + ", statusReserva=" + statusReserva;
    }
}
