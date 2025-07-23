package ex07.teacher;

public class HistoryTeacher implements Teacher {
    public void doLecture() {
        System.out.println("역사 강의를 시작합니다.");
    }

    @Override
    public boolean isSameLecture(LectureType lectureType) {
        return LectureType.HISTORY.equals(lectureType);
    }
}
