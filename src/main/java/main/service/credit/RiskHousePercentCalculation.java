package main.service.credit;

import org.springframework.stereotype.Service;

@Service
public class RiskHousePercentCalculation implements PercentCalculation{

    @Override
    public double calculatePercent() {
        return 12;
    }

    @Override
    public CreditType creditType() {
        return CreditType.RISK_HOUSE;
    }
}
