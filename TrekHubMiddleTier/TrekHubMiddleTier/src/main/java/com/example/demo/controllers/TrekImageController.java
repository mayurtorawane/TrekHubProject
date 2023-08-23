package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entities.*;
import com.example.demo.services.AddTrekService;
import com.example.demo.services.TrekImageService;

@RestController
public class TrekImageController 
{
	@Autowired
	TrekImageService trekimgservice;
	
	@Autowired
	AddTrekService addtrekservice;
	
	@PostMapping(value = "/uploadimage/{trek_id}",consumes = "multipart/form-data")
	public boolean uploadimage(@PathVariable("trek_id")int tid,@RequestBody MultipartFile file)
	{
		
		AddTrek adt = addtrekservice.getTrekInfo(tid);
		
		System.out.println(tid);
		System.out.println(file.getName());
		
		boolean flag=true;
		try
		{
			TrekImage trekimageobj= new TrekImage(file.getBytes(),adt);
			trekimgservice.insertdata(trekimageobj);
		}
		catch(Exception e)
		{
			flag=false;
		}
		return flag;
		
	}
	

}
