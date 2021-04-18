package br.com.muller.java.kubernetes.persistence;

import org.springframework.data.repository.CrudRepository;

import br.com.muller.java.kubernetes.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

}

