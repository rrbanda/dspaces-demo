package org.example.demo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Todo {

    private Long id;
    private String title;
    private String description;
    private boolean completed;

}
