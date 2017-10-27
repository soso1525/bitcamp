package bitcamp.java100.ch08.ex1;

class Member2 {
    private String name;
    private int age;
    private float weight;
    private float height;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age <= 0 || age > 150)
            return;
        this.age = age;
    }

    public void setWeight(float weight) {
        if (weight <= 0 || weight > 200)
            return;
        this.weight = weight;
    }

    public void setHeight(float height) {
        if (height <= 0 || height > 250)
            return;
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

public class Test7_2 {
    public static void main(String[] args) {
        Member2 m = new Member2();
        m.setName("홍길동");
        m.setAge(300);
        m.setWeight(500);
        m.setHeight(-200);

        System.out.printf("%s, %d, %f, %f\n", m.getName(), m.getAge(), m.getWeight(), m.getHeight());
    }
}
