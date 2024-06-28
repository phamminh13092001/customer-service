package vn.fis.spro.customer.domains.systemconfig.model.response;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class SystemConfigResponse {

    private Integer id;
    private Long chartId;
    private String configInformation;
    private String serverType;
    private String configCode;
    private String configName;
    private String configValue;
    private String description;
    private List<String> applyFor;
    private LocalDateTime createdDate;
    private String createdUser;
    private LocalDateTime modifiedDate;
    private String modifiedUser;
    private String status;
    private List<String> shareWith;
    private String note;
    private String companyName;
    private String companyCode;
}
