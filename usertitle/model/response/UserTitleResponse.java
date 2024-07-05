package vn.fis.spro.customer.domains.usertitle.model.response;

import lombok.Data;

@Data
public class UserTitleResponse {

    private String title;
    private Long chartId;
    private String chartName;
    private String username;
    private String chartNodeName;
    private String chartType;
    private String firstName;
    private String lastName;
    private String fullName;
    private Integer concurrently;

    public UserTitleResponse(String title, Long chartId, String chartName, String username, String chartNodeName, String chartType, String firstName, String lastName, Integer concurrently) {
        this.title = title;
        this.chartId = chartId;
        this.chartName = chartName;
        this.username = username;
        this.chartNodeName = chartNodeName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.chartType = chartType;
        this.concurrently = concurrently;
        if (lastName != null && firstName != null) {
            this.fullName = lastName + " " + firstName;
        }
    }
}
