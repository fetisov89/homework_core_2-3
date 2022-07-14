import java.util.Objects;

public class Slytherin extends  Hogwarts{

    private int theTrick;
    private int determination;
    private int ambition;
    private int resourcefulness ;
    private int lustForPower;

    public Slytherin(String name, String sureName, int witchcraft, int transgress,
                     int theTrick, int determination, int ambition, int resourcefulness,
                     int lustForPower) {
        super(name, sureName, witchcraft, transgress);
        this.theTrick = theTrick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getTheTrick() {
        return theTrick;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setTheTrick(int theTrick) {
        this.theTrick = theTrick;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public void print() {
        super.print();
        System.out.println("theTrick = " + theTrick);
        System.out.println("determination = " + determination);
        System.out.println("ambition = " + ambition);
        System.out.println("resourcefulness = " + resourcefulness);
        System.out.println("lustForPower = " + lustForPower);
    }

    public void comparisonFaculty(Slytherin object) {
        if (object.ambition + object.determination + object.lustForPower + object.resourcefulness + object.theTrick > this.ambition + this.determination + this.lustForPower + this.resourcefulness + this.theTrick) {
            System.out.println(getName() + " лучший слизеринец, чем " + object.getName());
        } else if (object.ambition + object.determination + object.lustForPower + object.resourcefulness + object.theTrick < this.ambition + this.determination + this.lustForPower + this.resourcefulness + this.theTrick) {
            System.out.println(object.getName() + " лучший слизеринец, чем " + getName());
        } else {
            System.out.println("Ученики равны");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Slytherin slytherin = (Slytherin) o;
        return theTrick == slytherin.theTrick && determination == slytherin.determination && ambition == slytherin.ambition && resourcefulness == slytherin.resourcefulness && lustForPower == slytherin.lustForPower;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), theTrick, determination, ambition, resourcefulness, lustForPower);
    }
}
