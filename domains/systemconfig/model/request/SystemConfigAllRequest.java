package vn.fis.spro.customer.domains.systemconfig.model.request;

import lombok.Data;

import java.util.List;

@Data
public class SystemConfigAllRequest {
    List<SystemConfigRequest> systemConfigRequests;
}
