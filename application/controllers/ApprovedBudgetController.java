package vn.fis.spro.customer.application.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.AbstractController;
import vn.fis.spro.customer.domains.approvedbudget.service.ApprovedBudgetService;

@RestController
@RequestMapping( "/approvedBudget")
public class ApprovedBudgetController extends BaseController {

    private ApprovedBudgetService approvedBudgetService;

    @GetMapping("/getAllSystemGroup")
    public ResponseEntity<?> getAllSystemGroup() {
       approvedBudgetService.getAllSystemGroup();
       return success("");
    }
}
