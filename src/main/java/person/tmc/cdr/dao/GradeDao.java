package person.tmc.cdr.dao;

import person.tmc.cdr.entity.Grade;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author tmc
 * @since 2020-07-31
 */

public interface GradeDao extends BaseMapper<Grade> {

//    @Select("select id,schoolname,subranking,subpercent,entity,code from grade" +
//            "            where schoolname = #{schoolname}" +
//            "                order by field(subranking,'A+','A','A-','B+','B','B-','C+','C','C-')")
    List<Grade> selectBySname(String schoolname);
}
