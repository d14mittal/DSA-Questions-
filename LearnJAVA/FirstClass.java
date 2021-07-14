public class FirstClass {
    public static void main(String[] args) {
        System.out.println("hello world");
        Person p1 = new Person();
        p1.age = 21;
        p1.name = "dhruv";
        p1.walk("anya");
        p1.walk(10);
        Person p2 = new Person(21,"dhruv mittal");

        
        System.out.println(Person.count);
    }
}

class Person {
    int age;
    String name;
    Person(int age, String name){
        this.age=age;
        this.name=name;
    }

    static int count=0;
    public Person(){ //default constructor
        System.out.println("creating object");
        count++;
    }
    void walk(String name) {
        System.out.println("Dhruv Walks with "+name);
    }

    void walk(int k) {
        System.out.println("Dhruv Walks "+k+" mins");
    }
}
