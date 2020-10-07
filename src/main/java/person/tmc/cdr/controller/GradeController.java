package person.tmc.cdr.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import person.tmc.cdr.entity.GradeResult;
import person.tmc.cdr.service.GradeService;

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
public class GradeController {
    @Autowired
    private GradeService gradeService;

    @GetMapping("grade")
    public List<GradeResult> getAll(){
        return gradeService.getAll();
    }

    @PostMapping("grade_sn")
    public List<GradeResult> getBySchoolName(String name){
        return gradeService.getBySchoolName(name);
    }

    @GetMapping("grade_c")
    public List<GradeResult> getByCode(String code){
        return gradeService.getByCode(code);
    }

    @GetMapping("grade_e")
    public List<GradeResult> getByEntity(String entity){
        return gradeService.getByEntity(entity);
    }
}

