package vn.fis.spro.customer.domains.workingtime.service;

public interface WorkingTimeService {

    void getListTime(List<ListTimeExpectRequest> listTimeExpectRequests);

    void caculTime(Long startDateTicket,long timeRes,String emailAssignee);

    void getListTimeExpect(List<ListTimeExpectRequest> listTimeExpectRequests);
}
