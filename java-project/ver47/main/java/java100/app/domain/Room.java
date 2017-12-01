package java100.app.domain;

public class Room {

    protected int no;
    protected String loc;
    protected String name;
    protected int capacity;

    public Room() {
    }

    public Room(int no, String loc, String name, int capacity) {
        this.no = no;
        this.loc = loc;
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return "Room [no=" + no + ", loc=" + loc + ", name=" + name
                + ", capacity=" + capacity + "]";
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getNo() {
        return this.no;
    }

    public String getloc() {
        return loc;
    }

    public void setloc(String loc) {
        this.loc = loc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}