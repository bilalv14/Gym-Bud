package com.csc340.jpacruddemo.Repository;

import com.csc340.jpacruddemo.Entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author krwaheed
 */
public interface AdminRepository extends JpaRepository<Admin, Long> {
    Admin findByUsername(String username);
}