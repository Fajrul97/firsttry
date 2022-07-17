package com.percobaanpertama.firstry.controller;


import com.percobaanpertama.firstry.model.DefaultResponse;
import com.percobaanpertama.firstry.model.LoginDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mahasiswa")
public class MahasiswaController {

  @PostMapping("/login")
  public DefaultResponse login(@RequestBody LoginDto LoginDto) {

    DefaultResponse df = new DefaultResponse();
    df.setStatus(Boolean.TRUE);
    df.setMessage("Login Berhasil");
    return df;
  }


}
