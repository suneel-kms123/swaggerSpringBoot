package com.uk.sprint.rest.infrastructure.model.schoolmodel;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Builder
@Setter
@Data
public class School {

    private List<Department> departments;

    private List<Student> studentsList;

    private List<Staff> schoolStaff;

}
