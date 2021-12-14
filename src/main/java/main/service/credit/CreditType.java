package main.service.credit;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CreditType {
    BASE_GROUP("base"),
    ELDER_GROUP("elder"),
    BANK_GROUP("bank"),
    NEW_HOUSE("newHouse"),
    BASE_HOUSE("baseHouse"),
    RISK_HOUSE("riskHouse");

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
