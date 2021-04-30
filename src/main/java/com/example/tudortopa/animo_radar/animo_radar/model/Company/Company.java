package com.example.tudortopa.animo_radar.animo_radar.model.Company;

import com.example.tudortopa.animo_radar.animo_radar.model.Projects.Project;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.Set;


@Entity
@Table(name = "Companies")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long companyId;
    @Column(name = "companyName", unique = true, nullable = false)
    private String companyName;
    @Column(name = "foundationDate")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date foundationDate;
    @OneToMany(mappedBy = "company")
    @JsonIgnore
    private Set<Project>  projects;

    public Company(){

    }


    public Company(long companyId, String companyName, Date foundationDate) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.foundationDate = foundationDate;
    }

    public long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Date getFoundationDate() {
        return foundationDate;
    }

    public void setFoundationDate(Date foudnationDate) {
        this.foundationDate = foudnationDate;
    }

    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }
}