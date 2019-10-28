package dk.kea.dat18c.webshop.Controller;

import dk.kea.dat18c.webshop.Service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    ProductService productService = new ProductService();

    @GetMapping("/")
    public String index(Model model){
        //add til model
        model.addAttribute("products", productService.getAll());


        return "index";
    }

}
