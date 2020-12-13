package Zadanie05;

public class Drink {
//    klasa posiada pola będące innym typem obiektowym nazywamy w programowaniu obiektowym agregacją
//     Zachodzi przy tym relacja "ma/posiada", czyli w naszym przypadku "drink ma 3 składniki"
    private Ingredient ingredient01;
    private Ingredient ingredient02;
    private Ingredient ingredient03;

    public Drink(Ingredient ingredient01, Ingredient ingredient02, Ingredient ingredient03) {
        this.ingredient01 = ingredient01;
        this.ingredient02 = ingredient02;
        this.ingredient03 = ingredient03;
    }

    public Ingredient getIngredient01() {
        return ingredient01;
    }

    public void setIngredient01(Ingredient ingredient01) {
        this.ingredient01 = ingredient01;
    }

    public Ingredient getIngredient02() {
        return ingredient02;
    }

    public void setIngredient02(Ingredient ingredient02) {
        this.ingredient02 = ingredient02;
    }

    public Ingredient getIngredient03() {
        return ingredient03;
    }

    public void setIngredient03(Ingredient ingredient03) {
        this.ingredient03 = ingredient03;
    }
}
