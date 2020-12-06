package SwitchCase;

class HelloName {

    public static void main(String[] args) {
        final String krzysiek = "Krzysiek";
        final String maciek = "Maciek";
        final String marek = "Marek";

        String name = "Marek";

        switch (name) {
            case krzysiek:
                System.out.println("Siemano Krzychu! Witaj w programie.");
                break;
            case maciek:
            case marek:
                System.out.println("Witam Panie Prezesie. Jak mija dzień?");
                break;
            default:
                System.out.println("Witaj nieznany użytkowniku!");
        }
    }
}
