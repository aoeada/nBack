package main.java.Repository.Interfaces;

import java.util.List;
import main.java.Classes.RecordAccess;

public interface IRecordAccessRepository {
    void createRecordAccess(RecordAccess recordAccess);
    void deleteRecordAccess(RecordAccess recordAccess);
    List recordsUserCanAccess(int userId);
}
