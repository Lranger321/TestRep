package main.service.credit;

import org.springframework.stereotype.Service;

@Service
public class NewHousePercentCalculation implements PercentCalculation {
    @Override
    public double calculatePercent() {
        return 8;
    }

    @Override
    public CreditType creditType() {
        return CreditType.NEW_HOUSE;
    }
}
