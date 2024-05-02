package app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomerSecurity implements UserDetailsService {

    @Autowired
    private CustomerRepository customers;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        var entry = customers.(username);
        if(entry)
            throw new UsernameNotFoundException(username);
        var Customer = entry;
    }
    
}
