package params;

import statuses.productservice.ProductServiceStatus;

public class CreateProductParam {

    private ProductServiceStatus<?> serviceStatus;

    public ProductServiceStatus<?> getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(ProductServiceStatus<?> serviceStatus) {
        this.serviceStatus = serviceStatus;
    }
}
