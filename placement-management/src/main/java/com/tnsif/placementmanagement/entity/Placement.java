package com.tnsif.placementmanagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "placements")
public class Placement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String companyName;
    private String jobRole;
    private String driveDate;

    public Placement() {}

    public Placement(String companyName, String jobRole, String driveDate) {
        this.companyName = companyName;
        this.jobRole = jobRole;
        this.driveDate = driveDate;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }

    public String getJobRole() { return jobRole; }
    public void setJobRole(String jobRole) { this.jobRole = jobRole; }

    public String getDriveDate() { return driveDate; }
    public void setDriveDate(String driveDate) { this.driveDate = driveDate; }
}
