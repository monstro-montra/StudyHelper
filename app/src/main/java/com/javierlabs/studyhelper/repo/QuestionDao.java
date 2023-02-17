package com.javierlabs.studyhelper.repo;

import androidx.room.*;
import com.javierlabs.studyhelper.model.Question;
import java.util.List;

@Dao
public interface QuestionDao {
    @Query("SELECT * FROM Question WHERE id = :id")
    Question getQuestion(long id);

    @Query("SELECT * FROM Question WHERE subject_id = :subjectId ORDER BY id")
    List<Question> getQuestions(long subjectId);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long addQuestion(Question question);

    @Update
    void updateQuestion(Question question);

    @Delete
    void deleteQuestion(Question question);
}
