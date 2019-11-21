package jonst.Models;

public enum LegalTender {
    ONE(1),
    FIVE(5),
    TEN(10),
    TWENTY(20),
    FIFTY(50),
    HUNDRED(100),
    FIVEHUNDRED(500),
    THOUSAND(1000);


    private int value;

    LegalTender(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
