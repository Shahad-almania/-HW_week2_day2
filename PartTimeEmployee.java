
public class PartTimeEmployee extends Employee {
    private int workHours;
    private int wage;

    public PartTimeEmployee (int workHours, String name, int wage,  int id){
        super(name,id);
        this.workHours=workHours;
        this.wage=wage;
    }
    @Override
    public double computeAmount() {
        return workHours*wage;
    }
}
