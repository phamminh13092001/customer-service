package vn.fis.spro.customer.domains.chart.model.request;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
public class ChartRequest {
    private Long chartId;
    private String companyCode;
    private String name;
    private String description;
    private String user;
    private String status;
    private List<String> username;
    private List<String> sharedUsers;
    private String shortName;
    private List<String> applyFor;
    private List<String> userEmail;
    private String type;
}

