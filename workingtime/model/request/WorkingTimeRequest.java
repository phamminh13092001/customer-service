package vn.fis.spro.customer.domains.workingtime.model.request;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
public class WorkingTimeRequest {
    private String name;
    private String workScheduleCode;
    private String description;
    private String timezone;
    private String saturdayWorking;
    private String sundayWorking;
    private Long workingTimeId;
    private Double morningWorking;
    private Double lunchBreak;
    private Double afternoonWorking;
    private String startTime;
    private List<Map<String, String>> vacation;
    private LocalDateTime createdDate;
    private String createdUser;
    private Date modifiedDate;
    private String modifiedUser;
    private List<String> shareWith;
    private List<String> applyFor;
}
