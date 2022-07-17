package com.percobaanpertama.firstry.controller;


import com.percobaanpertama.firstry.model.dto.DefaultResponse;
import com.percobaanpertama.firstry.model.dto.LoginDto;
import com.percobaanpertama.firstry.model.entity.Mahasiswa;
import com.percobaanpertama.firstry.repository.MahasiswaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/mahasiswa")
public class MahasiswaController {

  @Autowired
  private MahasiswaRepository mahasiswaRepository;

  @PostMapping("/login")
  public DefaultResponse login(@RequestBody LoginDto loginDto) {

    Optional<Mahasiswa> optionalMahasiswa = mahasiswaRepository.findByUnameAndPassword(loginDto.getUname(), loginDto.getPassword());


    DefaultResponse df = new DefaultResponse();
    if(optionalMahasiswa.isPresent()){
      df.setStatus(Boolean.TRUE);
      df.setMessage("Data Ditemukan");
    } else {
      df.setStatus(Boolean.FALSE);
      df.setMessage("Data Tidak Ditemukan");
    }
    return df;
  }

  @GetMapping("/id/{nim}")
  public DefaultResponse getByIdMahasiswa(@PathVariable String nim) {
    DefaultResponse df = new DefaultResponse();
    Optional<Mahasiswa> mhsOptional = mahasiswaRepository.findById(nim);
    if(mhsOptional.isPresent()){
      df.setStatus(Boolean.TRUE);
      df.setMessage("Data Ditemukan");
    } else {
      df.setStatus(Boolean.FALSE);
      df.setMessage("Data Tidak Ditemukan");
    }
    return df;
  }


}
