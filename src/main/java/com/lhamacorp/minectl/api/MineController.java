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

  private static String scriptsDir = "/";
  private static String commandType = "sh";

  @PostMapping("/restart")
  public ResponseEntity<Void> restart() throws IOException {
    String[] cmd = {commandType, "restart.sh", scriptsDir};
    Runtime.getRuntime().exec(cmd);
    return ResponseEntity.status(HttpStatus.ACCEPTED).build();
  }

  @PostMapping("/backup")
  public ResponseEntity<Void> backup() throws IOException {
    String[] cmd = {commandType, "backup.sh", scriptsDir};
    Runtime.getRuntime().exec(cmd);
    return ResponseEntity.status(HttpStatus.ACCEPTED).build();
  }

}
