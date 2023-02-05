package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("provider")
public class ProviderController {
	
	@RequestMapping("/info")
	@ResponseBody
	public String info()
	{
		String formation="Spring";
		int nbrHeures = 20;
		System.out.println("Hello BootCamp");
		return "Détails formation : "+formation + " "+nbrHeures;
		//return "<h2 align=center>BootCamp</h2>";
		//return "info.html";
	}

}
