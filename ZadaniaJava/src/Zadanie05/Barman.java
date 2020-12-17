//Zdefiniuj klasę Barman, która posiada metodę createDrink przyjmującą jako argumenty nazwy
// oraz ilość 3 składników potrzebnych do przygotowania drinka.

package Zadanie05;

public class Barman {

    //    metoda, odpowiedzialna za tworzenie drinka,
    public static Drink createDrink(String ingredient1, double amount1, String ingredient2, double amount2,
                                    String ingredient3, double amount3) {
        Ingredient ing01 = new Ingredient(ingredient1, amount1);
        Ingredient ing02 = new Ingredient(ingredient2, amount2);
        Ingredient ing03 = new Ingredient(ingredient3, amount3);
        return new Drink(ing01, ing02, ing03);
    }

    //    metoda, odpowiedzialna za wyswietlanie drinka,
    public static void printDrink(Drink drink) {

//         obliczamy ilościową sumę wszystkich składników danego drinka
        double ingredientSum = drink.getIngredient01().getAmount() +
                drink.getIngredient02().getAmount() +
                drink.getIngredient03().getAmount();

//        tworzymy trzy zmienne, do których przypisujemy procentowy udział danego składnika w drinku (proporcje)
        double ing01Part = drink.getIngredient01().getAmount() / ingredientSum;
        double ing02Part = drink.getIngredient02().getAmount() / ingredientSum;
        double ing03Part = drink.getIngredient03().getAmount() / ingredientSum;

//        %.2f oznacza liczbę zmiennoprzecinkową zaokrągloną do dwóch miejsc po przecinku,
//        %0f oznacza liczbę zmiennoprzecinkową bez części dziesiętnej (używamy %f a nie %d,
//        ponieważ posługujemy się typem double a nie int).
//        %s oznacza wartość typu String
        System.out.printf("Składniki drinka to: %s, %s, %s " + "\n" +
                        "w proporcjach %.2f, %.2f, %.2f." + "\n" +
                        "Jego pojemność to %.0fml\n",
                drink.getIngredient01().getNazwa(), drink.getIngredient02().getNazwa(),
                drink.getIngredient03().getNazwa(),
                ing01Part, ing02Part, ing03Part,
                ingredientSum);
    }
}