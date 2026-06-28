 class Animal {
    public void eat(){
        System.out.println("eating...");
    }
    public void sleep(){
        System.out.println("sleeping...");
    }
    public void walk(){
        System.out.println("walking...");
    }
    public void run(){
        System.out.println("running...");
    }
    public void bark(){
        System.out.println("barking...");
    }
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        a.sleep();
        a.walk();
        a.run();
        a.bark();
    }
}
