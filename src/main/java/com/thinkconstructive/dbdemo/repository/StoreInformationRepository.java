package com.thinkconstructive.dbdemo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.thinkconstructive.dbdemo.entity.StoreInformation;

public interface StoreInformationRepository extends CrudRepository<StoreInformation	,Integer> {

	List<StoreInformation> findByStoreName(String name);
	List<StoreInformation> findByStorePhoneNumber(String phoneNumber);
	List<StoreInformation> findByStoreDetail(String detail);
}
