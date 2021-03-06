package com.urunov.repository;

import com.urunov.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: apple
 * @created on 10/09/2020
 * @Project is Mapping-One2One
 */

@Repository
public interface StudentRepository  extends JpaRepository<Student, Integer> {

}
