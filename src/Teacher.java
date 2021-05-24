/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2ndyrGroupB
 */
public class Teacher {
     private int id,teacher_id;
    private String teacherName,courseGroupAssign;

    public Teacher() {
    }

    public Teacher(int teacher_id, String teacherName, String courseGroupAssign) {
        this.teacher_id = teacher_id;
        this.teacherName = teacherName;
        this.courseGroupAssign = courseGroupAssign;
    }

    public Teacher(int id,int teacher_id, String teacherName, String courseGroupAssign) {
        this.id = id;
        this.teacher_id = teacher_id;
        this.teacherName = teacherName;
        this.courseGroupAssign = courseGroupAssign;
    }

    public int getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getCourseGroupAssign() {
        return courseGroupAssign;
    }

    public void setCourseGroupAssign(String courseGroupAssign) {
        this.courseGroupAssign = courseGroupAssign;
    }
    
}
