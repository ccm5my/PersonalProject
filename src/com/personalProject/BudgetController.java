package com.personalProject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BudgetController {
	private static final int CAR_INSURANCE_GOAL_AMOUNT = 1000;
	private static final String CAR_INSURANCE_NAME = "Car Insurance";
	private int CAR_INSURANCE_CURRENT_AMOUNT = 450;
	
	//need to set this up ^^ with a database call. 

	@RequestMapping(value = "/buckets", method = RequestMethod.GET)
	public ModelAndView bucket() {
		return new ModelAndView("budget", "command", new Bucket());
	}

	@RequestMapping(value = "/updateBuckets", method = RequestMethod.POST)
	public String updateBuckets(@ModelAttribute("SpringWeb") Bucket carInsuranceBucket, ModelMap model) {

		carInsuranceBucket.setName(CAR_INSURANCE_NAME);
		carInsuranceBucket.setGoalAmount(CAR_INSURANCE_GOAL_AMOUNT);
		carInsuranceBucket.setCurrentAmount(CAR_INSURANCE_CURRENT_AMOUNT);
		model.addAttribute("name", carInsuranceBucket.getName());
		model.addAttribute("currentAmount", carInsuranceBucket.getCurrentAmount());
		model.addAttribute("paymentAmount", carInsuranceBucket.getPaymentAmount());
		model.addAttribute("newAmount", carInsuranceBucket.getNewAmount());
		model.addAttribute("goalAmount", carInsuranceBucket.getGoalAmount());
		
		return "result";
	}

	

}
