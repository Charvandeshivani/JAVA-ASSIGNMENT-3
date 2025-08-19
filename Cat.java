class Animal {
    String color;

    void voice() {
        System.out.println("IN VOICE OF ANIMAL");
    }
}

public class Cat extends Animal {
    void work() {
        System.out.println("IN WORK OF CAT");
    }

    public static void main(String args[]) {
        Cat c = new Cat();
        c.work();            
        c.voice();           
        c.color = "BLACK";   
        System.out.println("The color of Cat is " + c.color);
    }
}
