package statuses.productservice;

import statuses.parent.StatusParent;

public class ProductServiceStatus<T> extends StatusParent<T> {

    public static ProductServiceStatus<ProductServiceOpenTransition> OPEN
        = new ProductServiceStatus<>("open", new ProductServiceOpenTransition());

    public static ProductServiceStatus<ProductServiceCancelTransition> CANCEL
        = new ProductServiceStatus<>("cancel", new ProductServiceCancelTransition());

    public static ProductServiceStatus<ProductServiceCloseTransition> CLOSE
        = new ProductServiceStatus<>("close", new ProductServiceCloseTransition());


    public ProductServiceStatus(String value, T to) {
        super(value, to);
    }
}
