/* widać operacje wykonywane przy pomocy klasy BigDecimal są jednak zdecydowanie mniej wygodne,
   ponieważ w ich przypadku nie możemy posługiwać się operatorami matematycznymi,
   a zamiast tego niezbędne jest wywoływanie odpowiednich metod jak add().
*/

package Zadanie09;

import java.math.BigDecimal;
import java.util.Scanner;

public class NumberReader2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        double nr = sc.nextInt();
        sc.close();
        BigDecimal limit = BigDecimal.valueOf(nr);
        if (nr > 0)
            for (BigDecimal i = BigDecimal.ZERO; i.compareTo(limit) <= 0; i = i.add(BigDecimal.valueOf(0.1)))
                System.out.print(i.toString() + "  ");
        else if (nr < 0)
            for (BigDecimal i = BigDecimal.ZERO; i.compareTo(limit) >= 0; i = i.subtract(BigDecimal.valueOf(0.1)))
                System.out.print(i.toString() + "  ");
    }
}