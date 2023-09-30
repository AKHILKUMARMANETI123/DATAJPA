package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class userConstroller {
	@RequestMapping("/")
	public String userpage(ModelMap model)
	{
		User product=new User();
		model.put("product", product);
		return "reg";
		
	}
	@RequestMapping("/printinvoice")
	public String register(@ModelAttribute User product,ModelMap model)
	{
		double total=0.0;
		double discount=0.0;
		double invoicebill=0.0;
		total=product.getQuantity() * product.getPrice();
		model.put("Product",product);
		model.put("Total", total);
		if(total<5000)
		{
			 discount=total*15/100;
		}
		if(total<=3000)
		{
			 discount=total*10/100;
		}
		if(total>=5000)
		{
			 discount=total*20/100;
		}
		invoicebill=total-discount;
		model.put("Total", total);
		model.put("Discount", discount);
		model.put("Invoicebill", invoicebill);
	
		return "result";
	}

}
