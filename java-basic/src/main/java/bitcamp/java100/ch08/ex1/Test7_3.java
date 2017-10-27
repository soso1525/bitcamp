package bitcamp.java100.ch08.ex1;

class Member3 {
    private String name;
    private int age;
    private float weight;
    private float height;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setHeight(float height) {
        this.height = height;

    }

    public float getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getHeight() {
        return height;
    }

}

public class Test7_3 {
    public static void main(String[] args) {
        Member3 m = new Member3();
        m.setName("홍길동");
        m.setAge(300);
        m.setWeight(500);
        m.setHeight(-200);

        System.out.printf("%s, %d, %f, %f\n", m.getName(), m.getAge(), m.getWeight(), m.getHeight());
    }
}
