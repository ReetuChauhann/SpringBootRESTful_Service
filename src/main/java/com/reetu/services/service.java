package com.reetu.services;

import org.springframework.stereotype.Service;

@Service
public class service implements MyService {
	@Override
	 public int  add(int a, int b) {
		 int r=a+b;
		 return r;
	 }

}
