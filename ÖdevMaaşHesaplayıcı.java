public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Kemal",2000.0,45,1985);
        System.out.println(employee.toString());




    }

}
class Employee {
    String name ;
    double salary ;
    int workHours ;
    int hireYear ;

    public Employee(String name,double salary,int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;


    }
    public double tax(double salary){
        double tax=0;
        if(salary>=1000){
            tax = salary*0.03;
        }
        return tax;
    }

    public double bonus(){
        double bonus  =0;
        if(this.workHours>40){
            bonus = (this.workHours-40)*30;
        }
        return bonus;
    }

    public double raiseSalary(){
        int year = 2021;
        double raiseSalary = 0;
        if(year-this.hireYear<10){
            raiseSalary = this.salary*0.05;
        }
        else if(year-this.hireYear>=9 && year-this.hireYear<=19){
            raiseSalary = this.salary*0.10;
        }
        else if(year-this.hireYear>=19){
            raiseSalary = this.salary*0.15;
        }
        return raiseSalary;


    }

    @Override
    public String toString() {


        return "Employee{" +
                "Adı : '" + this.name + '\'' +"\n"+
                ", Maaş : " + this.salary +"\n"+
                ", Çalışma Saati : " + this.workHours +"\n"+
                ", Başlangıç Yılı : " + this.hireYear +"\n"+
                ", Vergi : " + tax(this.salary) +"\n"+
                ", Bonus : " + bonus()+"\n"+
                ", Maaş Artışı : " + raiseSalary()+"\n"+
                ", Vergi ve Bonuslar ile birlikte maaş : "+ (this.salary+bonus()-tax(this.salary))+"\n"+
                ", Toplam Maaş : "+(this.salary+raiseSalary())+
                '}';
    }
}

