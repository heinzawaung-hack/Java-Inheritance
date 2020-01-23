public class Dog extends Animal{
    private int brain;
    private int harm;
    private int tail;

    public Dog(String name,  int size , int brain , int harm , int tail) {
        super(name, 2, size, 2);
        this.brain = brain;
        this.harm = harm;
        this.tail = tail;
    }



    private void aungNet(){
        System.out.println("This is override method from animal class.");
    }

    @Override
    public void eat() {
        System.out.println("This is override.");
        aungNet();
        super.eat();
    }

    public void run(){
        System.out.println("This is run from dog Java");
        move(4);
    }

    public void walk(){
        System.out.println("This is walk from Dog Java");
        move(6);
    }

    private void fuckTime(int time){
        System.out.println("I Fuck with EiEiNyein " + time + " times.");
    }

    @Override
    public void move(int time) {
        super.move(time);
        System.out.println("This is override from dog with move");
        fuckTime(40);
    }
}