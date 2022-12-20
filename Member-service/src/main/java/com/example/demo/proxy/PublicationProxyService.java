package com.example.demo.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.bean.PublicationBean;

@FeignClient(name = "PUBLICATION-SERVICE")
public interface PublicationProxyService {

	@GetMapping("/publication/{id}")
	public PublicationBean findPublicationById(@PathVariable(name = "id") Long id);
	
}
