package main.service.credit;

import org.springframework.stereotype.Service;

@Service
public class BankPercentCalculation implements PercentCalculation {
    @Override
    public double calculatePercent() {
        return 1;
    }

    @Override
    public CreditType creditType() {
        return CreditType.BANK_GROUP;
    }
}
