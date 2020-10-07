package person.tmc.cdr.entity;

import java.util.List;

public class SubjectResult {
    String label;
    List<Subject> subjectList;

    public SubjectResult() {
    }

    public SubjectResult(String label, List<Subject> subjectList) {
        this.label = label;
        this.subjectList = subjectList;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<Subject> subjectList) {
        this.subjectList = subjectList;
    }
}
