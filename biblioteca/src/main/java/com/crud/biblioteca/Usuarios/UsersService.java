package com.crud.biblioteca.Usuarios;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;

public class UsersService implements UserDetailsService {

    private final UsersRepository usersRepository;
    private final UsersService usersService;
    private final PasswordEncoder passwordEncoder;

    public UsersService(UsersService usersService, UsersRepository usersRepository,PasswordEncoder passwordEncoder){
        this.usersRepository = usersRepository;
        this.usersService = usersService;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        return usersRepository.findByName(username).orElseThrow(()-> new UsernameNotFoundException("Usuário não encontrado"));
    }

    public Long salveUsers(String name, String password){
        String newPassword = passwordEncoder.encode(password);
        Users user = usersRepository.save(new Users(name,newPassword));
        return user.getId();
    }
}
