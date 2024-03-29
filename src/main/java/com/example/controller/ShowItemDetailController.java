package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.service.ShowItemDetailService;

@Controller
@RequestMapping("/showDetail")
public class ShowItemDetailController {
	
	@Autowired
	private ShowItemDetailService showItemDetailService;
	
	@Autowired
	HttpSession session;

	@RequestMapping("/showDetailItem")
	public String showDetail(Model model, Integer id) {
//		System.out.println("id:" + id);
		model.addAttribute("itemDetail", showItemDetailService.showDetail(id));
		return "item_detail";
	}
	

}
