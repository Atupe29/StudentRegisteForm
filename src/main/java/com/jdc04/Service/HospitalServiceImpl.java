package com.jdc04.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdc04.Entity.Hospital;
import com.jdc04.Repository.HospitalRepo;

@Service
public class HospitalServiceImpl implements HospitalService {

	@Autowired
	private HospitalRepo hospitalRepo;

	@Override
	public void registerPatient(Hospital hospital) {
		hospitalRepo.save(hospital);

	}

}
