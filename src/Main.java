
public class Main {
    public static void main(String[] args) {

        Gryffindor harry = new Gryffindor("Гарри", "Поттер", 55, 31, 48, 22, 91);
        Gryffindor ron = new Gryffindor("Рон", "Уизли", 71, 81, 22, 11, 50);
        Ravenclaw marcus = new Ravenclaw("Маркус", "Белби", 32, 1, 2, 88, 99, 1);
        harry.comparisonFaculty(ron);
        harry.comparisonSchool(marcus);
    }
}
