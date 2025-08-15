package com.tnsif.OnetoOneMapping.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "profile")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bio;
    private String address;
    private String socialMediaLink;

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getBio() { return bio; }
    public void setBio(String bio) { this.bio = bio; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public String getSocialMediaLink() { return socialMediaLink; }
    public void setSocialMediaLink(String socialMediaLink) { this.socialMediaLink = socialMediaLink; }
}
