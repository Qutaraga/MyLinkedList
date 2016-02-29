package com.qutar.first;



public class TestClass  {
    static MyLinkedList<Integer> list;

    public static void main(String args[]){

        list = new MyLinkedList<>();

        list.add(1);list.add(2);list.add(3);

        test(1);

        list.addFirst(4);

        test(2);

        try {
            list.addTo(7, 2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        test(3);

        list.reverse();

        test(4);

        list.remove(0);

        test(5);

        list.replase(10, 1);

        test(6);

        list.swap(1, 3);

        test(7);

        list.clear();

        test(8);
    }

    public static void test(int i){

        switch (i){
            case 1:
                System.out.println("Test add:");
                break;
            case 2:
                System.out.println("Test addFirst:");
                break;
            case 3:
                System.out.println("Test addTo:");
                break;
            case 4:
                System.out.println("Test Reverse:");
                break;
            case 5:
                System.out.println("Test Remove:");
                break;
            case 6:
                System.out.println("Test Replase:");
                break;
            case 7:
                System.out.println("Test Swap:");
                break;
            case 8:
                System.out.println("Test Clear:");
                break;

        }

        for (int z =0; z < list.listSize(); z++) {
                System.out.println(z+")"+list.get(z));
        }
    }

}
