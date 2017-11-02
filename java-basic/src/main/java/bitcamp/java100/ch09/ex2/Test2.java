package bitcamp.java100.ch09.ex2;

/* 컬렉션 - 2. LinkedList */

public class Test2 {

    public static void printList(LinkedList list) {
        System.out.println("\n======================");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + " - " + list.get(i));
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("홍길동");
        list.add("임꺽정");
        list.add("유관순");
        list.add("안중근");
        list.add("윤봉길");
        printList(list);
        System.out.println();
        System.out.println("Removed: " + list.remove(4));
        printList(list);

        System.out.println();
        System.out.println("Removed: " + list.remove(2));
        printList(list);

        System.out.println();
        System.out.println("Removed: " + list.remove(0));
        printList(list);
    }
}