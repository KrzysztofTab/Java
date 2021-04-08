package Example;

import Example.tools.DataExportException;
import Example.tools.NoSuchOptionException;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class TaskManager {
    private static final String FILE_NAME = "Zadania.csv";
    private final Queue<Task> taskQueue = new PriorityQueue<>(); // kolejka zadań "Queue" - "PriorityQueue" prorytet kolejki
    private final Scanner sc = new Scanner(System.in);

    void mainLoop() {
        Option option;
        do {
            printOptions();
            option = getOption();
            System.out.println(" ");
            switch (option) {
                case ADD -> {
                    taskQueue.offer(readAndCreateTask());
                    System.out.println("Zadanie dodane do kolejki");
                }
                case TAKE -> takeTask();
                case PRINT -> printTask();
                case EXIT -> exit();
                default -> System.out.println("Nie ma takiej obcji!");
            }
            System.out.println(" ");
        } while (option != Option.EXIT);
    }

    private void printTask() {
        if (taskQueue.isEmpty()) {
            System.out.println("Brak zadań do wyświetlenia");
        } else {
            for (Task task : taskQueue) {
                System.out.println(task);
//                to samo co powyżej  "iterator"
//              Iterator<Task> taskIterator = taskQueue.iterator();
//              while (taskIterator.hasNext()) {
//              Task task = taskIterator.next();
//              System.out.println(task);
            }
        }
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
            } catch (NoSuchOptionException e) {
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


      public void exit() {
       Queue<Task> taskQueue = new PriorityQueue<>();
        try (FileWriter fileWriter = new FileWriter(FILE_NAME);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for (Task writeTask : taskQueue) {
                bufferedWriter.write(writeTask.toCsv());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new DataExportException("Błąd zapisu danych do pliku " + FILE_NAME);
        }
    }

//        private void exit() {
//        try {
//            exportData((Task) taskQueue);
//            System.out.println("Export danych do pliku zakończony powodzeniem");
//        } catch (DataExportException e) {
//            System.out.println(e.getMessage());
//        }
//        System.err.println("\nKoniec programu!");
//    }


    private enum Option {
        ADD(0, "Dodaj zadanie"),
        TAKE(1, "Zrób kolejne zadanie"),
        PRINT(2, "Wyświetl wszystkie zadania"),
        EXIT(3, "Wyjdź");

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
                throw new NoSuchOptionException("Brak takiej opcji " + option);
            }
        }

        @Override
        public String toString() {
            return option + " - " + description;
        }
    }
}

