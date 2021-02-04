package Projekt01.Library.io.file;

import Projekt01.Library.model.Library;

public interface FileManager {
    Library importData();
    void exportData(Library library);
}
