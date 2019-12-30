package com.weimin.auditiondemo.entity;

import java.util.Date;

public class Student {
    private Long id;

    private String studentId;

    private String name;

    private String sex;

    private String college;

    private String major;

    private Long classesId;

    private String classes;

    private Byte grader;

    private String phone;

    private String email;

    private Date birthday;

    private String cardId;

    private String images;

    /**
     * -1代表退学，0代表休学，1代表在读，2代表毕业
     */
    private Byte status;

    private Date admissionTime;

    private Date graduationTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Long getClassesId() {
        return classesId;
    }

    public void setClassesId(Long classesId) {
        this.classesId = classesId;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public Byte getGrader() {
        return grader;
    }

    public void setGrader(Byte grader) {
        this.grader = grader;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getAdmissionTime() {
        return admissionTime;
    }

    public void setAdmissionTime(Date admissionTime) {
        this.admissionTime = admissionTime;
    }

    public Date getGraduationTime() {
        return graduationTime;
    }

    public void setGraduationTime(Date graduationTime) {
        this.graduationTime = graduationTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", studentId=").append(studentId);
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", college=").append(college);
        sb.append(", major=").append(major);
        sb.append(", classesId=").append(classesId);
        sb.append(", classes=").append(classes);
        sb.append(", grader=").append(grader);
        sb.append(", phone=").append(phone);
        sb.append(", email=").append(email);
        sb.append(", birthday=").append(birthday);
        sb.append(", cardId=").append(cardId);
        sb.append(", images=").append(images);
        sb.append(", status=").append(status);
        sb.append(", admissionTime=").append(admissionTime);
        sb.append(", graduationTime=").append(graduationTime);
        sb.append("]");
        return sb.toString();
    }
}