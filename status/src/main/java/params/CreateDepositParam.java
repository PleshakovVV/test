package params;

import statuses.deposit.DepositServiceStatus;

public class CreateDepositParam {

    private DepositServiceStatus<?> status;

    public DepositServiceStatus<?> getStatus() {
        return status;
    }

    public void setStatus(DepositServiceStatus<?> status) {
        this.status = status;
    }
}
