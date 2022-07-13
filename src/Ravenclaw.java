import java.util.Objects;

public class Ravenclaw extends Hogwarts {

    private int mind;
    private int wit;
    private int wisdom;
    private int creativity;

    public Ravenclaw(String name, String sureName, int witchcraft, int transgress,
                     int mind, int wit, int wisdom, int creativity) {
        super(name, sureName, witchcraft, transgress);
        this.mind = mind;
        this.wit = wit;
        this.wisdom = wisdom;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public int getWit() {
        return wit;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public void print() {
        super.print();
        System.out.println("mind = " + mind);
        System.out.println("wit = " + wit);
        System.out.println("wisdom = " + wisdom);
        System.out.println("creativity = " + creativity);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ravenclaw ravenclaw = (Ravenclaw) o;
        return mind == ravenclaw.mind && wit == ravenclaw.wit && wisdom == ravenclaw.wisdom && creativity == ravenclaw.creativity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mind, wit, wisdom, creativity);
    }
}
