package com.sipm.demo.service;

import java.util.List;

import com.sipm.demo.entity.Certificate;

public interface CertificateService {

	Certificate saveCertificate(Certificate certificate);

	List<Certificate> fetchCertificateList();

	Certificate fetchCertificateById(Long id);

	void deleteCertificateById(Long id);

	Certificate updateCertificate(Long id, Certificate certificate);

	
	

}
