package vn.fis.spro.customer.application.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import vn.fis.spro.customer.domains.chartnode.model.request.ChartNodeDtoRequest;
import vn.fis.spro.customer.domains.chartnode.service.ChartNodeService;


public class ChartNodeController extends BaseController {

    private ChartNodeService chartNodeService;
    @GetMapping("/getChartNodeByChartId")
    public ResponseEntity<?> getChartNodeByChartId(@RequestParam("chartId") Long chartId) {
        chartNodeService.getChartNodeByChartId(chartId);
        return success("");
    }

    @PostMapping("/getCharNodeByCodes")
    public ResponseEntity<?> getCharNodeByCodes(@RequestBody ChartNodeDtoRequest request) {
        chartNodeService.getCharNodeByCodes(request);
        return success("");
    }

    @PostMapping("/listChildCompanyCodeByParentCode")
    public ResponseEntity<?> listChildCompanyCodeByParentCode(@RequestBody ChartNodeDtoRequest request) {
        chartNodeService.listChildCompanyCodeByParentCode(request);
        return success("");
    }

    @GetMapping("/loadChartNodeFilter")
    public ResponseEntity<?> loadChartNodeFilter() {
        chartNodeService.loadChartNodeFilter();
        return success("");
    }
}
