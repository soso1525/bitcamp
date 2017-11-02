package bitcamp.java100.ch08.ex7;

public class A2 extends A {
    // B클래스에 새로 추가된 메소드
    // m1이 A에 있긴 하지만 private으로 되어있으므로 각 클래스에 해당되는 메소드일 뿐 오버라이딩 되지 않는다
    // private void m1() {
    // System.out.println("B.m1()");
    // }

    public void test1() {
        m4(); // public (전체 공개)
        m3(); // protected (상속받은 클래스까지)
        m2(); // default (same package까지)
        // m1(); private이므로 class A에서만 사용가능
    }

    private void m1() {
        System.out.println("B.m1()");
    }

    void m2() {
        super.m2();
    }

    protected void m3() {
        super.m3();
    }

    public void m4() {
        super.m4();
    }
}
