package vn.fis.spro.customer.domains.systemconfig.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "system_config", schema = "customer")
public class SystemConfig {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "chart_id")
    private Long chartId;

    @Size(max = 50)
    @Column(name = "config_information", length = 50)
    private String configInformation;

    @Size(max = 50)
    @Column(name = "server_type", length = 50)
    private String serverType;

    @Size(max = 200)
    @Column(name = "config_code", length = 200)
    private String configCode;

    @Size(max = 500)
    @Column(name = "config_name", length = 500)
    private String configName;

    @Lob
    @Column(name = "config_value")
    private String configValue;

    @Size(max = 4000)
    @Column(name = "description", length = 4000)
    private String description;

    @Column(name = "created_date")
    private Instant createdDate;

    @Size(max = 45)
    @Column(name = "created_user", length = 45)
    private String createdUser;

    @Column(name = "modified_date")
    private Instant modifiedDate;

    @Size(max = 45)
    @Column(name = "modified_user", length = 45)
    private String modifiedUser;

    @Size(max = 10)
    @Column(name = "status", length = 10)
    private String status;

    @Size(max = 4000)
    @Column(name = "note", length = 4000)
    private String note;

    @Size(max = 200)
    @Column(name = "company_code", length = 200)
    private String companyCode;

    @Size(max = 200)
    @Column(name = "company_name", length = 200)
    private String companyName;

}