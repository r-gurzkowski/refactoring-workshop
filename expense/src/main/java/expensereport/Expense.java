package expensereport;

public abstract class Expense {

    private int amount;

    public Expense(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public abstract boolean isMeal();

    public abstract String getExpenseName();

    public abstract boolean isOverage();
}
