import java.text.DecimalFormat;

public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    public void tax() {
        if (salary > 1000) {
            salary -= salary * 0.03;
        }
    }

    public void bonus() {
        if (workHours > 40) {
            int time = workHours - 40;
            salary += time * 30.0;
        }
    }

    public void raiseSalary() {
        int workYear = 2021 - hireYear;
        if (workYear < 10) {
            salary += salary * 0.05;
        } else if (workYear < 20) {
            salary += salary * 0.10;
        } else {
            salary += salary * 0.15;
        }
        bonus();
        tax();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" +  new DecimalFormat("##.##").format(salary) +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                '}';
    }
}
