package com.javierlabs.studyhelper.viewmodel;

import android.app.Application;
import com.javierlabs.studyhelper.model.Question;
import com.javierlabs.studyhelper.repo.StudyRepository;
import java.util.List;

public class QuestionListViewModel {
    private StudyRepository studyRepo;

    public QuestionListViewModel(Application application) {
        studyRepo = StudyRepository.getInstance(application.getApplicationContext());
    }

    public List<Question> getQuestions(long subjectId) {
        return studyRepo.getQuestions(subjectId);
    }
}
