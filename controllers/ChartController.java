package vn.fis.spro.customer.application.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import vn.fis.spro.common.model.request.BaseFilterDto;
import vn.fis.spro.customer.domains.chart.model.request.ChartRequest;

import java.util.List;
import java.util.Map;

public class ChartController {
    @GetMapping("/getChartActiveByUsername")
    public ResponseEntity<?> getChartActiveByAccount(@RequestParam("username") String email) {
        //TODO
        return null;
    }

    @PostMapping("/getUserByEmail")
    public ResponseEntity<?> getUserByEmail(@RequestBody ChartRequest chartRequest) {
        //TODO
        return null;
    }

    @PostMapping("/loadChartFilter")
    public ResponseEntity<?> loadChartFilter(@RequestBody(required = false) LoadChartFilterRequest request) {
        //TODO
        return null;
    }

    @GetMapping("/findCompanyCodeByUsername")
    public ResponseEntity<?> findCompanyCodeByUsername(@RequestParam String username) {
        //TODO
        return null;
    }


    @PostMapping("/findChartAndChartNodeCreateTicket")
    public ResponseEntity<?> findChartAndChartNodeCreateTicket(@RequestBody Map<String, Object> params) {
        //TODO
        return null;
    }

    @GetMapping("/getAllChartActive")
    public ResponseEntity<?> getAllChartActive() {
        //TODO
        return null;
    }

    @GetMapping("/getCompanyCodeAndNameByUsername")
    public ResponseEntity<?> getCompanyCodeAndNameByUsername(@RequestParam String username) {
        //TODO
        return null;
    }

    @PostMapping("/getCompanyCodeAndNameByUsernames")
    public ResponseEntity<?> getCompanyCodeAndNameByUsernames(@RequestBody List<String> usernames) {
        //TODO
        return null;
    }

    @PostMapping("/findAllCompanyCodeAndNameByCompanyCode")
    public ResponseEntity<?> getAllSystemGroup(@RequestBody BaseFilterDto req) {
        //TODO
        return null;
    }
}
