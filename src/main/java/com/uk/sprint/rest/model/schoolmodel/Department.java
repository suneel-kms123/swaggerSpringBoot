package com.uk.sprint.rest.model.schoolmodel;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class Department {

    private List<Student> students;

    private List<Faculty> faculties;


}
