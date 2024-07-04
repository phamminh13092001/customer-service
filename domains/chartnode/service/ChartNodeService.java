package vn.fis.spro.customer.domains.chartnode.service;

import vn.fis.spro.customer.domains.chartnode.model.request.ChartNodeDtoRequest;

public interface ChartNodeService {

    void getChartNodeByChartId(Long chartId);

    void getCharNodeByCodes(ChartNodeDtoRequest request);

    void listChildCompanyCodeByParentCode(ChartNodeDtoRequest request);

    void loadChartNodeFilter();
}
