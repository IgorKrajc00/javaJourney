package igor.javoviny;

public class Employer {

    private String name;
    private double salary;

    public Employer(String aName, double aSalary) {
        this.name = aName;
        this.salary = aSalary;
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    //
    public void adjustSalary(double prevYear, double thisYear) {
        double relativePerformance = prevYear / thisYear;
        this.salary = salary * relativePerformance;
    }
}