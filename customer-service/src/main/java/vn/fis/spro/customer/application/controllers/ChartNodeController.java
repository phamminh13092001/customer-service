package vn.fis.spro.customer.application.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public class ChartNodeController {
    @GetMapping("/getChartNodeByChartId")
    public ResponseEntity<?> getChartNodeByChartId(@RequestParam("chartId") Long chartId) {
        //TODO
        return null;
    }

    @PostMapping("/getCharNodeByCodes")
    public ResponseEntity<?> getCharNodeByCodes(@RequestBody ChartNodeDtoRequest request) {
        //TODO
        return null;
    }

    @PostMapping("/listChildCompanyCodeByParentCode")
    public ResponseEntity<?> listChildCompanyCodeByParentCode(@RequestBody ChartNodeDtoRequest request) {
        //TODO
        return null;
    }

    @GetMapping("/loadChartNodeFilter")
    public ResponseEntity<?> loadChartNodeFilter() {
        //TODO
        return null;
    }
}
