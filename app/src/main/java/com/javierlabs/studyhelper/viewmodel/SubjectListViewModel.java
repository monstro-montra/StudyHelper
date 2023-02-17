package com.javierlabs.studyhelper.viewmodel;

import android.app.Application;
import com.javierlabs.studyhelper.model.Subject;
import com.javierlabs.studyhelper.repo.StudyRepository;
import java.util.List;

public class SubjectListViewModel {
    private StudyRepository studyRepo;

    public SubjectListViewModel(Application application) {
        studyRepo = StudyRepository.getInstance(application.getApplicationContext());
    }

    public List<Subject> getSubjects() {
        return studyRepo.getSubjects();
    }

    public void addSubject(Subject subject) {
        studyRepo.addSubject(subject);
    }
}
