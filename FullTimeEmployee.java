public class FullTimeEmployee extends Employee{
    private int weeklySalary;
    public FullTimeEmployee (int weeklySalary, String name, int id){
        super(name,id);
        this.weeklySalary=weeklySalary;
    }

    @Override
    public double computeAmount() {
        return 4*weeklySalary;
    }
}
