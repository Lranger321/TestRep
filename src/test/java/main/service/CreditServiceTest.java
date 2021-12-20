package main.service;

import main.dto.CreditDTO;
import main.service.credit.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("UnitTest")
class CreditServiceTest {

    private CreditService service;

    @BeforeEach
    void setUp() {
        Map<CreditType, PercentCalculation> calculationMap = Map.of(
                CreditType.BANK_GROUP, new BankPercentCalculation(),
                CreditType.NEW_HOUSE, new NewHousePercentCalculation(),
                CreditType.ELDER_GROUP, new ElderPercentCalculation(),
                CreditType.RISK_HOUSE, new RiskHousePercentCalculation()
        );
        service = new CreditService(calculationMap);
    }

    @ParameterizedTest
    @MethodSource("getBranches")
    void calculate(CreditDTO dto, Double expectedResult) {
        assertEquals(expectedResult, service.calculateCredit(dto));
    }

    private static Stream<Arguments> getBranches() {
        return Stream.of(
                Arguments.of(new CreditDTO("Дом с рисками", "Старше 35"), 16d),
                Arguments.of(new CreditDTO("Новый дом", "Работник банка"), 9d),
                Arguments.of(new CreditDTO("Дом с рисками", "Работник банка"), 13d)
        );
    }
}