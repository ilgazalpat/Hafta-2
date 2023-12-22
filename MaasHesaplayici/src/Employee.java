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

    public void calculateTaxAndBonus() {
        double totalSalary = salary;

        double tax = calculateTax();
        totalSalary -= tax;

        double bonus = calculateBonus();
        totalSalary += bonus;

        raiseSalary();

        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + totalSalary + " TL");

        System.out.println("Toplam Maaş: " + salary + " TL");
    }

    private double calculateTax() {
        double taxRate = 0.03;
        if (salary > 1000) {
            double tax = salary * taxRate;
            System.out.println("Vergi Kesintisi: " + tax + " TL");
            salary -= tax;
            return tax;
        }
        return 0;
    }

    private double calculateBonus() {
        int standardWorkHours = 40;
        int hourlyBonus = 30;

        if (workHours > standardWorkHours) {
            int extraHours = workHours - standardWorkHours;
            double bonusAmount = extraHours * hourlyBonus;
            System.out.println("Bonus: " + bonusAmount + " TL");
            salary += bonusAmount;
            return bonusAmount;
        }
        return 0;
    }

    private void raiseSalary() {
        int currentYear = getCurrentYear();
        int yearsWorked = currentYear - hireYear;

        if (yearsWorked < 10) {
            salary *= 1.05; // %5 zam
        } else if (yearsWorked >= 10 && yearsWorked < 20) {
            salary *= 1.10;
        } else {
            salary *= 1.15;
        }
    }

    private int getCurrentYear() {
        long currentTimeMillis = System.currentTimeMillis();
        int currentYear = 1970 + (int) (currentTimeMillis / 1000 / 60 / 60 / 24 / 365);
        return currentYear;
    }

    public void printInfo() {
        System.out.println("Adı: " + name);
        System.out.println("Maaşı: " + salary + " TL");
        System.out.println("Çalışma Saati: " + workHours + " saat");
        System.out.println("İşe Başlangıç Yılı: " + hireYear);
    }
}