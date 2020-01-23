public class Animal {
    private String name;
    private int leg;
    private int size;
    private int eyes;

    public Animal(String name, int leg, int size, int eyes) {
        this.name = name;
        this.leg = leg;
        this.size = size;
        this.eyes = eyes;
    }

    public void eat(){
        System.out.println("All animals are eat");
    }

    public void move(int time){
        System.out.println("Animals move  "  + time + " time in a day.");
    }

    public String getName() {
        return name;
    }

    public int getLeg() {
        return leg;
    }

    public int getSize() {
        return size;
    }

    public int getEyes() {
        return eyes;
    }
}
