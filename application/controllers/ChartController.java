package vn.fis.spro.customer.application.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.fis.spro.common.model.request.BaseFilterDto;
import vn.fis.spro.common.model.request.ChartRequest;
import vn.fis.spro.customer.domains.chart.model.request.LoadChartFilterRequest;
import vn.fis.spro.customer.domains.chart.service.ChartService;


import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/chart")
public class ChartController extends BaseController {
    private ChartService chartService;

    @GetMapping("/getChartActiveByUsername")
    public ResponseEntity<?> getChartActiveByAccount(@RequestParam("username") String email) {
        chartService.getChartActiveByAccount(email);
        return success("");
    }

    @PostMapping("/getUserByEmail")
    public ResponseEntity<?> getUserByEmail(@RequestBody ChartRequest chartRequest) {
       chartService.getUserByEmail(chartRequest);
       return success("");
    }

    @PostMapping("/loadChartFilter")
    public ResponseEntity<?> loadChartFilter(@RequestBody(required = false) LoadChartFilterRequest request) {
       chartService.loadChartFilter(request);
       return success("");
    }

    @GetMapping("/findCompanyCodeByUsername")
    public ResponseEntity<?> findCompanyCodeByUsername(@RequestParam String username) {
        chartService.findCompanyCodeByUsername(username);
        return success("");
    }


    @PostMapping("/findChartAndChartNodeCreateTicket")
    public ResponseEntity<?> findChartAndChartNodeCreateTicket(@RequestBody Map<String, Object> params) {
        chartService.findChartAndChartNodeCreateTicket(params);
        return success("");
    }

    @GetMapping("/getAllChartActive")
    public ResponseEntity<?> getAllChartActive() {
        chartService.getAllChartActive();
        return success("");
    }

    @GetMapping("/getCompanyCodeAndNameByUsername")
    public ResponseEntity<?> getCompanyCodeAndNameByUsername(@RequestParam String username) {
        chartService.getCompanyCodeAndNameByUsername(username);
        return success("");
    }

    @PostMapping("/getCompanyCodeAndNameByUsernames")
    public ResponseEntity<?> getCompanyCodeAndNameByUsernames(@RequestBody List<String> usernames) {
        chartService.getCompanyCodeAndNameByUsernames(usernames);
        return success("");
    }

    @PostMapping("/findAllCompanyCodeAndNameByCompanyCode")
    public ResponseEntity<?> getAllSystemGroup(@RequestBody BaseFilterDto req) {
        chartService.getAllSystemGroup(req);
        return success("");
    }
}
