package vn.fis.spro.customer.domains.systemconfig.model.request;

import lombok.Data;

import java.util.List;

@Data
public class SystemConfigRequest {
    private Integer id;
    private Long chartId;
    private String configInformation;
    private String serverType;
    private String configCode;
    private String configName;
    private String configValue;
    private String description;
    private List<String> applyFor;
    private List<String> shareWith;
    private String note;
}
