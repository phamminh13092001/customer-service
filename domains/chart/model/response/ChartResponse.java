package vn.fis.spro.customer.domains.chart.model.response;

import lombok.Data;

import java.time.Instant;
import java.util.Date;
@Data
public class ChartResponse {
    private Long id;
    private String code;
    private String companyCode;
    private String name;
    private String shortName;
    private String type;
    private String description;
    private String status;
    private Integer userTotal;
    private Integer linkTotal;
    private String version;
    private String errorMessage;
    private Instant createdDate;
    private String createdUser;
    private Instant modifiedDate;
    private String modifiedUser;
    private String parentCompanyCode;

}
