package vn.fis.spro.customer.domains.userinfo.model.request;

import lombok.Data;

import java.util.Date;

@Data
public class UserInfoSyncDataRequest {
    private String code;
    private String firstname;
    private String lastname;
    private String phone;
    private String email;
    private String orgCode;
    private String jobTitleCode;
    private Integer status;
    private String idCardNo;
    private String idCardIssuer;
    private Date idCardIssuedDate;
    private String directManagerCode;
}
