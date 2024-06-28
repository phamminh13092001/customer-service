package vn.fis.spro.customer.domains.chart.model.response;

import lombok.Data;

import java.util.Date;
@Data
public class ChartResponse {
    private Long chartId;
    private String name;
    private String description;
    private String status;
    private Date createdDate;
    private String createdUser;
    private Date modifiedDate;
    private String modifiedUser;
    private Integer maxSize;
    private Integer currSize;
}
