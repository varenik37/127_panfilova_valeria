import org.junit.*;
import org.junit.Assert;

public class Task1_Tests extends Assert {
    @Test
    public void createList_createEmptyList_ListIsEmpty() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        assertTrue(list.isEmpty());
    }

    @Test
    public void createList_createNewList_ListIsNotEmpty() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(3);
        assertFalse(list.isEmpty());
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

    @Test
    public void pushFront_PushFrontToEmptyList_NumberIncorrect() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(2);
        try {
            list.get(3);
            fail();
        } catch (IndexOutOfBoundsException e) {
            assertFalse(false);
        }
    }

    @Test
    public void pushFront_PushFrontToNotEmptyList_DataIsPushed() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(3);
        assertEquals(1, list.getSize());
    }

    @Test
    public void pushBack_PushBackToEmptyList_DataIsPushed() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(0);
        Node<Integer> Head = (Node<Integer>) list.getHead();
        Node<Integer> Tail = (Node<Integer>) list.getTail();
        assertEquals(0, Head.getData().intValue());
        assertEquals(0, Tail.getData().intValue());
    }

    @Test
    public void createNode_CreateNodeWithData_NextEqualsNull() {
        Node<Integer> node = new Node <>(34);
        assertNull(node.getNext());
    }

    @Test
    public void createNode_CreateNodeWithData_PrevEqualsNull() {
        Node<Integer> node = new Node <>(34);
        assertNull(node.getPrev());
    }

    @Test
    public void resize_SetSizeBiggerThanZero_NewSizeIsCorrect() {
        DynamicArray<Integer> array = new DynamicArray<>(1);
        array.resize(2);
        assertEquals(2, array.getSize());
    }

    @Test
    public void getSize_getSizeOfNewArray_SizeEqualsDefaultSize() {
        DynamicArray<Integer> array = new DynamicArray<>(DynamicArray.DefaultSize);
        assertEquals(1024, array.getSize());
    }

    @Test
    public void setValue_setNewValue_ValueIsCorrect() {
        DynamicArray<Integer> array = new DynamicArray<>(3);
        array.set(0, 1);
        assertEquals(1, array.get(0).intValue());
    }

    @Test
    public void set_setIndexEqualsSize_IndexOutOfBounds() {
        DynamicArray<Integer> array = new DynamicArray<>(3);
        try {
            array.set(3, DynamicArray.DefaultSize);
            fail();
        } catch (IndexOutOfBoundsException e) {
            assertEquals("Index out of bounds", e.getMessage());
        }
    }

    @Test
    public void get_getIndexEqualsSize_IndexOutOfBounds() {
        DynamicArray<Integer> array = new DynamicArray<>(3);
        try {
            array.get(3);
            fail();
        } catch (IndexOutOfBoundsException e) {
            assertEquals("Index out of bounds", e.getMessage());
        }
    }

    @Test
    public void insertIndex_IndexIsNotExist_IndexOutOfBounds() {
        DynamicArray<Integer> array = new DynamicArray<>(2);
        try {
            array.insert(2, DynamicArray.DefaultSize);
        } catch (IndexOutOfBoundsException e) {
            assertEquals("Index out of bounds", e.getMessage());
        }

    }

    @Test
    public void insert_InsertIndexInNotExistingSlot_ValueIsCorrect() {
        DynamicArray<Integer> array = new DynamicArray<>(3);
        array.set(0, 1);
        array.insert(0, 2);
        assertEquals(2, (int) array.get(0));
    }

    @Test
    public void remove_removeElementFromArray_ValueIsCorrect() {
        DynamicArray<Integer> array = new DynamicArray<>(3);
        array.set(0, 1);
        array.set(1, 2);
        array.remove(2);
        assertEquals(2, array.get(1).intValue());
    }

    @Test
    public void remove_removeElementNotExist_IndexOutOfBounds() {
        DynamicArray<Integer> array = new DynamicArray<>(3);
        try {
            array.remove(3);
            fail();
        } catch (IndexOutOfBoundsException e) {
            assertTrue(true);
        }
    }

    @Test
    public void pushBack_pushBackElement_ValueIsCorrect() {
        DynamicArray<Integer> array = new DynamicArray<>(3);
        array.set(0, 1);
        array.set(1, 2);
        array.pushBack(1);
        assertEquals(1, (int) array.get(3));
    }

    @Test
    public void popBack_popBackElementIsZero_ArrayIsEmpty() {
        try {
            DynamicArray<Integer> array = new DynamicArray<>(0);
            array.popBack();
            fail();
        } catch (UnsupportedOperationException e) {
            assertTrue(true);
        }
    }

    @Test
    public void popBack_popBackElement_ValueIsCorrect() {
        DynamicArray<Integer> array = new DynamicArray<>(3);
        array.set(0, 1);
        array.set(1, 2);
        array.set(2, 3);
        array.popBack();
        assertEquals(2, array.getSize());
    }
}
