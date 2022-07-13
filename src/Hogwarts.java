import java.util.Objects;

public class Hogwarts {
    private String name;
    private String sureName;
    private int witchcraft;
    private int transgress;

    public Hogwarts(String name, String sureName, int witchcraft, int transgress) {
        this.name = name;
        this.sureName = sureName;
        this.witchcraft = witchcraft;
        this.transgress = transgress;
    }

    public String getName() {
        return name;
    }

    public String getSureName() {
        return sureName;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public void setWitchcraft(int witchcraft) {
        this.witchcraft = witchcraft;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }

    public void comparisonSchool(Hogwarts object) {
        if (object.witchcraft + object.transgress < this.witchcraft + this.transgress) {
            System.out.println(getName() + " обладает бoльшей мощностью магии " + object.getName());
        } else {
            System.out.println(object.getName() + " обладает бoльшей мощностью магии " + getName());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hogwarts hogwarts = (Hogwarts) o;
        return witchcraft == hogwarts.witchcraft && transgress == hogwarts.transgress && name.equals(hogwarts.name) && sureName.equals(hogwarts.sureName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sureName, witchcraft, transgress);
    }

    public void print() {
        System.out.println("name = " + name);
        System.out.println("sureName = " + sureName);
        System.out.println("witchcraft = " + witchcraft);
        System.out.println("transgress = " + transgress);
    }
}
