package com.PagingAndSorting.PagingAndSorting.repository;

import com.PagingAndSorting.PagingAndSorting.entity.Student;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends PagingAndSortingRepository<Student,Integer> {
}
