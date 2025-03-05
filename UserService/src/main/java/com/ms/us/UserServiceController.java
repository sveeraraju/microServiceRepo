package com.ms.us;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/userservice")
public class UserServiceController {
	
	
	@GetMapping("/")
	public List<String> getUserDetail()
	{
		
		List<String> userDetail=new ArrayList<String>();
		
		userDetail.add("Veera");
		userDetail.add("Raju");
		userDetail.add("Abhi");
		userDetail.add("Vivi");
		userDetail.add("Shek");
		userDetail.add("Geetha");
		
		return userDetail;
	}
	@GetMapping("/detail")
	public List<String> getUserDetailByname(@PathParam("name") String name)
	{
		
		List<String> userDetail=new ArrayList<String>();
		
		userDetail.add("Veera");
		userDetail.add("Raju");
		userDetail.add("Abhi");
		userDetail.add("Vivi");
		userDetail.add("Shek");
		userDetail.add("Geetha");
		List<String> res=userDetail.stream()
				.filter(e->e.equalsIgnoreCase(name))
				.toList();
		
		
		return res;
	}

}
