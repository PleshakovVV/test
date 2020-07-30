import params.CreateDepositParam;
import params.CreateProductParam;
import statuses.deposit.DepositServiceStatus;
import statuses.productservice.ProductServiceStatus;

import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        CreateProductParam productParam = new CreateProductParam();
        productParam.setServiceStatus(ProductServiceStatus.OPEN);
        productParam.setServiceStatus(ProductServiceStatus.OPEN.next().CLOSE);

        Collection<ProductServiceStatus> productServiceStatuses = ProductServiceStatus.OPEN.next().nextStatusesAsCollection();
        for (ProductServiceStatus status: productServiceStatuses) {
            System.out.println(status.getValue());
        }

        CreateDepositParam depositParam = new CreateDepositParam();
        depositParam.setStatus(DepositServiceStatus.OPEN.next().PROLONGATION);
    }
}
