public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ahmet",300000.18,45,1997);
        System.out.println( e1.toString());
        e1.raiseSalary();
        System.out.println(e1.toString());
    }
}