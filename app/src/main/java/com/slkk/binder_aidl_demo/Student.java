package com.slkk.binder_aidl_demo;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by slkk on 2017/10/25.
 */

public class Student implements Parcelable {
    private String name;
    private int age;

    protected Student(Parcel in) {
        name = in.readString();
        age = in.readInt();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //反序列化使用
    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(age);
    }
}
