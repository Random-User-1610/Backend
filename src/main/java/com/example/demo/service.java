package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class service {
	@Autowired
	repository repo;
	
	public Optional<Model> getbyID(int id){
		return repo.findById(id);
	}
	
	public String delete(int id){
		repo.deleteById(id);
		return "deleted";
	}
	
	public List<Model> setPages(@PathVariable int offset,@PathVariable int pageSize)
	{
		Page<Model> page=repo.findAll(PageRequest.of(offset,pageSize));
		return page.getContent();
	}
	
	public List<Model> getSort(String field)
	{
		return repo.findAll(Sort.by(Sort.Direction.DESC,field));
	}
	
}

