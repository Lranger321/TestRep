package main.service.credit;

import org.springframework.stereotype.Service;

@Service
public class BaseHousePercentCalculation implements PercentCalculation {

    @Override
    public double calculatePercent() {
        return 10;
    }

    @Override
    public CreditType creditType() {
        return CreditType.BASE_HOUSE;
    }
}
