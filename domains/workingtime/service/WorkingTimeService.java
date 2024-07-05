package vn.fis.spro.customer.domains.workingtime.service;

import vn.fis.spro.customer.domains.workingtime.model.request.ListTimeExpectRequest;

import java.util.List;

public interface WorkingTimeService {

    void getListTime(List<ListTimeExpectRequest> listTimeExpectRequests);

    void caculTime(Long startDateTicket,long timeRes,String emailAssignee);

    void getListTimeExpect(List<ListTimeExpectRequest> listTimeExpectRequests);
}
