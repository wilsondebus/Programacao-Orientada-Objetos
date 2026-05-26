public class ReservaPresencial extends Reserva{
    
    public ReservaPresencial(String nomeCliente, int numeroQuarto, double valorDiaria, String statusreserva){
        super(nomeCliente, numeroQuarto, valorDiaria, statusreserva);
    }

    public void cancelarReserva(){
        System.out.println("Para cancelar a reserva compareça a recepção");
    }

    @Override
    public String toString() {
        return "Reserva Presencial \n Nome Cliente: " + nomeCliente + ", Numero Quarto: "
                + numeroQuarto + ", Valor Diaria: " + valorDiaria + ", Status Reserva: " + statusReserva;
    }

}
