package com.poc.portfolio.enums;

import lombok.Getter;

@Getter
public enum Titles {
  JAVA_DEVELOPMENT("Java DeveloperS"), SOFTWARE_DEVELOPER("Software Developer");

  private final String value;

  Titles(String value) {
    this.value = value;
  }

}
