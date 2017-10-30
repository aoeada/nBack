package main.java.Repository.Interfaces;

import main.java.Classes.ConditionType;

public interface IConditionTypeRepository {
    ConditionType getConditionTypeById(int conditionTypeId);
    void createConditionType(ConditionType conditionType);
}
