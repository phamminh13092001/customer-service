package vn.fis.spro.customer.domains.workingtime.model.response;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Data
public class WorkingTimeResponse {
    private Long id;
    private String name;
    private String description;
    private String timezone;
    private String saturdayWorking;
    private String sundayWorking;
    private String startTime;
    private Double morningWorking;
    private Double lunchBreak;
    private Double afternoonWorking;
    private List<Map<String, String>> vacation;
    private LocalDateTime createdDate;
    private String createdUser;
    private LocalDate modifiedDate;
    private String modifiedUser;
    private String workScheduleCode;
    private List<String> shareWith;
    private List<String> applyFor;
    private String companyCode;
    private String companyName;

}
