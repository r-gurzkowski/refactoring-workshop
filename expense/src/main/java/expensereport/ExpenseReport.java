package expensereport;

import java.util.ArrayList;
import java.util.List;

public class ExpenseReport {

    private List<Expense> expenses = new ArrayList<Expense>();
    private int total;
    private int mealExpenses;

    public ExpenseReport() {
        total = 0;
        mealExpenses = 0;
    }

    public List<Expense> getExpenses() {
        return expenses;
    }

    public int getTotal() {
        return total;
    }

    public int getMealExpenses() {
        return mealExpenses;
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);

        if (expense.isMeal()) {
            mealExpenses += expense.getAmount();
        }

        total += expense.getAmount();
    }

}