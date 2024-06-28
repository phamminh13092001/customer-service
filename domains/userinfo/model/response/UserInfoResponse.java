package vn.fis.spro.customer.domains.userinfo.model.response;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@SuperBuilder
public class UserInfoResponse {
    private Long id;
    private Long locationId;
    private Integer hasSecretary;
    private String staffCode;
    private String firstname;
    private String lastname;
    private String name;
    private String email;
    private String phone;
    private String handoverStatus;
    private boolean available;
    private Map<String, Object> addition;
    private String directManager;
    private String viceManager;
    private String description;
    private Long chartNodeId;
    private String chartNodeName;
    private String positionCode;
    private String positionName;
    //temporary
    private String title;
    private String titleCode;
    private String titleName;
    private String managerLevel;
    private Integer concurrently;
    private LocalDate concurrentlyBeginDate;
    private LocalDate concurrentlyEndDate;
    private Boolean assignment;

    private List<Long> chartNodeIdSecretary;


    public UserInfoResponse(Long id, Long locationId, Integer hasSecretary, String staffCode, String firstname, String lastname, String email, String phone, String handoverStatus, boolean available, Map<String, Object> addition, String directManager, String viceManager, String description, Long chartNodeId, String chartNodeName, String positionCode, String positionName, String titleCode, String titleName, String managerLevel, Integer concurrently, LocalDate concurrentlyBeginDate, LocalDate concurrentlyEndDate, Boolean assignment) {
        this.id = id;
        this.locationId = locationId;
        this.hasSecretary = hasSecretary;
        this.staffCode = staffCode;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phone = phone;
        this.handoverStatus = handoverStatus;
        this.available = available;
        this.addition = addition;
        this.directManager = directManager;
        this.viceManager = viceManager;
        this.description = description;
        this.chartNodeId = chartNodeId;
        this.chartNodeName = chartNodeName;
        this.positionCode = positionCode;
        this.positionName = positionName;
        this.titleCode = titleCode;
        this.titleName = titleName;
        this.managerLevel = managerLevel;
        this.concurrently = concurrently;
        this.concurrentlyBeginDate = concurrentlyBeginDate;
        this.concurrentlyEndDate = concurrentlyEndDate;
        this.title = titleName;
        this.assignment = assignment;
    }
}
