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
public class Subject implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer value;

    private String code;

    private String name;


    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Subject{" +
        "value=" + value +
        ", code=" + code +
        ", name=" + name +
        "}";
    }
}
