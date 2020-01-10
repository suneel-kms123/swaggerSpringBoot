package com.uk.sprint.Rest.Impl;

import com.uk.sprint.Rest.model.ModelDataStream;
import com.uk.sprint.Rest.model.schoolModel.Department;
import com.uk.sprint.Rest.model.schoolModel.School;
import com.uk.sprint.Rest.model.schoolModel.Staff;
import com.uk.sprint.Rest.model.schoolModel.Student;

import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamFilterImpl {

    public void getFilterStreamDataResult(List<ModelDataStream> dataStream){

        ModelDataStream name = dataStream.stream().filter(data -> {
           return data.getName().equals("raghavendra");
        }).findFirst().get();
    }


    public School lombokBuiltStudent(List<Department> departmentList,
                                   List<Staff> staffList, List<Student> studentList){
        return School.builder().departments(departmentList)
                .schoolStaff(staffList).studentsList(studentList).build();
    }

}
