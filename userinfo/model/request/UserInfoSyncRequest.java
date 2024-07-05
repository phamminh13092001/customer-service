package vn.fis.spro.customer.domains.userinfo.model.request;

import lombok.Data;

import java.util.List;

@Data
public class UserInfoSyncRequest {
    private List<UserInfoSyncDataRequest> data;
    private String username;
    private String uuid;
}
