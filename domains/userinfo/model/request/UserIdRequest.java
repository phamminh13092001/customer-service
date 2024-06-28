package vn.fis.spro.customer.domains.userinfo.model.request;

import lombok.Data;

import java.util.List;

@Data
public class UserIdRequest {
    private List<Long> listUserId;
}
