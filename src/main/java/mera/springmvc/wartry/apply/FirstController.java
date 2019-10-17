package mera.springmvc.wartry.apply;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/war")
public class FirstController 
{
	@Autowired
	BikeCrud crud;
	@GetMapping("/")
	public ModelAndView alpha()
	{
		ModelAndView mod=new ModelAndView("index");
		List<Bike> bikes=new ArrayList<Bike>();
		crud.findAll().forEach(bikes::add);
		return mod.addObject("bikes", bikes);
	}
	@GetMapping("/def")
	public String beta()
	{
		return "default";
	}
}
