package com.mgu.java12;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Composition de deux collectors.
Chaque élément est traité par chacun des collectors.
A la fin le résultat des deux collectors est envoyée à un fonction de merge.

L'exemple suivant trouve la moyenne d'une liste de double.
Les premier collector calcule la somme totale des élements.
Le deuxième collector calcule le nombre d'éléments.
La fonction de merge divise la somme par le nombre d'élements.
 */
public class TeeingCollector {

    public static void main(String[] args) {
        var sumOfElements = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.summingDouble( i -> i));
        System.out.println(sumOfElements);

        var numberOfElements = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.counting());
        System.out.println(numberOfElements);

        double mean = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.teeing(Collectors.summingDouble(i -> i),
                        Collectors.counting(), (sum, count) -> sum / count));
        System.out.println(mean);
    }
}
