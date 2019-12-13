package com.uk.sprint.Rest.model.schoolModel;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.messaging.support.MessageBuilder;

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
