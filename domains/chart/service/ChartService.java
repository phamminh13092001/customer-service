package vn.fis.spro.customer.domains.chart.service;

import vn.fis.spro.common.model.request.BaseFilterDto;
import vn.fis.spro.common.model.request.ChartRequest;

import java.util.List;
import java.util.Map;

public interface ChartService {
    void getChartActiveByAccount(String email);

    void getUserByEmail(ChartRequest chartRequest);

    void loadChartFilter(LoadChartFilterRequest request);

    void findCompanyCodeByUsername(String username);

    void findChartAndChartNodeCreateTicket(Map<String, Object> params);

    void getAllChartActive();

    void getCompanyCodeAndNameByUsername(String username);

    void getCompanyCodeAndNameByUsernames(List<String> usernames);

    void getAllSystemGroup(BaseFilterDto req);
}
