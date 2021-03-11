package ProjektyWlasne.P07;

import java.io.FileNotFoundException;


public class CompanyApp {
    public static void main(String[] args) throws FileNotFoundException {
        CompanyIO company = new CompanyIO();
        company.mainLoop();

    }
}