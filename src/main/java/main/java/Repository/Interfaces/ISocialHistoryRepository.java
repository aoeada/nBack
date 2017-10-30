package main.java.Repository.Interfaces;

import main.java.Classes.MedicalRecordTypes.SocialHistory;

public interface ISocialHistoryRepository {
    SocialHistory getSocialHistoryById(int recordId);
    void createSocialHistoryRecord(SocialHistory medicalRecord);
}
