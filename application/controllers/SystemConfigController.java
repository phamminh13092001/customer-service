package vn.fis.spro.customer.application.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vn.fis.spro.customer.domains.systemconfig.service.SystemConfigService;

@RestController
@RequestMapping("/systemConfig")
public class SystemConfigController extends BaseController {
    private SystemConfigService systemConfigService;

    @GetMapping("/getAllSystemGroup")
    public ResponseEntity<?> getAllSystemGroup() {
        systemConfigService.getAllSystemGroup();
        return success("");
    }

    @GetMapping("/findByCodeAndName")
    public ResponseEntity<?> findByCodeAndName(@RequestParam(required = false) String code, @RequestParam(required = false) String name) {
       systemConfigService.findByCodeAndName(code, name);
       return success("");
    }

    @GetMapping("/findValueByCodeAndInfo")
    public ResponseEntity<?> findValueByCodeAndInfo(@RequestParam(required = false) String code,
                                                    @RequestParam(required = false) String info,
                                                    @RequestParam("username") String username) {
       systemConfigService.findValueByCodeAndInfo(code, info, username);
       return success("");
    }
}
