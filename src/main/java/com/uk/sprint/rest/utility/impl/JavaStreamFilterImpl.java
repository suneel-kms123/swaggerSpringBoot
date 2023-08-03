package com.uk.sprint.rest.utility.impl;

import com.uk.sprint.rest.infrastructure.model.ModelDataStream;
import com.uk.sprint.rest.infrastructure.model.schoolmodel.Department;
import com.uk.sprint.rest.infrastructure.model.schoolmodel.School;
import com.uk.sprint.rest.infrastructure.model.schoolmodel.Staff;
import com.uk.sprint.rest.infrastructure.model.schoolmodel.Student;

import java.util.List;

public class JavaStreamFilterImpl {

    public void getFilterStreamDataResult(List<ModelDataStream> dataStream) {

        ModelDataStream name = dataStream.stream().filter(data -> {
            return data.getName().equals("raghavendra");
        }).findFirst().get();
    }


    public School lombokBuiltStudent(List<Department> departmentList,
                                     List<Staff> staffList, List<Student> studentList) {
        return School.builder().departments(departmentList)
                .schoolStaff(staffList).studentsList(studentList).build();
    }

}
