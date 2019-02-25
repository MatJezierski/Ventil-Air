package com.ventilair.web;


import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import com.ventilair.model.RectangularAirDuct;


@Controller
@RequestMapping("/rectangular")
public class RectangularDuctController{

		@InitBinder
		public void initBinder(WebDataBinder dataBinder) {
			
			StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
			dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
		}
		
		
		@RequestMapping("/showForm")
		public String showForm() {
			//theModel.addAttribute("rectangularDuct", new RectangularAirDuct());
			
			return "rectangular-initial-form";
		}
		
		
		@RequestMapping("/processForm")
		public String processForm(HttpServletRequest request, Model model) {
			
			String theWidth = request.getParameter("width");
			String theHeight = request.getParameter("height");
			String theLength = request.getParameter("length");
			
			int theWidth_int;
			int theHeight_int;
			int theLength_int;
			
			try {
				theWidth_int = Integer.parseInt(theWidth);
				theHeight_int = Integer.parseInt(theHeight);
				theLength_int = Integer.parseInt(theLength);
			}
			catch (NumberFormatException e)
			{
				theWidth_int = 0;
				theHeight_int = 0;
				theLength_int = 0;
			}
			
			RectangularAirDuct rect_1 = new RectangularAirDuct();
			
			double circuit = rect_1.calculateTheCircuit(theWidth_int, theHeight_int);
			double area = rect_1.calculateTheArea(circuit, theLength_int);
			
			model.addAttribute("circuit", circuit);
			model.addAttribute("area", area);
			
			return "rectangular-outcome";
		}	
}

