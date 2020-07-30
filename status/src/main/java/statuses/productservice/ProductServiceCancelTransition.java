package statuses.productservice;

import statuses.parent.Transition;

import java.util.Collection;
import java.util.Collections;

public class ProductServiceCancelTransition implements Transition {

    public final ProductServiceStatus<ProductServiceCloseTransition> CLOSE = ProductServiceStatus.CLOSE;

    @Override
    public Collection<ProductServiceStatus> nextStatusesAsCollection() {
        return Collections.emptySet();
    }
}
