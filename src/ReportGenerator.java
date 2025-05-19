public class ReportGenerator {
    public void generateReport() {
        // Header
        System.out.println("===== Monthly Report =====");
        System.out.println("Generated on: " + java.time.LocalDate.now());

        // Data section
        int totalSales = 5000;
        int totalCustomers = 123;
        double avgSale = totalSales / (double) totalCustomers;

        System.out.println("Total Sales: $" + totalSales);
        System.out.println("Total Customers: " + totalCustomers);
        System.out.println("Average Sale per Customer: $" + avgSale);

        // Footer
        System.out.println("==========================");
    }
}
