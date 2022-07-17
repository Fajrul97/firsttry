package com.percobaanpertama.firstry.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_mahasiswa")
public class Mahasiswa {
  @Id
  @Column(name = "nim",length = 9)
  private String nim;
  @Column(name = "nama_mahasiswa")
  private String nama;
  @Column(name = "username")
  private String uname;
  @Column
  private String password;

  public String getNim() {
    return nim;
  }

  public void setNim(String nim) {
    this.nim = nim;
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public String getUname() {
    return uname;
  }

  public void setUname(String uname) {
    this.uname = uname;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
