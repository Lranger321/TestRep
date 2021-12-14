package main.config;

import main.service.credit.CreditType;
import main.service.credit.PercentCalculation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Configuration
public class PercentCalculationConfig {

    @Bean
    public Map<CreditType, PercentCalculation> unitCalculationServiceMap(@Autowired List<PercentCalculation> services) {
        return services.stream().collect(Collectors.toMap(PercentCalculation::creditType,
                unitCalculationService -> unitCalculationService));
    }
}
