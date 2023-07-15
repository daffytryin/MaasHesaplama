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

    private double tax() {
        if (salary <= 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    private double bonus() {
        int extraHours = workHours - 40;
        if (extraHours > 0) {
            return extraHours * 30;
        } else {
            return 0;
        }
    }

    private double raiseSalary() {
        int yearsWorked = 2021 - hireYear;
        double raisePercentage = 0;

        if (yearsWorked < 10) {
            raisePercentage = 0.05;
        } else if (yearsWorked >= 10 && yearsWorked < 20) {
            raisePercentage = 0.1;
        } else {
            raisePercentage = 0.15;
        }

        return salary * raisePercentage;
    }

    public void calculateTotalSalary() {
        double tax = tax();
        double bonus = bonus();
        double raise = raiseSalary();

        double totalSalary = salary - tax + bonus + raise;

        System.out.println("Adı: " + name);
        System.out.println("Maaşı: " + salary);
        System.out.println("Çalışma Saati: " + workHours);
        System.out.println("Başlangıç Yılı: " + hireYear);
        System.out.println("Vergi: " + tax);
        System.out.println("Bonus: " + bonus);
        System.out.println("Maaş Artışı: " + raise);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + totalSalary);
        System.out.println("Toplam Maaş: " + (salary + bonus));
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                '}';
    }
}
