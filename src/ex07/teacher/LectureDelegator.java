package ex07.teacher;

import java.util.ArrayList;
import java.util.List;

public class LectureDelegator {
    private List<Teacher> teachers = new ArrayList<>();

    public LectureDelegator() {
        teachers.add(new HistoryTeacher());
        teachers.add(new MathTeacher());
    }

    // 책임: 위임 = 맞는 전문가 찾아줌 -> for문 돌려서 type으로 찾으면 된다.
    // 단일 진입점
    public void delegate(LectureType lectureType) {
        // 공통 코드 작성 가능
        
        teachers.stream()
                .filter(teacher -> teacher.isSameLecture(lectureType))
                .forEach(teacher -> teacher.doLecture());
    }

//    public void delegate2(LectureType lectureType) {
//        for (Teacher teacher : teachers) {
//            if (teacher.isSameLecture(lectureType)) {
//                teacher.doLecture();
//            }
//        }
//    }
}
