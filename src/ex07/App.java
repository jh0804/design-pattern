package ex07;

import ex07.teacher.LectureDelegator;
import ex07.teacher.LectureType;

// 델리게이트 (위임)
public class App {
    public static void main(String[] args) {
//        MathTeacher mathTeacher = new MathTeacher();
//        mathTeacher.doLecture();
//
//        HistoryTeacher historyTeacher = new HistoryTeacher();
//        historyTeacher.doLecture();

        // 단일 진입점을 바라본다.
        LectureDelegator lectureDelegator = new LectureDelegator();

        // 타입으로 찾아서 위임

        // 1. 수학
        lectureDelegator.delegate(LectureType.MATH);

        // 2. 역사
        lectureDelegator.delegate(LectureType.HISTORY);
    }
}
