/**
 * 
 */
package com.neon.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.neon.model.Admin;

/**
 * @author user364
 *
 */
@Repository
public interface AdminRepository  extends CrudRepository<Admin, Integer>{

}
