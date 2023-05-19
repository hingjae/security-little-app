package honey.littleapp.controller;

import honey.littleapp.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class MainController {

    private final ProductService productService;

    @GetMapping("/main")
    public String main(Authentication authentication, ModelMap map) {
        map.addAttribute("username", authentication.getName());
        map.addAttribute("products", productService.findAll());
        return "main";
    }
}
