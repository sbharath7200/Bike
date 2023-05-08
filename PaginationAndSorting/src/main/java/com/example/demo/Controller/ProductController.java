package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.PageModel;
import com.example.demo.Service.ProductService;
import com.example.demo.Model.PageModel;

@RestController
public class ProductController {
	@Autowired ProductService product;
	@PostMapping()
	public PageModel addDetails(@RequestBody PageModel cr)
	{
		return product.saveInfo(cr);
	}
	@GetMapping("/getma")
	public List <PageModel> getDetails()
	{
		return product.getInfo();
	}
	
	@PutMapping("/updatem")
	public PageModel updateDetails(@RequestBody PageModel id)
	{
		return product.updateInfo(id);
	}
	
	@DeleteMapping("delete/{cid}")
	public String deleteDetails (@PathVariable ("cid") int id)
	{
		product.deleteInfo(id);
		return "Bike number "+id+" is deleted";
				
	}
	@DeleteMapping("/deleteReq")
	public String deleteByReq(@RequestParam ("cid") int id)
	{
		product.deleteInfo(id);
		return "Bike number "+id+" is deleted";
	}

}
