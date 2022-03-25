import org.junit.*;

public class Task1_Tests extends Assert {
    @Test
    public void createList_createListWithNothing_ListIsEmpty() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        assertTrue(list.isEmpty());
    }

    @Test
    public void pushFront_PushFrontToEmptyList_DataIsPushed() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(0);
        Node<Integer> Head = (Node<Integer>) list.getHead();
        Node<Integer> Tail = (Node<Integer>) list.getTail();
        assertEquals(0, Head.getData().intValue());
        assertEquals(0, Tail.getData().intValue());
    }

    private int getIntDataValue(ListNode<Integer> item) {
        return ((Node<Integer>) item).getData();
    }

    @Test
    public void pushFront_PushFrontToNotEmptyList_DataIsPushed() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(0);
        list.pushFront(1);
        list.pushFront(2);
        assertEquals(1, getIntDataValue(list.get(1)));
    }
}
