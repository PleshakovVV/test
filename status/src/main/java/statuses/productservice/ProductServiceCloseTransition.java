package statuses.productservice;

import statuses.parent.Transition;

import java.util.Collection;
import java.util.Collections;

public class ProductServiceCloseTransition implements Transition {

    @Override
    public Collection<ProductServiceStatus> nextStatusesAsCollection() {
        return Collections.emptySet();
    }
}
