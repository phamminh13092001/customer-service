package vn.fis.spro.customer.domains.usertitle.model.response;

import lombok.Data;

import java.time.Instant;
import java.time.LocalDate;

@Data
public class UserTitleResponse {
    private Long id;
    private Long chartNodeId;
    private Long userInfoId;
    private String positionCode;
    private String positionName;
    private String titleCode;
    private String titleName;
    private String managerLevel;
    private Boolean concurrently;
    private LocalDate concurrentlyBeginDate;
    private LocalDate concurrentlyEndDate;
    private LocalDate secretaryBeginDate;
    private LocalDate secretaryEndDate;
    private Long statusSecretary;
    private Instant createdTime;
    private Instant updatedTime;


}
