package com.kloudone.jobsearch.jpa;

import java.util.List;

import com.kloudone.jobsearch.bean.Jobs;

public interface IjobRepository{

	List<Jobs> findJobsbySkill(String skill);
	public void addJobintoDb(Jobs job);

}
