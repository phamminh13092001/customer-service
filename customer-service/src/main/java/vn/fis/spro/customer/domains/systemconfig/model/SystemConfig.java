package vn.fis.spro.customer.domains.systemconfig.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "system_config")
public class SystemConfig {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "chart_id")
    private Long chartId;

    @Column(name = "config_information")
    private String configInformation;

    @Column(name = "server_type")
    private String serverType;

    @Column(name = "config_code")
    private String configCode;

    @Column(name = "config_name")
    private String configName;

    @Column(name = "config_value")
    private String configValue;

    @Column(name = "description")
    private String description;

    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @Column(name = "created_user")
    private String createdUser;

    @Column(name = "modified_date")
    private LocalDateTime modifiedDate;

    @Column(name = "modified_user")
    private String modifiedUser;

    @Column(name = "status")
    private String status;

    @Column(name = "note")
    private String note;
    @Column(name = "company_code")
    private String companyCode;
    @Column(name = "company_name")
    private String companyName;
}
