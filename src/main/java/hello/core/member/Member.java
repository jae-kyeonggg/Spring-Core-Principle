package hello.core.member;

public class Member {
    private Long id;
    private String name;
    private Member grade;

    Member(Long id, String name, Member grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Member getGrade() {
        return grade;
    }

    public void setGrade(Member grade) {
        this.grade = grade;
    }
}
