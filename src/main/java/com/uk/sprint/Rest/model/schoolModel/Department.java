package com.uk.sprint.Rest.model.schoolModel;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class Department {

    private List<Student> students;

    private List<Faculty> faculties;


}
