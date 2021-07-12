package sirjaw.dev.unitvsintegrationvsacceptancetest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sirjaw.dev.unitvsintegrationvsacceptancetest.Services.WelcomeService;

@RestController
public class WelcomeController {

    private WelcomeService welcomeService;

    public WelcomeController(WelcomeService welcomeService){
        this.welcomeService = welcomeService;
    }

    @GetMapping("/welcome")
    public String welcome(@RequestParam(defaultValue = "Stranger") String name){
        return welcomeService.getWelcomeMessage(name);
    }
}
