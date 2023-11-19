package com.example.organizationService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.organizationService.Dto.OrganizationDto;
import com.example.organizationService.Entity.Organization;


@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Long> {

	
	Organization findByOrganizationCode(String organizationCode);
	
}
