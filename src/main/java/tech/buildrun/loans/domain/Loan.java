package tech.buildrun.loans.domain;

public class Loan {

    private Customer customer;

    public Loan(Customer customer) {
        this.customer = customer;
    }

    public boolean isPersonalLoanAvailabe() {
        if (customer.isIncomeEqualOrLowerThan(3000.0)) {
            return true;
        }

        // minuto 12.04
    }

}
