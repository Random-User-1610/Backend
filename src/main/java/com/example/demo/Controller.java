package com.example.demo;	

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;




@RestController
@CrossOrigin
public class Controller {
		@Autowired
        repository repo;
		
		@Autowired
		service ser;


		@GetMapping ("/get")
		List<Model>getList(){
			return repo.findAll();
		}
		
		@GetMapping("/get/{id}")
		public Optional<Model>getbyID(@PathVariable int id){
			return ser.getbyID(id);
		}
		
		//getting car data according to availability
		@GetMapping("/getByAvailabilty")
		public List<Model> getByAvailabilty(@RequestParam  String is_available)
		{
			return repo.getAllAvailableCars(is_available);
		}
		
		
		
		//getting available cars by car data by name
		@GetMapping("/getByNameAndAvailability")
		public List<Model> getByNameAndAvailability(@RequestParam  String name,@RequestParam  String is_available)
		{
			return repo.getAllAvailableCarsByName(name,is_available);
		}
		 
		
		
		//posting the values
		@PostMapping("/post")
		public Model create(@RequestBody Model stu) {
			return repo.save(stu);
		}
		
		//updating the values
		@PutMapping("/update")
		public Model update(@RequestBody Model st) {
			return repo.save(st);	
		}
		
		
		//deleting the values
		@DeleteMapping("/delete")
		public String delete(@RequestParam int id) {
			return ser.delete(id);
		}
		
		
		
		
		
		
		
		
		
		@GetMapping("paginate/{offset}/{pagesize}")
		public List<Model> studentWithPagination(@PathVariable int offset,@ PathVariable int pageSize)
		{
			return ser.setPages(offset,pageSize);
		}
		
		@GetMapping("/{field}")
		public List<Model> setstudentSortList(@PathVariable String field)
		{
			return ser.getSort(field);
		}
}