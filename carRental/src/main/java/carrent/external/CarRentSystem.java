package carrent.external;

import java.util.Date;
import lombok.Data;

@Data
public class CarRentSystem {

    private Long rentId;
    private String carId;
    private String userId;
    private Date rentStartDate;
    private Date rentEndDate;
    private Date regDate;
    private String rentStatus;
    private String approverId;
    private Double rentCost;
    // keep

}
