package vn.fis.spro.customer.domains.usertitle.model.request;

import lombok.Data;

import java.util.List;

@Data
public class UserTitleSyncRequest {
    private List<UserTitleSynDataRequest> data;
    private String uuid;
}
