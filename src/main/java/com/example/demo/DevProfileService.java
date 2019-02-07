package com.example.demo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class DevProfileService implements ProfileService {

	@Override
	public void getProfile() {
		System.out.println("In the DEV profile!!");

	}

}
