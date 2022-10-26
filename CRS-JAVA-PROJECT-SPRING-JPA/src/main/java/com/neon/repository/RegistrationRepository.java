/**
 * 
 */
package com.neon.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.neon.model.Registration;

/**
 * @author user365
 *
 */

@Repository
public interface RegistrationRepository extends CrudRepository<Registration, Integer>{

}
