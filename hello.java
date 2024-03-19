public class hello {
    private String name;
    private int age;

    public hello(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void set(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public void get() {
        System.out.println("My name is: " + name + " and age is " + age);
    }
    
    public static void main(String[] args) {
        hello hi = new hello("Astha", 10);
        hi.get();
        hi.set("Qwerty", 20);
        hi.get();
    }
}