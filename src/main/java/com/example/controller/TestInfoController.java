package com.example.controller;

import java.util.ArrayList;
import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.TestInfo;
import com.example.service.TestInfoService;

@CrossOrigin
@RestController
@RequestMapping("/testsInfo")
public class TestInfoController {

	@Autowired
	TestInfoService ti;

	@RequestMapping("/all")
	public ArrayList<TestInfo> getAll() {
		return ti.getAll();
	}

	@RequestMapping("{id}")
	public TestInfo getTestInfo(@PathVariable("id") String id) {
		return ps.TestInfo(id);
	}
}
