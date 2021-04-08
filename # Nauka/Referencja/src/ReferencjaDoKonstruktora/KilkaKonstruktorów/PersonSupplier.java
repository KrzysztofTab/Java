package ReferencjaDoKonstruktora.KilkaKonstruktorów;
//  metoda get() zdefiniowana w tym interfejsie ma trzy parametry
//  Tworzymy więc nowy interfejs funkcyjny, który będziemy mogli wykorzystać później w metodzie main().
//  Zgodnie z definicją, interfejs taki powinien posiadać tylko jedną metodę abstrakcyjną,
//  która będzie odpowiadała wcześniej przedstawionemu wyrażeniu lambda String[] fn, String[] ln, in[] a -> Person.

interface PersonSupplier {
    Person get(String[] firstName, String[] lastName, int[] ages);
}
