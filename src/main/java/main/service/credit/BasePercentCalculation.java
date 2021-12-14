package main.service.credit;

import org.springframework.stereotype.Service;

@Service
public class BasePercentCalculation implements PercentCalculation {

    @Override
    public double calculatePercent() {
        return 3;
    }

    @Override
    public CreditType creditType() {
        return CreditType.BASE_GROUP;
    }
}
