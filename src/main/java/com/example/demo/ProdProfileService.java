package com.example.demo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class ProdProfileService implements ProfileService {

	@Override
	public void getProfile() {
		System.out.println("In the PROD profile..");

	}

}
