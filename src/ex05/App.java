package ex05;

import ex05.teacher.*;

public class App {
    public static void main(String[] args) {
        Teacher jt = new JavaTeacher();
        jt.수업시작();

        Teacher pt = new PythonTeacher();
        pt.수업시작();

        Teacher ht = new HTMLTeacher();
        ht.수업시작();

        Teacher st = new SpringTeacher();
        st.수업시작();
    }
}
