package java100.app;

public class Test {
    public static void main(String[] args) {

        String[] path = "/score/add?name=aaa&kor=100&eng=100".split("\\?");
        String[] path2 = path[1].split("&");
        for (String s : path)
            System.out.println(s);

        for (String s : path2) {
            String[] tmp = s.split("=");
            for (String n : tmp)
                System.out.println(n);
        }
    }
}
