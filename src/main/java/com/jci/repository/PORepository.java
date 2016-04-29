package com.jci.repository;

import java.util.Collection;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jci.domain.E2Open;

@Repository
public interface PORepository extends CrudRepository<E2Open,Long>{
	
	Iterable<E2Open> findByIdIn(Collection<Long> ids);
	
	//Iterable<PO> findByPoNumIn(Collection<Long> ids);
	
	List<E2Open> findByOrderNumberIn(List<String> orderNumber);
	
	List<E2Open> findByStatusIn(List<Integer> status);
	
	@Transactional
	@Modifying
	@Query("update E2Open o set o.status = ?1 where o.id = ?2")
	int setStatusFor(int status, Long id);
	
}
