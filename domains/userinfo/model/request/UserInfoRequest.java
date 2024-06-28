package vn.fis.spro.customer.domains.userinfo.model.request;

import lombok.Data;

import java.util.List;

@Data
public class UserInfoRequest{
    private Long chartId;
    private Boolean available;
    private List<String> managerLevel;
    private Long chartNodeId;
    private List<Long> chartNodeIds;
    //    private List<Long> chartNodeChildIds;
    private String status;

    private String name;
    private String title;
    private String directManager;
    private String viceManager;
    private String staffCode;
    private Boolean assignment;
    private List<String> titleCode;
    private List<Integer> concurrently;
    private Boolean statusSecretary;
    private Boolean multiChartApproval;
}
