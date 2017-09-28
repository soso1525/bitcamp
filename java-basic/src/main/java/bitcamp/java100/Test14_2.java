package bitcamp.java100;

/* 사용자 정의 데이터 타입 만들기 */

public class Test14_2 {
    public static void main(String[] args) {
        //도서명, 저자, 출판사, 페이지, 가격

        class Book {
            // new keyword로 만들어진 instance 아래 들어갈 변수들
            // 이 변수들을 field라고 부름
            String name, author, publisher;
            int page;
            float price;
        }
        
        // b는 주소 저장 변수 -> reference
        Book b = new Book(); //class에 따라 만든 memory -> instance, object
        b.name = "HeadFirst Java";
        b.author = "Kathy Sierra";
        b.publisher = "O'Reilly Media";
        b.page = 720;
        b.price = 28.13f;
        
        System.out.println("\n******* Book Info *******");
        // System.out.println("Name: " + b.name);
        System.out.printf("Name: %s\n", b.name);
        // System.out.println("Author: " + b.author);
        System.out.printf("Author: %s\n", b.author);
        // System.out.println("Publisher: " + b.publisher);
        System.out.printf("Publisher: %s\n", b.publisher);
        // System.out.println("Page: " + b.page + "p");
        System.out.printf("Page: %dp\n", b.page);
        System.out.printf("Price: %.2f$\n", b.price);
    }
}