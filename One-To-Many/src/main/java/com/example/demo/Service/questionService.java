package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.question;
import com.example.demo.Repository.questionRepo;

@Service
public class questionService 
{
	@Autowired
	public questionRepo obj;
	public question addStudent(question smodel)
	{
		return obj.save(smodel);
	}
	public List<question>getStudent()
	{
		return obj.findAll();
	}
	public question putData(question smodel)
	{
		return obj.saveAndFlush(smodel);
	}
   public void deletedata(int studentid)
   {
	   obj.deleteById(studentid);
   }

}