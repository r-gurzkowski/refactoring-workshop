package expensereport;


public class ExpenseReporter {

    private final ExpenseReport expenseReport = new ExpenseReport();

    public void printReport(ReportPrinter printer) {
        printHeader(printer);
        printExpenses(printer);
        printMealExpenses(printer);
        printTotal(printer);
    }

    private void printExpenses(ReportPrinter printer) {
        for (Expense expense : expenseReport.getExpenses()) {
            printExpense(printer, expense);
        }
    }

    private void printExpense(ReportPrinter printer, Expense expense) {
        String name = expense.getExpenseName();
        printer.print(String.format("%s\t%s\t$%.02f\n",
                expense.isOverage() ? "X" : " ",
                name, penniesToDollars(expense.getAmount())));
    }

    private void printTotal(ReportPrinter printer) {
        printer.print(String.format("\nTotal $%.02f", penniesToDollars(expenseReport.getTotal())));
    }

    private double penniesToDollars(int pennies) {
        return pennies / 100.0;
    }

    private void printMealExpenses(ReportPrinter printer) {
        printer.print(String.format("\nMeal expenses $%.02f", penniesToDollars(expenseReport.getMealExpenses())));
    }

    private void printHeader(ReportPrinter printer) {
        printer.print("Expenses " + getDate() + "\n");
    }

    public void addExpense(Expense expense) {
        expenseReport.addExpense(expense);
    }

    private String getDate() {
        return "9/12/2002";
    }
}
