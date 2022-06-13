public class Program {
    public static void main(String[] args) {
        System.out.println("Offset_hash_1");
        HashTable hashTable = new OffsetHashTable(13);

        hashTable.insert(20);
        hashTable.print();
        System.out.println();

        hashTable.insert(97);
        hashTable.print();
        System.out.println();

        hashTable.insert(30);
        hashTable.print();
        System.out.println();

        hashTable.insert(97);
        hashTable.print();
        System.out.println();

        hashTable.insert(82);
        hashTable.print();
        System.out.println();

        hashTable.insert(25);
        hashTable.print();
        System.out.println();

        hashTable.insert(63);
        hashTable.print();
        System.out.println();

        hashTable.insert(73);
        hashTable.print();
        System.out.println();

        hashTable.insert(4);
        hashTable.print();
        System.out.println();

        hashTable.insert(25);
        hashTable.print();
        System.out.println();

        hashTable.insert(32);
        hashTable.print();
        System.out.println();

        hashTable.insert(65);
        hashTable.print();
        System.out.println();

        System.out.println("Offset_hash_2");

        HashTable hashTable1 = new OffsetHashTable(19);

        hashTable1.insert(2);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(64);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(54);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(69);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(37);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(63);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(10);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(12);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(12);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(44);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(37);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(58);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(32);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(83);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(68);
        hashTable1.print();
        System.out.println();

        hashTable1.remove(12);
        hashTable1.print();
        System.out.println();

        hashTable1.remove(68);
        hashTable1.print();
        System.out.println();

        hashTable1.remove(44);
        hashTable1.print();
        System.out.println();

        hashTable1.remove(54);
        hashTable1.print();
        System.out.println();

        hashTable1.remove(69);
        hashTable1.print();
        System.out.println();

        System.out.println("Offset_hash_3");

        HashTable hashTable2 = new OffsetHashTable(19);

        hashTable2.insert(23);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(28);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(33);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(50);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(3);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(93);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(83);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(90);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(56);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(56);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(50);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(13);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(56);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(33);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(90);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(77);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(23);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(46);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(77);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(28);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(41);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(60);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(86);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(41);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(23);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(50);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(83);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(13);
        hashTable2.print();
        System.out.println();

        System.out.println("List_hash_1");
        HashTable listHashTable = new ListHashTable(13);

        listHashTable.insert(55);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(75);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(25);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(34);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(52);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(41);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(70);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(32);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(62);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(9);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(7);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(66);
        listHashTable.print();
        System.out.println();

        System.out.println("List_hash_2");

        HashTable listHashTable1 = new ListHashTable(19);

        listHashTable1.insert(65);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(55);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(63);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(75);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(4);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(60);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(16);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(51);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(91);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(26);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(43);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(3);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(26);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(26);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(57);
        listHashTable1.print();
        System.out.println();

        listHashTable1.remove(91);
        listHashTable1.print();
        System.out.println();

        listHashTable1.remove(60);
        listHashTable1.print();
        System.out.println();

        listHashTable1.remove(75);
        listHashTable1.print();
        System.out.println();

        listHashTable1.remove(65);
        listHashTable1.print();
        System.out.println();

        listHashTable1.remove(3);
        listHashTable1.print();
        System.out.println();

        System.out.println("List_hash_3");

        HashTable listHashTable2 = new ListHashTable(19);


        listHashTable2.insert(47);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(72);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(19);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(85);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(45);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(93);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(81);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(57);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(24);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(61);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(26);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(54);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(72);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(57);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(61);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(74);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(76);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(20);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(19);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(45);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(7);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(2);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(45);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(2);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(24);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(20);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(85);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(54);
        listHashTable2.print();
        System.out.println();
    }
}