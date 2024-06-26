package vn.fis.spro.customer.domains.mongo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Document(collection = "working_time")
@SuppressWarnings("serial")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkingTimeMongo implements Serializable {
    @Id
    String id;
    String LSCompanyCode;
    String CompanyName;
    String LevelCode;
    String LevelName;
    String ScheduleCode;
    String ScheduleName;
    List<Object> DateDetails;
}
