package com.tutorialspoint;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BudgetController {
   @RequestMapping(value = "/buckets", method = RequestMethod.GET)
   public ModelAndView bucket() {
      return new ModelAndView("budget", "command", new Bucket());
   }
   @RequestMapping(value = "/updateBuckets", method = RequestMethod.POST)
      public String updateBuckets(@ModelAttribute("SpringWeb") Bucket bucket,  ModelMap model) {
      model.addAttribute("name", bucket.getName());
      model.addAttribute("paymentAmount", bucket.getPaymentAmount());
      model.addAttribute("goalAmount", bucket.getGoalAmount());
      
      return "result";
   }

}
