package be.pdp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MeepleController {
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("message", "Groetjes uit Beveren-Waas");
		return "hello";
	}

}
