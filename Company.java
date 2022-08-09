import java.util.ArrayList;

public class Company {
    private String name;
    private ArrayList<PayAble> list;

    public Company(String name){
        this.name=name;
        this.list=new ArrayList<PayAble>();

    }

    public boolean add(PayAble P){

    }
    public double computeAmount(){



    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", list=" + list +
                '}';
    }
}
