package com.example.organizationService.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.organizationService.Dto.OrganizationDto;
import com.example.organizationService.Entity.Organization;
import com.example.organizationService.Mapper.OrganizationMapper;
import com.example.organizationService.Repository.OrganizationRepository;

@Service
public class OrganizationServiceImpl implements OrganizationService {

	@Autowired
	private OrganizationRepository organizationreposiotory;
	@Override
	public OrganizationDto saveOrganization(OrganizationDto organizationdto) {
		// TODO Auto-generated method stub
		Organization organization = OrganizationMapper.mapToOrganization(organizationdto);
		Organization savedOrganization = organizationreposiotory.save(organization);
		return OrganizationMapper.mapToOrganizationDto(savedOrganization);
	}
	@Override
	public OrganizationDto getOrganizationByCode(String organizationCode) {
		 Organization organization = organizationreposiotory.findByOrganizationCode(organizationCode);
	        return OrganizationMapper.mapToOrganizationDto(organization);
	}

}
