package com.example.demo.services;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.AddTrek;
import com.example.demo.repositories.AddTrekRepository;

@Service
public class AddTrekService
{
	@Autowired
	AddTrekRepository addtrekrepo;
	
	public AddTrek save(AddTrek t)
	{
		return addtrekrepo.save(t);
	}
	public AddTrek getTrekInfo(int id)
	{
		System.out.println("addteckservice--"+id);
		Optional<AddTrek> trekdata=addtrekrepo.findById(id);
		System.out.println("trekid--"+trekdata );
		AddTrek trek=null;
		try
		{
			trek=trekdata.get();
		}
		catch(NoSuchElementException e)
		{
			trek=null;
		}
		return trek;
	}
	
	
	
	
	
	
	
	
	
	
	

}