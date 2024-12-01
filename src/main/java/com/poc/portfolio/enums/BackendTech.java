package com.poc.portfolio.enums;

import lombok.Getter;

@Getter
public enum BackendTech {
  JAVA("JAVA", ExperienceLevel.INTERMEDIATE.name()), SPRING_BOOT("Spring Boot",
      ExperienceLevel.INTERMEDIATE.name()), SPRING(
          "Spring",
          ExperienceLevel.INTERMEDIATE.name());

  private final String technology;
  private final String experienceLevel;

  BackendTech(String technology, String experienceLevel) {
    this.technology = technology;
    this.experienceLevel = experienceLevel;
  }

}
