package com.dep.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "EmpServer", url = "localhost:8080/emp")
public interface DepartmentService {

    @GetMapping("/{id}")
    public Object getEmpById(@PathVariable("id") Long id);
}
