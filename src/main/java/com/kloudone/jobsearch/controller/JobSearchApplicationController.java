package com.kloudone.jobsearch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.kloudone.jobsearch.bean.Jobs;
import com.kloudone.jobsearch.jpa.JobRepository;


@RestController
public class JobSearchApplicationController {

	@Autowired
	JobRepository jobRepository;

	
	@RequestMapping("/jobsearch")
	@ResponseBody
	public List<Jobs> getJobsbySkill(@RequestParam("skill")String skillSelected){
		
		List<Jobs> jobList=jobRepository.findJobsbySkill(skillSelected);
		
		return jobList;
		
	}
	
	@RequestMapping("/addjob")
	@ResponseBody
	public void addJobs(@RequestBody Jobs job) {
		
		try{
			if(job != null) {
				jobRepository.addJobintoDb(job);
			}
			
		}catch(NullPointerException exp) {
			exp.getMessage(); 
		}
	
	}
	
}
