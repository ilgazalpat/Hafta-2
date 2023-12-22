public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Deniz", 3000, 45, 2010);

        System.out.println("Çalışan Bilgileri : ");
        employee.printInfo();

        System.out.println("\nMaaş Detayları : ");
        employee.calculateTaxAndBonus();
    }
}