package com.risksensetestproject;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author seanr on 6/5/2018.
 * @project test-project
 *
 * This is the implementation for the jobs
 * Each job needs a name description and JobID
 * JobID is set by the the user who submits the job
 *
 *
 */

public class Jobs implements Serializable {

    private String name;
    private String payrate;
    private String jobtype;
    private String explevel;
    private String country;
    private String availability;
    private String description;
    private String jobid;

    public Jobs(String name, String payrate, String jobtype, String explevel, String country, String availabilty, String description) {
        this.name = name;
        this.payrate = payrate;
        this.jobtype = jobtype;
        this.explevel = explevel;
        this.country = country;
        this.availability = availability;
        this.description = description;
    }

    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPayrate() {
        return payrate;
    }

    public void setPayrate(String payrate) {
        this.payrate = payrate;
    }

    public String getJobtype() {
        return jobtype;
    }

    public void setJobtype(String jobtype) {
        this.jobtype = jobtype;
    }

    public String getExplevel() {
        return explevel;
    }

    public void setExplevel(String explevel) {
        this.explevel = explevel;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAvailabilty() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jobs jobs = (Jobs) o;
        return Objects.equals(name, jobs.name) &&
                Objects.equals(payrate, jobs.payrate) &&
                Objects.equals(jobtype, jobs.jobtype) &&
                Objects.equals(explevel, jobs.explevel) &&
                Objects.equals(country, jobs.country) &&
                Objects.equals(availability, jobs.availability) &&
                Objects.equals(description, jobs.description) &&
                Objects.equals(jobid, jobs.jobid);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, payrate, jobtype, explevel, country, availability, description, jobid);
    }
}