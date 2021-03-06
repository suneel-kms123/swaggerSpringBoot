package com.uk.sprint.rest.impl;

import com.uk.sprint.rest.model.ModelDataStream;
import com.uk.sprint.rest.model.schoolmodel.Department;
import com.uk.sprint.rest.model.schoolmodel.School;
import com.uk.sprint.rest.model.schoolmodel.Staff;
import com.uk.sprint.rest.model.schoolmodel.Student;

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
