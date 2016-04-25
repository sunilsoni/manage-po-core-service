package com.jci.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jci.domain.E2Open;

@Repository
public interface PORepository extends CrudRepository<E2Open,Long>{
	
	Iterable<E2Open> findByIdIn(Collection<Long> ids);
	
	//Iterable<PO> findByPoNumIn(Collection<Long> ids);
	
	List<E2Open> findByOrderNumberIn(List<String> orderNumber);
	
	List<E2Open> findByStatusIn(List<Integer> status);
	
}
