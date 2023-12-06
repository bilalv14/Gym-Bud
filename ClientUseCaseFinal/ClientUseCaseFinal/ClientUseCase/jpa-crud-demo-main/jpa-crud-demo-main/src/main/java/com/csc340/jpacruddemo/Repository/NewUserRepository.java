/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csc340.jpacruddemo.Repository;

import com.csc340.jpacruddemo.Entity.NewUser;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author bilalzahid
 */
public interface NewUserRepository extends JpaRepository<NewUser, Long> {
    
     List<NewUser> findByUserType(String userType);
}

