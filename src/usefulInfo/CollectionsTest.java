package usefulInfo;

import java.util.*;

public class CollectionsTest {
    public static void main(String[] args) {
        Set<Integer> mySet = new TreeSet<>(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                if (o1 < o2) {
                    return -1;
                } else {
                    if (o1.equals(o2)) {
                        return 0;
                    } else {
                        return 1;
                    }
                }
            }
        });

        mySet.add(1);
        mySet.add(2);
        mySet.add(1);
        System.out.println(mySet);


        NavigableSet<Integer> mySortedSet = new TreeSet<>(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                if (o1 < o2) {
                    return -1;
                } else {
                    if (o1.equals(o2)) {
                        return 0;
                    } else {
                        return 1;
                    }
                }
            }
        });

        for (int i = 1; i <= 10; i++) {
            mySortedSet.add(i);
        }

        System.out.println(mySortedSet);
        System.out.println(getNextElement(5, mySortedSet));
        System.out.println("=== Methods NavigableSet<E> ===");
        System.out.println("lower >> " + mySortedSet.lower(5));
        System.out.println("higher >> " + mySortedSet.higher(5));
        System.out.println("headSet >> " + mySortedSet.headSet(5));
        System.out.println("tailSet >> " + mySortedSet.tailSet(5));
        System.out.println("descendingSet >> " + mySortedSet.descendingSet());


        Map<Object, String> myHashMap = new HashMap<>();
        myHashMap.put(5, "a");
        myHashMap.put(4, "b");
        myHashMap.put(3, "c");
        myHashMap.put(2, "d");
        myHashMap.put(1, "e");
        System.out.println("myHashMap = " + myHashMap);

        Map<Integer, String> myLinkedHashMap = new LinkedHashMap<>(5, 1, true);
        myLinkedHashMap.put(5, "a");
        myLinkedHashMap.put(4, "b");
        myLinkedHashMap.put(3, "c");
        myLinkedHashMap.put(2, "d");
        myLinkedHashMap.put(1, "e");
        myLinkedHashMap.get(3);
        myLinkedHashMap.get(5);
        myLinkedHashMap.get(1);
        System.out.println("myLinkedHashMap = " + myLinkedHashMap);


        Map<Integer, String> mySimpleRU = new SimpleLRUCache<>(2);
        mySimpleRU.put(1, "e");
        mySimpleRU.put(2, "d");
        mySimpleRU.put(3, "c");
        mySimpleRU.get(2);
        mySimpleRU.put(9, "g");
        System.out.println(mySimpleRU);


        Map<Object, String> myWeakMap = new WeakHashMap<Object, String>();
        Object obj = new Object();
        myHashMap.put(obj, "information");
        obj = null;
        System.gc(); // Garbage Collector

        for (int i = 0; i < 10000; i++) {
            if (myWeakMap.isEmpty()) {
                System.out.println("Empty");
                break;
            }
        }

        /*                   QUEUE                */
        Queue<Integer> myQ = new LinkedList<>();
        for (int i = 5; i > 0; i--) {
            myQ.add(i);
        }
        System.out.println(myQ);
//
//        while (!myQ.isEmpty()){
//           // myQ.poll();
//            System.out.println(myQ.poll());
//        }
//        System.out.println(myQ);
//
        PriorityQueue<Integer> myQPr = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1.equals(o2)) return 0;
                if (o1 < o2) return -1;
                return 1;
            }
        });

        for (int i = 5; i > 0; i--) {
            myQPr.add(i);
        }

        while (!myQPr.isEmpty()) {
            System.out.println(myQPr.poll());
        }

    }

    public static Integer getNextElement(Integer elem, Set<Integer> mySet) {
        for (int i = 0; i < mySet.size(); i++) {
            mySet.iterator();
        }
        return 1;
    }

    public static Set<Integer> getPrevElems(Integer elem) {
        Set<Integer> prevElSet = new TreeSet<Integer>();
        for (int i = 1; i < elem; i++) {
            prevElSet.add(i);
        }
        return prevElSet;
    }

}
