package com.tnsif.OnetoOneMapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.OnetoOneMapping.entity.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
}
