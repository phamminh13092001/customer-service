package vn.fis.spro.customer.domains.usertitle.model.request;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserTitleSynDataRequest {
    private String staffCode;
    private String orgCode;
    private String jobTitleCode;
    private LocalDate fromDate;
    private LocalDate toDate;
}
