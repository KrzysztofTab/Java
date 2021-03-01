package Example;

import java.util.InputMismatchException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class TaskManager {

    private final Queue<Task> taskQueue = new PriorityQueue<>(); // kolejka zadań "Queue" - "PriorityQueue" prorytet kolejki
    private final Scanner sc = new Scanner(System.in);

    void mainLoop() {
        Option option;
        do {
            printOptions();
            option = getOption();
            switch (option) {
                case ADD -> {
                    taskQueue.offer(readAndCreateTask());
                    System.out.println("Zadanie dodane do kolejki");
                }
                case TAKE -> takeTask();
                case EXIT -> System.out.println("Koniec!");
                default -> System.out.println("Nie ma takiej obcji!");
            }
        } while (option != Option.EXIT);
    }

    private Option getOption() {
        boolean optionOk = false;
        Option option = null;
        System.out.println("Wybierz opcję:");
        while (!optionOk) {
            try {
                option = Option.createFromInt(sc.nextInt());
                optionOk = true;
            } catch (InputMismatchException ignored) {
                System.out.println("Wprowadzono wartość, która nie jest liczbą: ");
            }catch (NoSuchOptionException e ){
                System.out.println(e.getMessage() + ", wybierz:");
            } finally {
                sc.nextLine();
            }
        }
        return option;
    }

    private void takeTask() {
        if (taskQueue.isEmpty()) {
            System.out.println("Brak zadań do wykonania");
        } else {
            Task nextTask = taskQueue.poll();
            System.out.print("Zadanie do wykonania: ");
            System.out.println(nextTask);
        }
    }

    private Task readAndCreateTask() {
        System.out.println("Podaj nazwę zadania:");
        String name = sc.nextLine();
        System.out.println("Podaj opis zadania:");
        String description = sc.nextLine();
        System.out.print("Podaj priorytet, ");
        for (Task.Priority priority : Task.Priority.values()) {
            System.out.print(priority + " - ");
        }
        System.out.println();
        Task.Priority priority = Task.Priority.valueOf(sc.nextLine().toUpperCase());
        return new Task(name, description, priority);
    }

    private void printOptions() {
        Option[] values = Option.values();
        for (Option value : values) {
            System.out.println(value);
        }
    }

    private enum Option {
        ADD(0, "Dodaj zadanie"),
        TAKE(1, "Zrób kolejne zadanie"),
        EXIT(2, "Wyjdź");

        int option;
        String description;

        Option(int option, String description) {
            this.option = option;
            this.description = description;
        }

        static Option createFromInt(int option) throws NoSuchOptionException {
            try {
                return values()[option];
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new  NoSuchOptionException("Brak takiej opcji " + option);
            }
        }

        @Override
        public String toString() {
            return option + " - " + description;
        }
    }
}
