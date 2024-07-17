package revisions;

// 163	Manipulation	d’un	tableau	de	type
// ArrayList

// On	dispose	d’un	objet	tab	déclaré	ainsi	:
// ArrayList	<Integer>	tab	;
// Écrire	les	instructions	réalisant	les	actions	suivantes	sur	les	valeurs	de	tab	:
// •	affichage	dans	l’ordre	naturel	(on	proposera	au	moins	4	solutions)	;
// •	affichage	dans	l’ordre	inverse	(au	moins	2	solutions)	;
// •	affichage	des	éléments	de	rang	pair	(0,	2,	4…)	(au	moins	2	solutions)	;
// •	mise	à	zéro	des	éléments	de	valeur	négative	(au	moins	2	solutions).

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.stream.IntStream;

public class UtilTab {
    public static void main(String[] args) {
        ArrayList<Integer> tab = new ArrayList<>();
        tab.add(3);
        tab.add(-7);
        tab.add(2);
        tab.add(10);
        tab.add(-5);
        tab.add(8);

        // Affichage dans l'ordre naturel
        System.out.println("Affichage dans l'ordre naturel (Solution 1) :");
        for (Integer value : tab) {
            System.out.println(value);
        }

        System.out.println("Affichage dans l'ordre naturel (Solution 2) :");
        for (int i = 0; i < tab.size(); i++) {
            System.out.println(tab.get(i));
        }

        System.out.println("Affichage dans l'ordre naturel (Solution 3) :");
        tab.stream().forEach(System.out::println);

        System.out.println("Affichage dans l'ordre naturel (Solution 4) :");
        Iterator<Integer> iterator = tab.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Affichage dans l'ordre inverse
        System.out.println("Affichage dans l'ordre inverse (Solution 1) :");
        for (int i = tab.size() - 1; i >= 0; i--) {
            System.out.println(tab.get(i));
        }

        System.out.println("Affichage dans l'ordre inverse (Solution 2) :");
        ListIterator<Integer> listIterator = tab.listIterator(tab.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        // Affichage des éléments de rang pair
        System.out.println("Affichage des éléments de rang pair (Solution 1) :");
        for (int i = 0; i < tab.size(); i += 2) {
            System.out.println(tab.get(i));
        }

        System.out.println("Affichage des éléments de rang pair (Solution 2) :");
        IntStream.range(0, tab.size())
                 .filter(i -> i % 2 == 0)
                 .mapToObj(tab::get)
                 .forEach(System.out::println);

        // Mise à zéro des éléments de valeur négative
        System.out.println("Mise à zéro des éléments de valeur négative (Solution 1) :");
        for (int i = 0; i < tab.size(); i++) {
            if (tab.get(i) < 0) {
                tab.set(i, 0);
            }
        }
        System.out.println(tab);

        // Remettre des valeurs négatives pour la deuxième solution
        tab.set(1, -7);
        tab.set(4, -5);

        System.out.println("Mise à zéro des éléments de valeur négative (Solution 2) :");
        listIterator = tab.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next() < 0) {
                listIterator.set(0);
            }
        }
        System.out.println(tab);
    }
}
