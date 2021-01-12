package ShirtShop;

public enum Size {
//    Nasz typ wyliczeniowy ma nazwę ShirtShop.Size i ma zdefiniowane trzy wartości - SMALL, MEDIUM, LARGE
//    ( możemy przypisac tylko jedną wartość ),
//    które wymieniamy po przecinku. Zgodnie z konwencją nazewnictwa traktujemy te wartości analogicznie
//    jak stałe klasy i zapisujemy WIELKIMI literami.

    SMALL("Mały"), MEDIUM("Sredni"), LARGE("Duży");
    private final String description;

    //    Konstruktor jest zawsze 'private'
    Size(String description) {
        this.description = description;
    }

    //    do opisu konkretnej wartoci trakujemy jako stałe wiec tworzymy tylko 'get'
    public String getDescription() {
        return description;
    }

    public static Size fromDescription(String description) {
        Size[] values = values();
        for (Size size : values) {
            if (size.getDescription().equals(description))
                return size;
        }
        return null;
    }

    @Override
    public String toString() {
        return "opis: " + description + ", nazwa: " + name() + ", nr: " + ordinal();
    }
}
