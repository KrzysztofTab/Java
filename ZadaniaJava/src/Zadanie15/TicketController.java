package Zadanie15;

import java.time.LocalDateTime;

public class TicketController {
    public static void main(String[] args) {
        Passenger[] passengers = new  Passenger[5];
        passengers[0] = new Passenger("Jan", "Kowalski");
        passengers[1] = new Passenger("Anna", "Abacka");
        passengers[2] = new Passenger("Wojciech", "Głowacki");
        passengers[3] = new Passenger("Katarzyna", "Szelest");
        passengers[4] = new Passenger("Piotr", "Zakątek");

        TicketMachine.buyTicket(passengers[0],15 ); // pasażer kupił bilet ważny - 15 min
        TicketMachine.buyTicket(passengers[2],30 ); // pasażer kupił bilet ważny - 30 min
        Ticket invalidTicket = new Ticket(LocalDateTime.now().minusMinutes(20), 15); //bilet kupiony 20 minut temu na 15 minut
        passengers[1].setTicket(invalidTicket);

        Passenger[] passengersWithoutTicket = validateTickets(passengers);
        System.out.println("Na gapę jadą:");
        for (Passenger passenger : passengersWithoutTicket) {
            System.out.println(passenger.getFirstName() + " " + passenger.getLastName());
        }
     }

     /*
     wywołujemy metodę validateTickets(), której przekazujemy jako argument tablicę naszych pasażerów
     (oznaczamy ją jako static, ponieważ main też jest statyczna). W metodzie znajdują się dwie pętle.
     Pierwsza, for-each, zlicza ilość osób bez biletu, czyli takich, których pole ticket jest równe null
     lub jeśli mają przypisany bilet to metoda isValid() zwraca dla takiego biletu wartość false.
     Zgodnie z treścią zadania metoda ma zwrócić tablicę pasażerów jadących bez ważnego biletu,
     tworzymy więc tablicę withoutTicket o rozmiarze równym ilości gapowiczów i przechodzimy do kolejnej pętli.
      */
    private static Passenger[] validateTickets(Passenger[] passengers) {
        int passengersWithoutTicket = 0;
        for (Passenger passenger : passengers) {
            Ticket ticket = passenger.getTicket();
            if(ticket == null || !ticket.isValid())
                passengersWithoutTicket++;
    }
        Passenger[] withoutTicket = new Passenger[passengersWithoutTicket];
        // w pętli for każdy element jest opcjonalny, więc jak najbardziej prawidłowe jest
        // zapisanie pętli for takiej postaci: for(;;){}
        // i - pozwala iterować po wszystkich pasażerach
        // j - zapamiętuje, na które miejsce mamy wstawić kolejnego gapowicza do tablicy withoutTicket
        for (int i = 0, j = 0; i < passengers.length; i++) {
            Ticket ticket = passengers[i].getTicket();
            if(ticket == null || !ticket.isValid()) {
                withoutTicket[j] = passengers[i];
                j++;
            }
        }
        return withoutTicket;
    }
}
