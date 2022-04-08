import org.junit.*;
import org.junit.Assert;

public class Task2_Tests extends Assert {
    static class TestComparator implements MyComparator<Integer> {
        @Override
        public int compare(Integer first, Integer second) {
            return first - second;
        }
    }

    @Test
    public void bubbleSort_dataIsUnsorted_sortIsCorrect() {
        Integer[] data = {3, 2, 1};
        BubbleSort<Integer> bSort = new BubbleSort<>();
        bSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{1, 2, 3}, data);
    }

    @Test
    public void bubbleSort_dataIsEqual_sortIsNotNeeded() {
        Integer[] data = {3, 3, 3, 3};
        BubbleSort<Integer> bSort = new BubbleSort<>();
        bSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{3, 3, 3, 3}, data);
    }

    @Test
    public void insertionSort_dataIsEqual_sortIsNotNeeded() {
        Integer[] data = {3, 3, 3, 3};
        InsertionSort<Integer> iSort = new InsertionSort<>();
        iSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{3, 3, 3, 3}, data);
    }

    @Test
    public void insertSort_dataIsUnsorted_sortIsCorrect() {
        Integer[] data = {3, 5, 2, 1};
        InsertionSort<Integer> iSort = new InsertionSort<>();
        iSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{1, 2, 3, 5}, data);
    }

    @Test
    public void selectionSort_twoUnsortedNumbers_sortIsCorrect() {
        Integer[] data = {15, 5};
        SelectionSort<Integer> sSort = new SelectionSort<>();
        sSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{5, 15}, data);
    }

    @Test
    public void selectionSort_invertedData_sortIsCorrect() {
        Integer[] data = {3, 2};
        SelectionSort<Integer> sSort = new SelectionSort<>();
        sSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{2,3}, data);
    }

    @Test
    public void selectionSort_dataIsUnsorted_sortIsCorrect() {
        Integer[] data = {7, 5, 3, 1};
        SelectionSort<Integer> sSort = new SelectionSort<>();
        sSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{1, 3, 5, 7}, data);
    }



}
