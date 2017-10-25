package bitcamp.java100.ch06.ex6;

public class Car2 {
    long no;
    String model;
    int cc;
    int type;
    int use;

    Car2(String model, int cc, int type, int use) {
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
