package statuses.deposit;

import statuses.parent.StatusParent;

public class DepositServiceStatus<T> extends StatusParent<T> {

    public static DepositServiceStatus<DepositServiceOpenTransition> OPEN
            = new DepositServiceStatus<>("open", new DepositServiceOpenTransition());

    public static DepositServiceStatus<DepositServiceCancelTransition> CANCEL
            = new DepositServiceStatus<>("cancel", new DepositServiceCancelTransition());

    public static DepositServiceStatus<DepositServiceCloseTransition> CLOSE
            = new DepositServiceStatus<>("close", new DepositServiceCloseTransition());

    public static DepositServiceStatus<DepositServiceOpenTransition> PROLONGATION
        = new DepositServiceStatus<>("prolongation", new DepositServiceOpenTransition());


    public DepositServiceStatus(String value, T to) {
        super(value, to);
    }

}
