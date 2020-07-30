package statuses.productservice;

import statuses.parent.Transition;

import java.util.Collection;
import java.util.HashSet;

public class ProductServiceOpenTransition implements Transition {

    public final ProductServiceStatus<ProductServiceCloseTransition> CLOSE = ProductServiceStatus.CLOSE;
    public final ProductServiceStatus<ProductServiceCancelTransition> CANCEL = ProductServiceStatus.CANCEL;

    @Override
    public Collection<ProductServiceStatus> nextStatusesAsCollection() {
        return new HashSet<ProductServiceStatus>() {{
            this.add(ProductServiceStatus.CLOSE);
            this.add(ProductServiceStatus.CANCEL);
        }};
    }
}
