public class Cat extends Animal{
    private int stay;
    private int tail;

    public Cat(String name, int leg, int size, int eyes, int stay, int tail) {
        super(name, leg, size, eyes);
        this.stay = stay;
        this.tail = tail;
    }

    private void shaeWar(int runn){
        System.out.println("This is Shwe War." + runn);
    }


    public void move(int time) {
        System.out.println("This is additional.");
        shaeWar(4);
        super.move(5);
    }
}
