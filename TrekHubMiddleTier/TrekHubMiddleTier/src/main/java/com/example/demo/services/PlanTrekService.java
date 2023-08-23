package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.PlanTrek;
import com.example.demo.repositories.PlanTrekRepository;

@Service
public class PlanTrekService 
{
	@Autowired
	PlanTrekRepository plantrekrepo;
	
	public PlanTrek save(PlanTrek t)
	{
		return plantrekrepo.save(t);
	}
	
	public PlanTrek getPlantrekbyid(int pid)
	{
		return plantrekrepo.getPlantrekbyid(pid);
	}
	
	

}
