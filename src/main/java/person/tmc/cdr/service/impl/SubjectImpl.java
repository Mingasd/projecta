package person.tmc.cdr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import person.tmc.cdr.entity.Subject;
import person.tmc.cdr.dao.SubjectDao;
import person.tmc.cdr.service.SubjectService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author tmc
 * @since 2020-07-31
 */
@Service
public class SubjectImpl extends ServiceImpl<SubjectDao, Subject> implements SubjectService {
    @Autowired
    SubjectDao subjectDao;


    @Override
    public List<Subject> findAll() {
        return subjectDao.selectList(null);
    }
}
