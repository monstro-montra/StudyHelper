package com.javierlabs.studyhelper.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.annotation.NonNull;

@Entity
public class Subject {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private long mId;

    @NonNull
    @ColumnInfo(name = "text")
    private String mText;

    @ColumnInfo(name = "updated")
    private long mUpdateTime;

    public Subject(@NonNull String text){ //constructor
        mText = text;
        mUpdateTime = System.currentTimeMillis();
    }

    //getters and setters
    public long getId(){
        return mId;
    }

    public void setId(long id){
        mId = id;
    }

    public String getText(){
        return mText;
    }

    public void setText(String subject) {
        mText = subject;
    }

    public long getUpdateTime() {
        return mUpdateTime;
    }

    public void setUpdateTime(long updateTime) {
        mUpdateTime = updateTime;
    }
}
