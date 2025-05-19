public class ReportGenerator {
    public void generateReport() {
        printHeader();
        printData();
        printFooter();
    }

    private void printHeader() {
        System.out.println("===== Monthly Report =====");
        System.out.println("Generated on: " + java.time.LocalDate.now());
    }

    private void printData() {
        int totalSales = 5000;
        int totalCustomers = 123;
        double avgSale = totalSales / (double) totalCustomers;

        System.out.println("Total Sales: $" + totalSales);
        System.out.println("Total Customers: " + totalCustomers);
        System.out.println("Average Sale per Customer: $" + avgSale);
    }

    private void printFooter() {
        System.out.println("==========================");
    }
}

