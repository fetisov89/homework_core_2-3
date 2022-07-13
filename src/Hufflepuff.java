import java.util.Objects;

public class Hufflepuff extends  Hogwarts{

    private int hardworking;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, String sureName, int witchcraft, int transgress,
                      int hardworking, int loyalty, int honesty) {
        super(name, sureName, witchcraft, transgress);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public void print() {
        super.print();
        System.out.println("hardworking = " + hardworking);
        System.out.println("loyalty = " + loyalty);
        System.out.println("honesty = " + honesty);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hufflepuff that = (Hufflepuff) o;
        return hardworking == that.hardworking && loyalty == that.loyalty && honesty == that.honesty;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hardworking, loyalty, honesty);
    }
}
