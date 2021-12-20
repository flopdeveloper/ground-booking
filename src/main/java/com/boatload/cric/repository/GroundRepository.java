/**
 * 
 */
package com.boatload.cric.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.boatload.cric.entity.CricketGround;

/**
 * @author WIN10USER
 *
 */
public interface GroundRepository extends CrudRepository<CricketGround, Integer>{
	
	Optional<CricketGround> findByName(String name);
}
