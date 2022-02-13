package uz.pdp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import uz.pdp.entity.User;

@RepositoryRestResource(path = "user")
public interface UserReposirory extends JpaRepository<User, Integer> {

	boolean existsByFristNameAndLastNameOrPhonNumber(String fristName, String lastName, String phonNumber);
}
