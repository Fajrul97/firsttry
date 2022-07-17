package com.percobaanpertama.firstry.repository;

import com.percobaanpertama.firstry.model.entity.Mahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MahasiswaRepository extends JpaRepository<Mahasiswa, String> {
  Optional<Mahasiswa> findByUnameAndPassword(String uname, String password);

}
