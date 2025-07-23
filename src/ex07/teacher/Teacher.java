package ex07.teacher;

public interface Teacher {
    void doLecture();

    boolean isSameLecture(LectureType lectureType); // 위임할때 누구할테 해야할지 결정하는 책임 
}
