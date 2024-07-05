package vn.fis.spro.customer.domains.workingtime.model.request;

import lombok.Data;

@Data
public class ListTimeExpectRequest {
    private Long ticketId;
    private String procInstId;
    private String user;
    private Long date;
    private Long time;
}
