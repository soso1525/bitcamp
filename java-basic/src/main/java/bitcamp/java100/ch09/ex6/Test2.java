package bitcamp.java100.ch09.ex6;

/* Generic 적용 후 */

public class Test2 {
    public static void main(String[] args) {
        // Stack2<Contact> contacts = new Stack2<>(); 이렇게 적어도 가능
        Stack2<Contact> contacts = new Stack2<Contact>();
        contacts.push(new Contact("홍길동", "hong@test.com", "1111-1111"));
        contacts.push(new Contact("임꺽정", "lim@test.com", "1111-1112"));
        contacts.push(new Contact("유관순", "yoo@test.com", "1111-1113"));
        Contact c = (Contact) (contacts.pop());

        // contacts.push("안중근"); >> T에 Contact 타입으로 한정지었기 때문에 컴파일 에러남
        // contacts.push(true);


        //제네릭을 사용하면 타입별로 여러개의 클래스를 만들 필요가 없어짐 (특히 자료구조에서)

        Stack2<Book> books = new Stack2<>();
        books.push(new Book());
        books.push(new Book());
        Book b1 = books.pop();
        Book b2 = books.pop();

        Stack2<Score> scores = new Stack2<>();
        scores.push(new Score());
        scores.push(new Score());
        Score s1 = scores.pop();
        Score s2 = scores.pop();
    }
}

//HashTable 이 느려서 HashMap 사용
            