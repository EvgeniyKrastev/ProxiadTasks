package ProxiadWeek1.TaskOneCustomList;

/**
 * //   + add(E element) - void;
 * //	+ get(int index) - E;
 * //	+ contains(E element) – Boolean;
 * //	+ size() – int;
 * //	+ removeAt(int index) – E;
 */
class CustomArrayList {

    private int numberOfElements;
    private int counterOfContainedElements = 0;
    private int[] array;

    CustomArrayList(int numberOfElements) {
        this.numberOfElements = numberOfElements;
        this.array = new int[numberOfElements]; // Създайте масив с желания размер
    }

    void add(int element) {
        if (counterOfContainedElements >= numberOfElements) {
            throw new ArrayIndexOutOfBoundsException("No more space to add elements.");
        }
        array[counterOfContainedElements] = element;
        ++counterOfContainedElements;
    }

    int get(int index) {
        if (index < 0 || index >= counterOfContainedElements) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        return array[index];
    }

    boolean contains(int element) {
        for (int i = 0; i < counterOfContainedElements; i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }

    int size() {
        return counterOfContainedElements;
    }

    void removeAt(int index) {
        if (index < 0 || index >= counterOfContainedElements) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        array[index] = array[counterOfContainedElements - 1];
        counterOfContainedElements--;
    }
}