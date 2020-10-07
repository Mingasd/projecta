package person.tmc.cdr.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import person.tmc.cdr.dao.SubjectDao;
import person.tmc.cdr.entity.Grade;
import person.tmc.cdr.dao.GradeDao;
import person.tmc.cdr.entity.GradeResult;
import person.tmc.cdr.entity.Subject;
import person.tmc.cdr.service.GradeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author tmc
 * @since 2020-07-31
 */
@Service
public class GradeImpl extends ServiceImpl<GradeDao, Grade> implements GradeService {
    @Autowired
    private GradeDao gradeDao;

    @Autowired
    private SubjectDao subjectDao;

    private Map<String ,String > map;

    private void initMap(){
        if (map!=null)
            return;
        map = new HashMap<>();
        List<Subject> subjectList = subjectDao.selectList(null);
//         for (Subject s:subjectList){
//             map.put(s.getCode(), s.getName());
//         }
        subjectList.forEach((s)=>{
            map.put(s.getCode(), s.getName());
        })
    }

    @Override
    public List<GradeResult> getAll() {
        initMap();
        List<Grade> grades = gradeDao.selectList(null);
        List<GradeResult> gradeResults = new ArrayList<>();
        for (Grade g:grades) {
            gradeResults.add(new GradeResult(g.getEntity(), g.getSchoolname(), g.getCode(),
                    map.get(g.getCode()), g.getSubranking(), g.getSubpercent()));
        }
        return gradeResults;
    }

    @Override
    public List<GradeResult> getBySchoolName(String name) {
        initMap();
        List<Grade> grades = gradeDao.selectBySname(name);
        List<GradeResult> gradeResults = new ArrayList<>();
        grades.forEach(g->{
            gradeResults.add(new GradeResult(g.getEntity(), g.getSchoolname(), g.getCode(),
                    map.get(g.getCode()), g.getSubranking(), g.getSubpercent()));
        });
        return gradeResults;
    }

    @Override
    public List<GradeResult> getByCode(String code) {
        initMap();
        Grade grade = new Grade();
        grade.setCode(code);
        List<Grade> grades =gradeDao.selectList(new QueryWrapper<>(grade));
        List<GradeResult> gradeResults = new ArrayList<>();
        grades.forEach(g->{
            gradeResults.add(new GradeResult(g.getEntity(), g.getSchoolname(), g.getCode(),
                    map.get(g.getCode()), g.getSubranking(), g.getSubpercent()));
        });
        return gradeResults;
    }

    @Override
    public List<GradeResult> getByEntity(String entity) {
        return null;
    }
}
