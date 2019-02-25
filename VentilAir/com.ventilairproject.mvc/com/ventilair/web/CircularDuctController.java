package com.ventilair.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ventilair.model.CircularAirDuct;

@Controller
@RequestMapping("/circular")
public class CircularDuctController {
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	
	@RequestMapping("/showForm")
	public String showForm() {
		//theModel.addAttribute("rectangularDuct", new RectangularAirDuct());
		
		return "circular-initial-form";
	}
	
	
	@RequestMapping("/processForm")
	public String processForm(HttpServletRequest request, Model model) {
		
		String theDiameter = request.getParameter("diameter");
		String theLength = request.getParameter("length");
		
		int theDiameter_int;
		int theLength_int;
		
		try {
			theDiameter_int = Integer.parseInt(theDiameter);
			theLength_int = Integer.parseInt(theLength);
		}
		catch (NumberFormatException e)
		{
			theDiameter_int = 0;
			theLength_int = 0;
		}
		
		CircularAirDuct circ_1 = new CircularAirDuct();
		
		double circuit = circ_1.calculateTheCircuit(theDiameter_int);
		double area = circ_1.calculateTheArea(circuit, theLength_int);
		
		model.addAttribute("circuit", circuit);
		model.addAttribute("area", area);
		
		return "circular-outcome";
	}	

}
