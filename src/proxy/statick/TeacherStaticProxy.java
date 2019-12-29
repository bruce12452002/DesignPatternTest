package proxy.statick;

import proxy.Teacher;

public class TeacherStaticProxy implements Teacher {
    private Teacher teacher;

    public TeacherStaticProxy(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public void teach() {
        System.out.println("代理教課開始");
        teacher.teach();
        System.out.println("代理教課結束");
    }
}
