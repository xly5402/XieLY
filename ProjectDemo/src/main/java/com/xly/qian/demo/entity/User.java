package com.xly.qian.demo.entity;

import java.util.Date;

public class User {
    //用户Id
    private Long id;
    //用户名
    private String name;
    //性别
    private Integer sex;
    //年龄
    private Integer age;
    //状态
    private Integer status;
    //delFlag删除标记（0：已删除，）
    private Integer delFlag;
    //创建时间
    private Date createdTime;
    //修改时间
    private Date modifyTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", status=" + status +
                ", status=" + delFlag +
                ", createdTime=" + createdTime +
                ", modifyTime=" + modifyTime +
                '}';
    }
}
