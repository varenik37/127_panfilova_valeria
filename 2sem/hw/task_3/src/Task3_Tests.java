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

    @Test
    public void mergeSort_dataIsUnsorted_sortIsCorrect() {
        Integer[] data = {3, 5, 2, 1};
        MergeSort<Integer> mSort = new MergeSort<>();
        mSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{1, 2, 3, 5}, data);
    }

    @Test
    public void mergeSort_dataWithFirstUnsortedNumber_sortIsCorrect() {
        Integer[] data = {2, 1, 5};
        MergeSort<Integer> mSort = new MergeSort<>();
        mSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{1, 2, 5}, data);
    }

    @Test
    public void mergeSort_dataWithManyNumbers_sortIsCorrect() {
        Integer[] data = {1, 5, 3, 6, 2, 8, 4, 7, 9, 10};
        MergeSort<Integer> mSort = new MergeSort<>();
        mSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, data);
    }

    @Test
    public void mergeSort_twoUnsortedNumbers_sortIsCorrect() {
        Integer[] data = {5, 1};
        MergeSort<Integer> mSort = new MergeSort<>();
        mSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{1, 5}, data);
    }

    @Test
    public void mergeSort_evenData_sortIsCorrect() {
        Integer[] data = {3, 5, 2, 1};
        MergeSort<Integer> mSort = new MergeSort<>();
        mSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{1, 2, 3, 5}, data);
    }

    @Test
    public void mergeSort_invertedData_sortIsCorrect() {
        Integer[] data = {5, 3, 2, 1};
        MergeSort<Integer> mSort = new MergeSort<>();
        mSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{1, 2, 3, 5}, data);
    }
}
