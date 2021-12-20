package main.service.credit;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CreditType {
    BASE_GROUP("Младше 35"),
    ELDER_GROUP("Старше 35"),
    BANK_GROUP("Работник банка"),
    NEW_HOUSE("Новый дом"),
    BASE_HOUSE("Обычный дом"),
    RISK_HOUSE("Дом с рисками");

    private String type;

    public static CreditType getCreditTypeByValue(String value) {
        for (CreditType creditType : CreditType.values()) {
            if (creditType.getType().equals(value)) {
                return creditType;
            }
        }
        return null;
    }
}
