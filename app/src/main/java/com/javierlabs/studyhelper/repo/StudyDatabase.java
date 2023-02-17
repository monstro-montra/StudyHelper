package com.javierlabs.studyhelper.repo;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.javierlabs.studyhelper.model.Question;
import com.javierlabs.studyhelper.model.Subject;

@Database(entities = {Question.class, Subject.class}, version = 1)
public abstract class StudyDatabase extends RoomDatabase {

    public abstract QuestionDao questionDao();
    public abstract SubjectDao subjectDao();
}