package com.cts.droamemanagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.cts.droamemanagement.domain.Location;

public interface LocationRepoitoryIfc extends CrudRepository<Location, Long> {

}
