package ex07.teacher;

public class MathTeacher implements Teacher {
    public void doLecture() {
        System.out.println("수학 강의를 시작합니다.");
    }

    @Override
    public boolean isSameLecture(LectureType lectureType) {
        return LectureType.MATH.equals(lectureType);
    }
}
