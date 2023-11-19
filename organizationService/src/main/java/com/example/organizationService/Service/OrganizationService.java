package com.example.organizationService.Service;

import com.example.organizationService.Dto.OrganizationDto;

public interface OrganizationService {

	OrganizationDto saveOrganization (OrganizationDto organizationdto);

	OrganizationDto getOrganizationByCode(String organizationCode);

	
	
}
