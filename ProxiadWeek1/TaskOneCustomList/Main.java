package ProxiadWeek1.TaskOneCustomList;

public class Main {
//    Да се имплементира структура, базирана върху масив, по подобие на ArrayList в Java.
//    Трябва да съдържа следните публични методи:
//
//  + add(E element) - void;
//	+ get(int index) - E;
//	+ contains(E element) – Boolean;
//	+ size() – int;
//	+ removeAt(int index) – E;

    public static void main(String[] args) {
        CustomArrayList first = new CustomArrayList(5);

        first.add(3);
        first.add(2);
        first.add(1);
        first.add(3);

        System.out.println("Get size of array. " + first.size());
        System.out.println("Element 4 is. " + first.get(4));
        System.out.println("Is contain number 3? " + first.contains(3));
        System.out.println("The size of the array is. " + first.size());
        first.removeAt(1);
        System.out.println("Is there a element ? " + first.get(1));

    }

}
