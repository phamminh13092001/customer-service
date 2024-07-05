package vn.fis.spro.customer.application.controllers;


import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vn.fis.spro.customer.domains.usertitle.service.UserTitleService;

@RestController
@RequestMapping("/userTitle")
@Tag(name = "User title Controller", description = "The Customer Service API with description tag annotation")
@Slf4j
public class UserTitleController extends  BaseController{
    private UserTitleService userTitleService;

    @GetMapping("/getTitleByUsername")
    public ResponseEntity<?> getTitleByUsername(@RequestParam("username") String username) {
        userTitleService.getTitleByUsername(username);
        return success("");
    }

    @GetMapping("/getUserTitle")
    public ResponseEntity<?> getUserTitle(@RequestParam("username") String username) {
        userTitleService.getUserTitle(username);
        return success("");
    }

}
