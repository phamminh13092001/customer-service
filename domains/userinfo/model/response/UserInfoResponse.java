package vn.fis.spro.customer.domains.userinfo.model.response;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Data
public class UserInfoResponse {
    private Long id;
    private Long locationId;
    private Byte hasSecretary;
    private String staffCode;
    private String firstname;
    private String lastname;
    private String name;
    private String email;
    private String phone;
    private String status;
    private String handoverStatus;
    private Boolean available;
    private String addition;
    private String directManager;
    private String viceManager;
    private String idCardNo;
    private LocalDate idCardIssuedDate;
    private String idCardIssuer;
    private String description;
    private String createdUser;
    private LocalDate createdDate;
    private LocalDate modifiedDate;
    private String modifiedUser;
    private Boolean assignment;
    private String workingType;
    private Boolean multiChartApproval;

}
