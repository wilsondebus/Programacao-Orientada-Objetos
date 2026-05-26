import java.util.Scanner; 
import java.util.ArrayList; 

public class Principal {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        Reserva reserva = new Reserva("Wilson", 10, 300, "Pago"); 
        reserva.realizarReserva();
        reserva.cancelarReserva();
        System.out.println("-----------------------------");

        ReservaOnline reservaOnline = new ReservaOnline("Pedro", 9, 300, "Pendente", 10); 
        reservaOnline.realizarReserva();
        reservaOnline.cancelarReserva();
        System.out.println("-----------------------------");

        ReservaPresencial reservaPresencial = new ReservaPresencial("Henrique", 8, 300, "Pago"); 
        reservaPresencial.realizarReserva();
        reservaPresencial.cancelarReserva();
        System.out.println("-----------------------------");

        ArrayList <Reserva> reservas = new ArrayList<>(); 

        reservas.add(new ReservaOnline("Marcos", 8, 350, "Pago", 20)); 
        reservas.add(new ReservaPresencial("Denise", 9, 400, "Pago")); 
        reservas.add(new ReservaOnline("Luisa", 5, 350, "Pendente", 5));
        reservas.add(new ReservaPresencial("Claudio", 120, 600, "Pago"));

        for(Reserva r : reservas){
            System.out.println(r);
            System.out.println();
        }

        teclado.close(); 
    }
}
