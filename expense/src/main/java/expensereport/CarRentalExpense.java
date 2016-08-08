package expensereport;

public class CarRentalExpense extends Expense {

    public CarRentalExpense(int amount) {
        super(amount);
    }

    @Override
    public boolean isMeal() {
        return false;
    }

    @Override
    public String getExpenseName() {
        return "Car Rental";
    }

    @Override
    public boolean isOverage() {
        return false;
    }
}
