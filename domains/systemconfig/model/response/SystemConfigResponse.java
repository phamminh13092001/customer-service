package vn.fis.spro.customer.domains.systemconfig.model.response;

import lombok.Data;
import java.time.Instant;


@Data
public class SystemConfigResponse {
    private Long id;
    private Long chartId;
    private String configInformation;
    private String serverType;
    private String configCode;
    private String configName;
    private String configValue;
    private String description;
    private Instant createdDate;
    private String createdUser;
    private Instant modifiedDate;
    private String modifiedUser;
    private String status;
    private String note;
    private String companyCode;
    private String companyName;


}
