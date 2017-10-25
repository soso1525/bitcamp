package bitcamp.java100.ch06.ex6;

public class Car3 {
    static int count;

    public final static int TYPE_TRUCK = 1;
    public final static int TYPE_SEDAN = 2;
    public final static int TYPE_BUS = 3;

    public final static int USE_PRIVATE = 1;
    public final static int USE_COMPANY = 2;
    public final static int USE_COMMERCIAL = 3;

    long no;
    String model;
    int cc;
    int type; // 트럭:1, 승용:2, 승합:3
    int use; // 개인:1, 법인:2, 영업:3

    Car3(String model, int cc, int type, int use) {
        count++;

        this.model = model;
        this.cc = cc;
        this.no = System.currentTimeMillis();
        this.type = type;
        this.use = use;

        try {
            Thread.currentThread().sleep(50);
        } catch (Exception e) {

        }
    }
}
