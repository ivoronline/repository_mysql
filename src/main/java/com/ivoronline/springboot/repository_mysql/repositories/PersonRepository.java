package com.ivoronline.springboot.repository_mysql.repositories;

import com.ivoronline.springboot.repository_mysql.entities.PersonEntity;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<PersonEntity, Integer> { }

