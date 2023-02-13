package mall.domain;

import mall.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String status;
    private String productName;
    private Integer qty;
    private Long productId;
    private Long customerId;
}
