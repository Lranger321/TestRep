package main.service.credit;

import org.springframework.stereotype.Service;

@Service
public class ElderPercentCalculation implements PercentCalculation {
    @Override
    public double calculatePercent() {
        return 4;
    }

    @Override
    public CreditType creditType() {
        return CreditType.ELDER_GROUP;
    }
}
