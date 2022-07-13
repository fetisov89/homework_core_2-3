import java.util.Objects;

public class Gryffindor extends Hogwarts{

    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, String sureName, int witchcraft, int transgress,
                      int nobility, int honor, int bravery) {
        super(name, sureName, witchcraft, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public void print() {
        super.print();
        System.out.println("nobility = " + nobility);
        System.out.println("honor = " + honor);
        System.out.println("bravery = " + bravery);
    }

    public void comparisonFaculty(Gryffindor object) {
        if (object.bravery + object.honor + object.nobility < this.bravery + this.honor + this.nobility) {
            System.out.println(getName() + " лучший гриффиндорец чем " + object.getName());
        } else {
            System.out.println(object.getName() + " лучший гриффиндорец чем " + getName());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Gryffindor that = (Gryffindor) o;
        return nobility == that.nobility && honor == that.honor && bravery == that.bravery;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nobility, honor, bravery);
    }
}
