package main.service;

import lombok.RequiredArgsConstructor;
import main.dto.CreditDTO;
import main.service.credit.CreditType;
import main.service.credit.PercentCalculation;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class CreditService {

    private final Map<CreditType, PercentCalculation> percentCalculationMap;

    public Double calculateCredit(CreditDTO creditDTO) {
        return percentCalculationMap.get(CreditType.getCreditTypeByValue(creditDTO.getHouseType())).calculatePercent() +
                percentCalculationMap.get(CreditType.getCreditTypeByValue(creditDTO.getGroup())).calculatePercent();
    }
}
