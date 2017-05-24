package Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController 

{
	
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}

	@RequestMapping("/signup")
	public String signup()
	{
		return "signup";
	}

	@RequestMapping("/login")
	public String login()
	{
		return "login";
	}
	@RequestMapping("/productDetails")
	public String productDetails()
	{
		return "productDetails";
	}

}
