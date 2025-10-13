
package com.example.service;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.example.model.Person;

@Service
public class TestInfoService {
	ArrayList<TestInfo> testsInfo = new ArrayList<TestInfo>();
	public TestInfoService() {
		TestInfo ti = new TesInfo();
		
    ti = new TestInfo();
		ti.setId("10002");
		ti.setNum(44);
		ti.setTestDesc("webhookTestNGrok1");
		ti.testRes("test");
		testInfo.add(ti);

		ti = new TestInfo();
		ti.setId("10003");
		ti.setNum(44);
		ti.setTestDesc("webhookTestNGrok2");
		ti.testRes("test Done");
		testInfo.add(ti);
		
		ti = new TestInfo();
		ti.setId("10004");
		ti.setNum(44);
		ti.setTestDesc("webhookTestNGrok2 after restart");
		ti.testRes("test Done");
		testInfo.add(ti);
				
		ti = new TestInfo();
		ti.setId("10005");
		ti.setNum(44);
		ti.setTestDesc("webhookTestNGrok2  w  Email Notification DONE!!");
		ti.testRes("test Done");
		testInfo.add(ti);
		
	}
	public TestInfo getTestInfo(String id) {
		for(TestInfo testInfo:testsInfo) {
			if(testInfo.getId().equalsIgnoreCase(id)) return testInfo;
		}
	    return null;
	}
	public ArrayList<TestInfo> getAll() {
		return testsInfo;
	}
}
