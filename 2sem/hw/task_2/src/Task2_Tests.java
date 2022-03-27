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
    public void bubbleSort_DataIsUnsorted_SortIsCorrect() {
        Integer[] data = {3, 5, 2, 1};
        BubbleSort<Integer> bsort = new BubbleSort<>();
        bsort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{1, 2, 3, 5}, data);
    }

    @Test
    public void bubbleSort_DataIsEqual_SortIsNotNeeded() {
        Integer[] data = {3, 3, 3, 3};
        BubbleSort<Integer> bsort = new BubbleSort<>();
        bsort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{3, 3, 3, 3}, data);
    }
}
