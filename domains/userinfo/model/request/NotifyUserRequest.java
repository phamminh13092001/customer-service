package vn.fis.spro.customer.domains.userinfo.model.request;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
public class NotifyUserRequest {
    private List<String> userEmails;
    private List<String> userNames;
}
