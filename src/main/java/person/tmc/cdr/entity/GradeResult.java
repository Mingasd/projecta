package person.tmc.cdr.entity;

public class GradeResult {
    private String  entity;
    private String schoolName;
    private String code;
    private String name;
    private String rank;
    private String percent;

    public GradeResult() {
    }

    public GradeResult(String entity, String schoolName, String code, String name, String rank, String percent) {
        this.entity = entity;
        this.schoolName = schoolName;
        this.code = code;
        this.name = name;
        this.rank = rank;
        this.percent = percent;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
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

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getPercent() {
        return percent;
    }

    public void setPercent(String percent) {
        this.percent = percent;
    }
}
