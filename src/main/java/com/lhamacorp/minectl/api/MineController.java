package com.lhamacorp.minectl.api;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MineController {

  @PostMapping
  public ResponseEntity<Void> restart() throws IOException {
    String[] cmd = {"sh", "restart.sh", "/"};
    Runtime.getRuntime().exec(cmd);
    return ResponseEntity.status(HttpStatus.ACCEPTED).build();
  }

}
