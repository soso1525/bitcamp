package bitcamp.java100.ch10.ex1;

/* nested class */

public class Test2 {
    // Top level nested class
    static class A {

    } // nested class

    class B { // inner class

    }
    
    Object obj = new Object() {
        String name;
        public void m() {
            
        }
    };
    

    public static void main(String[] args) {
        class C { // 메소드 안에 정의된 클래스 : Local Class
             
        }
        
//        class {
//            String name;
//        }
//        
//        class {
//            int a;
//        }
        
        
        // 클래스 이름이 없어서 부모 클래스로 객체를 만든다 
        Object obj = new Object() {
            String name;
            public void m1() {
                
            }
        }; //anonymous class
        
        Object obj2 = new Object() {
            String name; 
            public void m1() {
                
            }
        };
        
        
    }
}
