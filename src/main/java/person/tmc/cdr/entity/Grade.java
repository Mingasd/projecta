package person.tmc.cdr.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author tmc
 * @since 2020-07-31
 */
public class Grade implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer id;

    private String schoolname;

    private String subranking;

    private String subpercent;

    private String entity;

    private String code;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public String getSubranking() {
        return subranking;
    }

    public void setSubranking(String subranking) {
        this.subranking = subranking;
    }

    public String getSubpercent() {
        return subpercent;
    }

    public void setSubpercent(String subpercent) {
        this.subpercent = subpercent;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Grade{" +
        "id=" + id +
        ", schoolname=" + schoolname +
        ", subranking=" + subranking +
        ", subpercent=" + subpercent +
        ", entity=" + entity +
        ", code=" + code +
        "}";
    }
}
