package com.rt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rt.entity.Employee;
import com.rt.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService emp;
	
   @RequestMapping("/")
	public String homepage(){
		return"home";
	}
   @RequestMapping("/registerForm")
   public String register(){
	   return "register";
   }
   
   @RequestMapping("/register")
   public String registerform(@ModelAttribute Employee e,Model m){
	   
	 boolean isadd=  emp.register(e);
	 if(isadd){
			m.addAttribute("successMsg","Employee Added Successfully...");
		}else{
			m.addAttribute("errMsg","Unable to Add...");
		}
	 
	return"register";
	   
   }
   
   @RequestMapping("/updateForm")
   public String update(){
	   return"update";
   }
   @RequestMapping("/update")
   public String updateform(@ModelAttribute Employee e,Model m){
	boolean isupdate=   emp.update(e);
	if(isupdate){
		m.addAttribute("successMsg","Employee update Successfully...");
	}else{
		m.addAttribute("errMsg","Unable to update...");
	}
	   return"update";
   }
   @RequestMapping("/deleteForm")
   public String delete(){
   return"delete";
   }
   
   @RequestMapping("/delete")
   public String deleteform(@RequestParam int id,Model m){
	  boolean isdelete= emp.delete(id);
	  if(isdelete){
			m.addAttribute("successMsg","Employee delete Successfully...");
		}else{
			m.addAttribute("errMsg","Unable to delete...");
		}
	   return "delete";
   }
   
   @RequestMapping("/selectForm")
   public String select(){
   return"select";
   }
   
   @RequestMapping("/select")
   public String selectform(@RequestParam int id,Model m){
	  Employee empservice=  emp.select(id);
	  
	  m.addAttribute("empData",empservice);
	   return"display";
   }
   
   
   @RequestMapping("/selectall")
   public String selectform(Model m){
	   List<Employee> list=   emp.selectall();
	   m.addAttribute("emplist",list);
	   return"selectall";
   }
}
