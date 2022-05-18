package com.amine.produits.repos;
import org.springframework.data.jpa.repository.JpaRepository;
import com.amine.produits.entities.User;
public interface UserRepository extends JpaRepository<User, Long> {
User findByUsername (String username);
}