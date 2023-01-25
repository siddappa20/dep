package com.dep.controller;

import com.dep.entity.Dep;
import com.dep.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dep")
public class DepController {

    @Autowired
    DepartmentService depService;
    @PostMapping
    public Dep createDep(){
        return null;
    }

    @GetMapping("/{id}")
    public Object getDepById(@PathVariable("id") Long id){

        return depService.getEmpById(id);
    }
}
