import org.junit.*;

public class Task3_Tests extends Assert {
    class TestComparator implements MyComparator<Integer> {
        @Override
        public int compare(Integer first, Integer second) {
            return first - second;
        }
    }

    @Test
    public void quickSort_twoUnsortedNumbers_sortIsCorrect() {
        Integer[] data = {5, 1};
        QuickSort<Integer> qSort = new QuickSort<>();
        qSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{1, 5}, data);
    }

    @Test
    public void quickSort_dataWithRepeatingNumbers_sortIsCorrect() {
        Integer[] data = {1, 5, 3, 2, 5};
        QuickSort<Integer> qSort = new QuickSort<>();
        qSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{1, 2, 3, 5, 5}, data);
    }

}
