/*
Klasy anonimowe mogą być tworzone w taki sposób nie tylko na podstawie interfejsów,
 ale także na podstawie zwykłych i abstrakcyjnych klas. Klasy anonimowe nie posiadają swojej nazwy,
mogą wykorzystywać zmienne lokalne metody, w której są zdefiniowane,
ale zmienne te muszą być finalne lub efektywnie finalne (mogą być przypisane tylko raz),
mogą korzystać ze składowych głównej klasy, w której się znajdują, nie mogą posiadać konstruktorów,
mogą definiować dodatkowe pola i metody, których nie ma w interfejsie lub klasie na podstawie którego są tworzone.
 */

package KlasyAnonimowe;

public class CompareNumbers {
    public static void main(String[] args) {
        int[] tab = {5, 10, -8, -23, 1009, 2938, 153, 24};
        BiggestNumber nc = new BiggestNumber() {
            @Override
            public int takeBiggest(int[] tab) {
                if (tab == null)
                    throw new NullPointerException("Argument cannot be null");
                if (tab.length == 0)
                    throw new IllegalArgumentException("Array has to have a last 1 value");

                int biggestNumber = tab[0];
                for(int i=1; i<tab.length;i++){
                    if (biggestNumber < tab[i]){
                        biggestNumber = tab[i];
                    }
                }
                return biggestNumber;
            }
        };
        System.out.println("Największa z liczb to: " + nc.takeBiggest(tab));
    }
}
