package com.example.organizationService.Controller;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.organizationService.Dto.OrganizationDto;
import com.example.organizationService.Service.OrganizationService;

@RestController
@RequestMapping("api/organizations")

public class OrganizationController {

    private OrganizationService organizationService;// only one constructor so @Autowired is not required

    // Build Save Organization REST API
    @PostMapping
    public ResponseEntity<OrganizationDto> saveOrganization(@RequestBody OrganizationDto organizationDto){
        OrganizationDto savedOrganization = organizationService.saveOrganization(organizationDto);
        //return new ResponseEntity<>(savedOrganization, HttpStatus.CREATED);
        return ResponseEntity.ok(savedOrganization);
    }

	public OrganizationController(OrganizationService organizationService) {
		super();
		this.organizationService = organizationService;
	}

    // Build Get Organization by Code REST API
	
	 @GetMapping("/{organization-code}")
	    public ResponseEntity<OrganizationDto> getOrganization(@PathVariable("organization-code") String organizationCode){
	        OrganizationDto organizationDto = organizationService.getOrganizationByCode(organizationCode);
	        return ResponseEntity.ok(organizationDto);
	    }
   

}