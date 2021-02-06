package Projekt01.Library.io.file;

import Projekt01.Library.exception.NoSuchFileTypeException;
import Projekt01.Library.io.ConsolePrinter;
import Projekt01.Library.io.DataReader;

public class FileManagerBuilder {
    //    imortujemy dwie klasy
    private final ConsolePrinter printer;
    private final DataReader reader;

    //    tworzymy konstuktor
    public FileManagerBuilder(ConsolePrinter printer, DataReader reader) {
        this.printer = printer;
        this.reader = reader;
    }

    public FileManager bulid() {
        System.err.println("Wybierz format danych");
        FileType fileType = getFileType();
        return switch (fileType) {
            case SERIAL -> new SerializableFileManager();
            case CSV -> new CsvFileManager();
            default -> throw new NoSuchFileTypeException("Nieobsługiwany typ danych");
        };
    }

    private FileType getFileType() {
        boolean typeOk = false;
        FileType result = null;
        do {
            printTypes();
//            toUpperCase() zamienia małe litery na wielkie
            String type = reader.getString().toUpperCase();
            try {
                result = FileType.valueOf(type);
                typeOk = true;
            } catch (IllegalArgumentException e) {
                printer.printLine("Nieobsługiwany typ danych, wybierz ponownie.");
            }
        } while (!typeOk);

        return result;
    }

    private void printTypes() {
        for (FileType value : FileType.values()) {
            printer.printLine(value.name());
        }
    }
}