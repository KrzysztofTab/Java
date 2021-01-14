// warto pamiętać o tym, że wszystkie wyjątki dziedziczące po klasie RuntimeException nie muszą być obsługiwane,
// natomiast jeśli stworzymy klasę dziedziczącą po Exception, to wyjątek taki będzie musiał być obsłużony
//nazywanie swoich klas w taki sposób, aby zawierały one na końcu słowo Exception -
// dzięki trzymaniu się takiej konwencji wskazujemy jasno jej zastosowanie.

package WłasneWyjatki;

public class NoMoreSpaceException extends Exception{
    public NoMoreSpaceException(String message){
        super(message);
    }
}
