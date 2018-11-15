package com.kloudone.jobsearch.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="jobTable", catalog="jobs")
public class Jobs {

	public Jobs() {
		
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int jobId;
	 
	@Column(name="skill")
	private String skill;
	
	@Column(name="jobname")
	private String jobName;
	
	@Column(name="location")
	private String location;
	
	@Column(name="exp")
	private int experience;
	
	@Column(name="jobDesc")
	private String jobDesc;
	

	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getJobDesc() {
		return jobDesc;
	}
	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}
	@Override
	public String toString() {
		return "Jobs [jobId=" + jobId + ", skill=" + skill + ", jobName=" + jobName + ", location=" + location
				+ ", experience=" + experience + ", jobDesc=" + jobDesc + "]";
	}
	
	
}
