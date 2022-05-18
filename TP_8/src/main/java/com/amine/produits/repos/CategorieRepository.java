package com.amine.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.amine.produits.entities.Categorie;


@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Long>{

}