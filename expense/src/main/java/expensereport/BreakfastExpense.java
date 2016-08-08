package expensereport;

public class BreakfastExpense extends Expense {

    public BreakfastExpense(int amount) {
        super(amount);
    }

    @Override
    public boolean isMeal() {
        return true;
    }

    @Override
    public String getExpenseName() {
        return "Breakfast";
    }

    @Override
    public boolean isOverage() {
        return getAmount() > 1000;
    }
}
