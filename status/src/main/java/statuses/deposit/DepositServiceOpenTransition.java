package statuses.deposit;

import statuses.parent.Transition;
import statuses.productservice.ProductServiceStatus;

import java.util.Collection;
import java.util.HashSet;

public class DepositServiceOpenTransition implements Transition {

    public final DepositServiceStatus<DepositServiceOpenTransition> PROLONGATION = DepositServiceStatus.PROLONGATION;

    @Override
    public Collection<DepositServiceStatus> nextStatusesAsCollection() {
        return new HashSet<DepositServiceStatus>() {{
            this.add(DepositServiceStatus.CLOSE);
            this.add(DepositServiceStatus.CANCEL);
        }};
    }
}
