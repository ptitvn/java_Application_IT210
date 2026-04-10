package com.edupath.model;

import lombok.*;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    private String code;
    private String name;
    private String description;
    private String level;
    private double fee;
    private int duration;
    private int studentCount;
    private boolean isFull;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDate;
}

