package person.tmc.cdr.service;

import person.tmc.cdr.entity.Grade;
import com.baomidou.mybatisplus.extension.service.IService;
import person.tmc.cdr.entity.GradeResult;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author tmc
 * @since 2020-07-31
 */
public interface GradeService extends IService<Grade> {


    List<GradeResult> getAll();

    List<GradeResult> getBySchoolName(String name);

    List<GradeResult> getByCode(String code);

    List<GradeResult> getByEntity(String entity);
}
