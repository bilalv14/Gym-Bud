package com.csc340.jpacruddemo.Service;

import com.csc340.jpacruddemo.Entity.Admin;
import com.csc340.jpacruddemo.Repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


 /**
 *
 * @author krwaheed
 */
@Service
public class AdminService {

    private final AdminRepository adminRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public AdminService(AdminRepository adminRepository, BCryptPasswordEncoder passwordEncoder) {
        this.adminRepository = adminRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public boolean login(String username, String password) {
        // Find the admin by username from the database
        Admin admin = adminRepository.findByUsername(username);

        // Check if the admin exists and if the provided password matches the stored hashed password
        if (admin != null && passwordEncoder.matches(password, admin.getPassword())) {
            return true; // Credentials are valid
        } else {
            return false; // Invalid credentials
        }
    }

}
