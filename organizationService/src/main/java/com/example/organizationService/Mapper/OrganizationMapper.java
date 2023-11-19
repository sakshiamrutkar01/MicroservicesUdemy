package com.example.organizationService.Mapper;

import com.example.organizationService.Dto.OrganizationDto;
import com.example.organizationService.Entity.Organization;

public class OrganizationMapper {

	public static OrganizationDto  mapToOrganizationDto (Organization organization)
	{
		OrganizationDto organizationdto = new OrganizationDto(
		organization.getId(),
		organization.getOrganizationName(),
		organization.getOrganizationDescription(),
		organization.getOrganizationCode(),
		
		organization.getCreatedDate()
		);
		return organizationdto;
	}
	
	public static Organization  mapToOrganization (OrganizationDto organizationdto)
	{
		Organization organization= new Organization(
		organizationdto.getId(),
		organizationdto.getOrganizationName(),
		organizationdto.getOrganizationDescription(),
		organizationdto.getOrganizationCode(),
		
		organizationdto.getCreatedDate()
		);
		return organization;
	}
}
