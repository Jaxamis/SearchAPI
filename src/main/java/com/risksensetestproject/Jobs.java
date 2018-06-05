package com.risksensetestproject;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author seanr on 6/5/2018.
 * @project test-project
 */

public class Jobs implements Serializable {

    private String name;
    private String payrate;
    private String jobtype;
    private String explevel;
    private String country;
    private String availabilty;
    private String description;

    public Jobs(String name, String payrate, String jobtype, String explevel, String country, String availabilty, String description) {
        this.name = name;
        this.payrate = payrate;
        this.jobtype = jobtype;
        this.explevel = explevel;
        this.country = country;
        this.availabilty = availabilty;
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
        return availabilty;
    }

    public void setAvailabilty(String availabilty) {
        this.availabilty = availabilty;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jobs jobs = (Jobs) o;
        return Objects.equals(getName(), jobs.getName()) &&
                Objects.equals(getPayrate(), jobs.getPayrate()) &&
                Objects.equals(getJobtype(), jobs.getJobtype()) &&
                Objects.equals(getExplevel(), jobs.getExplevel()) &&
                Objects.equals(getCountry(), jobs.getCountry()) &&
                Objects.equals(getAvailabilty(), jobs.getAvailabilty()) &&
                Objects.equals(getDescription(), jobs.getDescription());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getPayrate(), getJobtype(), getExplevel(), getCountry(), getAvailabilty(), getDescription());
    }
}