package person.tmc.cdr.service;

import person.tmc.cdr.entity.Subject;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author tmc
 * @since 2020-07-31
 */
public interface SubjectService extends IService<Subject> {
    List<Subject> findAll();
}
