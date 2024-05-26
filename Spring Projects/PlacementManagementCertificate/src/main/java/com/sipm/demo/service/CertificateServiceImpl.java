package com.sipm.demo.service;



import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sipm.demo.entity.Certificate;
import com.sipm.demo.repository.CertificateRepository;

@Service
public class CertificateServiceImpl implements CertificateService {

	
	@Autowired
	CertificateRepository cr;

	
	@Override
	public Certificate saveCertificate(Certificate certificate) {
		// TODO Auto-generated method stub
		return cr.save(certificate);
	}

	@Override
	public List<Certificate> fetchCertificateList() {
		// TODO Auto-generated method stub
		return cr.findAll();
	}
  
	
	@Override
	public Certificate fetchCertificateById(Long id) {
		// TODO Auto-generated method stub
		return cr.findById(id).get();
	}

	@Override
	public void deleteCertificateById(Long id) {
		// TODO Auto-generated method stub
		cr.deleteById(id);
		
	}

	@Override
	public Certificate updateCertificate(Long id, Certificate certificate) {
		
	Certificate certificateDB = cr.findById(id).get();
			
			if(Objects.nonNull(certificate.getYear()) &&
				       !"".equals(certificate.getYear())) {
				           certificateDB.setYear(certificate.getYear());
				       }
	
				      
				       if(Objects.nonNull(certificate.getCollege()) &&
				               !"".equalsIgnoreCase(certificate.getCollege())) {
				           certificateDB.setCollege(certificate.getCollege());
				       }
	
				       return cr.save(certificateDB);
			
			
			
		}
		
	}

	

	

