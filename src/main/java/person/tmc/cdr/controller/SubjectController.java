package person.tmc.cdr.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import person.tmc.cdr.entity.Subject;
import person.tmc.cdr.service.SubjectService;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author tmc
 * @since 2020-07-31
 */
@RestController
@RequestMapping("/cdn")
public class SubjectController {
    @Autowired
    SubjectService subjectService;

    @GetMapping("subject")
    public List<Subject> findAll(){
        return subjectService.findAll();
    }
}

