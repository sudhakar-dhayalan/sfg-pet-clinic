package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.services.VetSerice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vets")
@Controller
public class VetController {
    private final VetSerice vetSerice;

    public VetController(VetSerice vetSerice) {
        this.vetSerice = vetSerice;
    }

    @RequestMapping({"", "/", "/index", "index.html"})
    public String listVets(Model model) {
        model.addAttribute("vets", vetSerice.findAll());
        return "vets/index";
    }
}
