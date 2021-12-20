package main.controller;

import lombok.AllArgsConstructor;
import main.dto.CreditDTO;
import main.service.CreditService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class CreditController {

    private final CreditService service;

    @PostMapping("/api/credit/percent")
    public Double getPercent(CreditDTO dto) {
        return service.calculateCredit(dto);
    }
}
