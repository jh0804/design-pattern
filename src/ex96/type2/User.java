package ex96.type2;

public class User {
    private Integer id;
    private String username;
    private String password;
    private String role; // Teacher, Student

    // 학생
    private Integer score;
    private Integer level;

    // 선생
    private Integer sal;
    private String position;

    public static User createStudent() {
        return new User(null, "ssar", "1234", "STUDENT", 100, 1, null, null);
    }

    public static User createTeacher() {
        return new User(null, "ssar", "1234", "TEACHER", null, null, 3000, "MANAGER");
    }

    private User(Integer id, String username, String password, String role, Integer score, Integer level, Integer sal, String position) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
        this.score = score;
        this.level = level;
        this.sal = sal;
        this.position = position;
    }
}