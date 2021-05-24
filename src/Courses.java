/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2ndyrGroupB
 */
public class Courses {
    private int courseID;
    
     private int groupID;
    private String courseName;
     private String courseGroup;

    public Courses() {
    }

    public Courses(int courseID, String courseName) {
        this.courseID = courseID;
        this.courseName = courseName;
    }
    
    public Courses(int courseID, String courseName,int groupID, String courseGroup)
    {
        this.courseID = courseID;
       this.courseName = courseName;
         this.groupID = groupID;
      this.courseGroup = courseGroup;
     
    }
    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public int getCourseID() {
        return courseID;
    }
    public void setCourseGroup(String courseGroup) {
        this.courseGroup = courseGroup;
    }

    public String getCourseGroup() {
        return courseGroup;
    }
    public int getGroupID() {
        return groupID;
    }
    

   
     public String getCourseName() {
        return courseName;
    }

    public void setId(int groupID) {
        this.groupID = groupID;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

}
