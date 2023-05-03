package com.restexcel.restexcel.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restexcel.restexcel.entity.Client;

public interface ClientRepo extends JpaRepository<Client, Integer> {

}
