package vn.fis.spro.customer.domains.mongo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WorkingTimeRequest {
    private String LSCompanyCode;
    private String CompanyName;
    private String LevelCode;
    private String LevelName;
    private String ScheduleCode;
    private String ScheduleName;
    private String DateDetails;
}
