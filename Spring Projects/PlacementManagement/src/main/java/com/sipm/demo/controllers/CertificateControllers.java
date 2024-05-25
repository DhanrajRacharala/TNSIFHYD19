package com.sipm.demo.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.sipm.demo.entity.Certificate;
import com.sipm.demo.service.CertificateService;

@RestController
public class CertificateControllers {
	
	@Autowired
	CertificateService cs;
	
	
	@PostMapping("/certificate")
	public Certificate saveCertificate(@RequestBody Certificate certificate) {
		
		return cs.saveCertificate(certificate);
	}
	
	@GetMapping("/certificate")
    public List<Certificate> fetchCertificateList() {
        //LOGGER.info("Inside fetchDepartmentList of DepartmentController");
        return cs.fetchCertificateList();
	}
	
	
	@GetMapping("/certificate/{id}")
    public Certificate fetchCertificateById(@PathVariable("id") Long id)
            {
        return cs.fetchCertificateById(id);
    }
	
	@DeleteMapping("/certificate/{id}")
    public String deleteCertificateById(@PathVariable("id") Long id) {
        cs.deleteCertificateById(id);
        return "Department deleted Successfully!!";
    }
	
	

}
