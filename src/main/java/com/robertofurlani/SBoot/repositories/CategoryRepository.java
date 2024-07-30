package com.robertofurlani.SBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.robertofurlani.SBoot.entities.Category;
import com.robertofurlani.SBoot.entities.User;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
