package expensereport;

public class DinnerExpense extends Expense {
    public DinnerExpense(int amount) {
        super(amount);
    }

    @Override
    public boolean isMeal() {
        return true;
    }

    @Override
    public String getExpenseName() {
        return "Dinner";
    }

    @Override
    public boolean isOverage() {
        return getAmount() > 5000;
    }
}
