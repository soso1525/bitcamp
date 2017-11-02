package bitcamp.java100.ch09.ex6;

/* Generic */

public class Test1 {
    public static void main(String[] args) {
        Stack contacts = new Stack();
        contacts.push(new Contact("홍길동", "hong@test.com", "1111-1111"));
        contacts.push(new Contact("임꺽정", "lim@test.com", "1111-1112"));
        contacts.push(new Contact("유관순", "yoo@test.com", "1111-1113"));

        // push method의 parameter가 object이므로 밑에서처럼 string이나 boolean 객체를 넣어도 문법적으로는 문제가
        // 없다
        contacts.push("안중근");
        contacts.push(true);

        Contact c = (Contact) (contacts.pop());

        BookStack bookStack = new BookStack();
        bookStack.push(new Book());
        bookStack.push(new Book());
        Book b1 = bookStack.pop();
        Book b2 = bookStack.pop();

        ContactStack contactStack = new ContactStack();
        contactStack.push(new Contact());
        contactStack.push(new Contact());
        Contact c1 = contactStack.pop();
        Contact c2 = contactStack.pop();

        ScoreStack scoreStack = new ScoreStack();
        scoreStack.push(new Score());
        scoreStack.push(new Score());
        Score s1 = scoreStack.pop();
        Score s2 = scoreStack.pop();
    }
}
