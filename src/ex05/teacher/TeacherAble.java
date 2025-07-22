package ex05.teacher;

/*
 * 만든이 : 김주희
 * Teacher에서 구현해주세요.
 */

// TeacherAble : teacher가 할 수 있는거
// 어떤걸 노출시킬지 결정함
// 갑이 을한테 내리는 약속 (공평, 평등X) <-> protocol (서로 협의하는 약속)
public interface TeacherAble { // 이 친구만 노출시켜
    void 수업시작();
}
