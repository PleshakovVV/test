package statuses.deposit;

import statuses.parent.Transition;

import java.util.Collection;
import java.util.Collections;

public class DepositServiceCancelTransition implements Transition {

    public Collection<DepositServiceStatus> nextStatusesAsCollection() {
        return Collections.emptySet();
    }

}
