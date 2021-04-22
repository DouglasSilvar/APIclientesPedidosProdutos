package com.devsuperior.auladomain.repositories;

import com.devsuperior.auladomain.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRespository extends JpaRepository<Client, Long> {
}
