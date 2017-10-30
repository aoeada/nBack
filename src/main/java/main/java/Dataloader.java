package main.java;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
//Classes
import main.java.Classes.ConditionType;
import main.java.Classes.MedicalRecord;
import main.java.Classes.User;
import main.java.Classes.MedicalRecordTypes.Diagnosis;
import main.java.Classes.MedicalRecordTypes.Immunization;
import main.java.Classes.MedicalRecordTypes.MedicalTest;
import main.java.Classes.MedicalRecordTypes.Medication;
import main.java.Classes.MedicalRecordTypes.SocialHistory;
import main.java.Classes.MedicalRecordTypes.Surgery;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
//Repos
import main.java.Repository.Interfaces.IUserRepository;
import main.java.Repository.Interfaces.IConditionTypeRepository;
import main.java.Repository.Interfaces.IMedicalRecordRepository;
import main.java.Repository.Interfaces.IDiagnosisRepository;
import main.java.Repository.Interfaces.IImmunizationRepository;
import main.java.Repository.Interfaces.IMedicalTestRepository;
import main.java.Repository.Interfaces.IMedicationRepository;
import main.java.Repository.Interfaces.ISocialHistoryRepository;
import main.java.Repository.Interfaces.ISurgeryRepository;

import main.java.Services.Interfaces.IMedicalRecordService;

@Component
public class Dataloader implements ApplicationRunner {
        
    private IUserRepository userRepository;
    private IConditionTypeRepository conditionTypeRepository;
    private IMedicalRecordRepository medicalRecordRepository;
    private IDiagnosisRepository diagnosisRepository;
    private IImmunizationRepository immunizationRepository;
    private IMedicalTestRepository medicalTestRepository;
    private IMedicationRepository medicationRepository;
    private ISocialHistoryRepository socialHistoryRepository;
    private ISurgeryRepository surgeryRepository;
    
    private IMedicalRecordService medicalRecordService;
    //add medical records of various classes
       
    @Autowired
    public Dataloader(
            IUserRepository userRepository, IConditionTypeRepository condtionTypeRepository, IMedicalRecordRepository medicalRecordRepository,
            IDiagnosisRepository diagnosisRepository, IImmunizationRepository immunizationRepository, IMedicalTestRepository medicalTestRepository,
            IMedicationRepository medicationRepository, ISocialHistoryRepository socialHistoryRepository, ISurgeryRepository surgeryRepository,
            IMedicalRecordService medicalRecordService) {
        this.userRepository = userRepository;
        this.conditionTypeRepository = condtionTypeRepository;
        this.medicalRecordRepository = medicalRecordRepository;
        this.diagnosisRepository = diagnosisRepository;
        this.immunizationRepository = immunizationRepository;
        this.medicalTestRepository = medicalTestRepository;
        this.medicationRepository = medicationRepository;
        this.socialHistoryRepository = socialHistoryRepository;
        this.surgeryRepository = surgeryRepository;
        this.medicalRecordService = medicalRecordService;
                
        //add the reposiory of the requred category here (so you can access the create method)
    }

    public void run(ApplicationArguments args) {
        //when more users are added maybe make a list of them and then loop the create function on the List objects
        userRepository.createUser(new User("SuperAdmin", "Narwhal123", "Sean", "Brogan", new Date(), 123456789, true, null,  2));
	userRepository.createUser(new User("Jesse", "Narwhal123", "Jesse", "Stell", new Date(), 123456781, true, null,  2));
	userRepository.createUser(new User("Matthew", "Narwhal123", "Matthew", "Current", new Date(), 123456782, true, null,  2));
	userRepository.createUser(new User("Amanda", "Narwhal123", "Amanda", "Diaz", new Date(), 123456783, true, null,  2));
	userRepository.createUser(new User("Robert", "Narwhal123", "Robert", "Ellis", new Date(), 123456784, true, null,  2));
	userRepository.createUser(new User("Thalo", "Narwhal123", "Thalo", "Menninga", new Date(), 123456785, true, null,  2));

	List<User> users = new ArrayList<User>();
	users.add(new User("Man", "Narwhal123", "Tom", "Futzington", new Date(), 223456789, true, null, 1));
	users.add(new User("Guy", "Narwhal123", "Margo", "Cleopatra", new Date(), 323456789, true, null, 1));
	users.add(new User("Buddy", "Narwhal123", "Drat", "Danlloyd", new Date(), 423456789, true, null, 1));
	users.add(new User("Dude", "Narwhal123", "Jomey", "Kilpatrick", new Date(), 523456789, true, null, 1));
	users.add(new User("Simpleton", "Narwhal123", "Barnsworth", "Carmichelle", new Date(), 623456789, true, null, 1));
	users.add(new User("Person", "Narwhal123", "Gary", "Sormpson", new Date(), 723456789, true, null, 1));
	users.add(new User("Sonny", "Narwhal123", "Benson", "Deadbeat", new Date(), 823456789, true, new Date(), 1));
	users.add(new User("Username", "Narwhal123", "Lambsworth", "Gertrude", new Date(), 923456789, true, new Date(),  1));
	users.add(new User("Calm", "Narwhal123", "Kelly", "McAnnley", new Date(), 113456789, true, null,  1));
	users.add(new User("Stats", "Narwhal123", "Robert", "Leesom", new Date(), 133456789, true, null,  1));
	users.add(new User("Effort", "Narwhal123", "Jude", "Binshamp", new Date(), 143456789, true, null,  1));
	users.add(new User("Fork", "Narwhal123", "Drew", "Ainsworth", new Date(), 153456789, true, null,  1));
	users.add(new User("Cold", "Narwhal123", "Farms", "Berrymore", new Date(), 163456789, true, new Date(), 1));
	users.add(new User("Touch", "Narwhal123", "Mullen", "Inklewood", new Date(), 173456789, true, null, 1));
	users.add(new User("Some", "Narwhal123", "Nam", "Cort", new Date(), 183456789, true, null, 1));
	users.add(new User("Lazy", "Narwhal123", "Hint", "Chilberry", new Date(), 193456789, true, new Date(), 1));
	users.add(new User("July", "Narwhal123", "Soren", "McAstley", new Date(), 121456789, true, null, 1));
	users.add(new User("Art", "Narwhal123", "Minty", "Sickleston", new Date(), 122456789, true, null, 1));
	users.add(new User("Mack", "Narwhal123", "Ella", "Cinders", new Date(), 124456789, true, null, 1));
	users.add(new User("Flash", "Narwhal123", "Troom", "Stinton", new Date(), 125456789, true, null, 1));
	users.add(new User("Morrow", "Narwhal123", "Harold", "Gourndon", new Date(), 126456789, true, new Date(), 1));
	users.add(new User("Mar", "Narwhal123", "Sealow", "Grean", new Date(), 127456789, true, null, 1));
	users.add(new User("Grade", "Narwhal123", "Benward", "Kalting", new Date(), 128456789, true, null, 1));
	users.add(new User("Play", "Narwhal123", "Scio", "Chompton", new Date(), 129456789, true, new Date(), 1));

	users.add(new User("Green", "Narwhal123", "Kerry", "Kerrington", new Date(), 123156789, true, null, 1));
	users.add(new User("Red", "Narwhal123", "Marc", "Guasch", new Date(), 123256789, true, null, 1));
	users.add(new User("Thing", "Narwhal123", "Eddy", "Zulu", new Date(), 123356789, true, null, 1));
	users.add(new User("Pray", "Narwhal123", "Samuel", "Chortles", new Date(), 123556789, true, null, 1));
	users.add(new User("Splinter", "Narwhal123", "Graynard", "Woodsworth", new Date(), 123656789, true, null, 1));
	users.add(new User("Sorry", "Narwhal123", "Medley", "Woodsworth", new Date(), 123756789, true, new Date(), 1));
	users.add(new User("Scram", "Narwhal123", "Niner", "Woodsworth", new Date(), 123856789, true, null, 1));
	users.add(new User("Show", "Narwhal123", "Benji", "Woodsworth", new Date(), 123956789, true, new Date(), 1));

	for (int i = 0; i < users.size(); i++){
            userRepository.createUser(users.get(i));
        }
        
        //adding the different types of records
        conditionTypeRepository.createConditionType(new ConditionType("Diagnosis"));
        conditionTypeRepository.createConditionType(new ConditionType("Immunization"));
        conditionTypeRepository.createConditionType(new ConditionType("MedicalTest"));
        conditionTypeRepository.createConditionType(new ConditionType("Medication"));
        conditionTypeRepository.createConditionType(new ConditionType("SocialHistory"));
        conditionTypeRepository.createConditionType(new ConditionType("Surgery"));

        //adding medical records
        //should insert a generic record and then the specific one
        List<MedicalRecord> indexRecords = new ArrayList<MedicalRecord>();
        List<Diagnosis> diagnosisRecords = new ArrayList<Diagnosis>();        
        List<Immunization> immunizationRecords = new ArrayList<Immunization>();
        List<MedicalTest> medicalTestRecords = new ArrayList<MedicalTest>();
        List<Medication> medicationRecords = new ArrayList<Medication>();
        List<SocialHistory> socialHistoryRecords = new ArrayList<SocialHistory>();
        List<Surgery> surgeryRecords = new ArrayList<Surgery>();
        
        //                                   patientId   doctorId    conditionId    recordDate
        indexRecords.add(new MedicalRecord(     11,         1,            1,        new Date()));
        //                                   diagnosis   diagnosisDetails
        diagnosisRecords.add(new Diagnosis("Common Cold", "Random information here"));        
        indexRecords.add(new MedicalRecord(12, 1, 2, new Date()));
        //                                       immunization
        immunizationRecords.add(new Immunization("Common Cold"));
        indexRecords.add(new MedicalRecord(11, 1, 3, new Date()));
        //                                   testName       testResult
        medicalTestRecords.add(new MedicalTest("X-Ray", "We found a metal rod imbedded in his leg, stange we didn't just see it since it's just wedged in there"));
        indexRecords.add(new MedicalRecord(11, 1, 4, new Date()));
        //                                 medicationName     frequency       dosage  deliveryMethod      expirationDate  
        medicationRecords.add(new Medication("Allegra",       "Twice Daily",     2,      "by mouth",    new Date(8/17/2020)));
        indexRecords.add(new MedicalRecord(11, 1, 5, new Date()));
        //                                          smokes?     amountSmokes      drinks?    amountDrinks 
        socialHistoryRecords.add(new SocialHistory(  true,          2,             false,        0));
        indexRecords.add(new MedicalRecord(11, 1, 6, new Date()));
        //                            surgeryName                   surgeryResults
        surgeryRecords.add(new Surgery("Brain Transplant", "Patient is now in the new body"));

	indexRecords.add(new MedicalRecord(13, 1, 1, new Date()));
	diagnosisRecords.add(new Diagnosis("Type 2 Diabetes", "Patient's blood sugar runs low."));

	indexRecords.add(new MedicalRecord(14, 1, 1, new Date()));
	diagnosisRecords.add(new Diagnosis("Pancreatitis", "Patient experiences chronic pain in the mid abdomen."));

	indexRecords.add(new MedicalRecord(15, 1, 1, new Date()));
	diagnosisRecords.add(new Diagnosis("Irritable Bowel Syndrome", "Patient has chronic diarrhea brought on by eating corn."));

	indexRecords.add(new MedicalRecord(16, 1, 1, new Date()));
	diagnosisRecords.add(new Diagnosis("Eczema", "Patient has red, itchy, scaly rash on left upper arm."));

	indexRecords.add(new MedicalRecord(17, 4, 1, new Date()));
	diagnosisRecords.add(new Diagnosis("Asthma", "Patient came in with narrowed airways."));

        indexRecords.add(new MedicalRecord(22, 1, 3, new Date()));
        medicalTestRecords.add(new MedicalTest("C-protein Blood test", "Results are within the normal range."));

        indexRecords.add(new MedicalRecord(23, 1, 3, new Date()));
        medicalTestRecords.add(new MedicalTest("Liver salinity test", "Results are near the lower end of the normal range."));

        indexRecords.add(new MedicalRecord(24, 1, 3, new Date()));
        medicalTestRecords.add(new MedicalTest("HIV test", "Results are negative."));

        indexRecords.add(new MedicalRecord(25, 51, 3, new Date()));
        medicalTestRecords.add(new MedicalTest("HIV test", "Results are positive."));

        indexRecords.add(new MedicalRecord(26, 2, 3, new Date()));
        medicalTestRecords.add(new MedicalTest("Uric acid test", "Results are within the normal range."));

        indexRecords.add(new MedicalRecord(21, 1, 2, new Date()));

        immunizationRecords.add(new Immunization("Influenza"));
        indexRecords.add(new MedicalRecord(18, 1, 2, new Date()));

        immunizationRecords.add(new Immunization("Tetanus"));
        indexRecords.add(new MedicalRecord(19, 1, 2, new Date()));

        immunizationRecords.add(new Immunization("HPV"));
        indexRecords.add(new MedicalRecord(20, 2, 2, new Date()));

        immunizationRecords.add(new Immunization("Anthrax"));
        indexRecords.add(new MedicalRecord(21, 1, 2, new Date()));

        immunizationRecords.add(new Immunization("Influenza"));


        indexRecords.add(new MedicalRecord(25, 2, 4, new Date()));  
        medicationRecords.add(new Medication("LiveForeveral",   "Once Weekly",     4,      "IV",    new Date(8/17/2018)));

        indexRecords.add(new MedicalRecord(26, 3, 4, new Date()));  
        medicationRecords.add(new Medication("BugBeGone",  "Once Daily",     1,      "Orally",    new Date(3/17/2018)));

        indexRecords.add(new MedicalRecord(27, 1, 4, new Date()));  
        medicationRecords.add(new Medication("PainSucker",  "Biweekly",     2,      "IM",    new Date(4/17/2018)));

        indexRecords.add(new MedicalRecord(28, 1, 4, new Date()));  
        medicationRecords.add(new Medication("PurePower",  "Three times daily",     2,      "Orally",    new Date(12/17/2017)));

        indexRecords.add(new MedicalRecord(20, 4, 4, new Date()));  
        medicationRecords.add(new Medication("NoMoreCleverIdeas",  "Once daily",     1,      "Orally",    new Date(1/17/2018)));

        indexRecords.add(new MedicalRecord(27, 1, 5, new Date())); 
        socialHistoryRecords.add(new SocialHistory(  false,          0,             false,        0));

        indexRecords.add(new MedicalRecord(28, 2, 5, new Date()));
        socialHistoryRecords.add(new SocialHistory(  true,          1,             true,        3));

        indexRecords.add(new MedicalRecord(29, 1, 5, new Date())); 
        socialHistoryRecords.add(new SocialHistory(  false,          0,             true,        1));

        indexRecords.add(new MedicalRecord(30, 4, 5, new Date())); 
        socialHistoryRecords.add(new SocialHistory(  false,          0,             true,        2));
 
        //looping through all the lists we've made of data
        int currentDiagIndex = 0;
        int currentImmuIndex = 0;
        int currentMedTestIndex = 0;
        int currentMedicationIndex = 0;
        int currentSocialIndex = 0;
        int currentSurgeryIndex = 0;
        for (int i = 0; i < indexRecords.size(); i++){
            int id = medicalRecordService.createMedicalRecord(indexRecords.get(i));
            if(indexRecords.get(i).getRecordTypeId() == 1){
                diagnosisRecords.get(currentDiagIndex).setRecordId(id);
                diagnosisRepository.createDiagnosisRecord(diagnosisRecords.get(currentDiagIndex));
                currentDiagIndex++;
            }
            else if(indexRecords.get(i).getRecordTypeId() == 2){
                immunizationRecords.get(currentImmuIndex).setRecordId(id);
                immunizationRepository.createImmunizationRecord(immunizationRecords.get(currentImmuIndex));
                currentImmuIndex++;
            }
            else if(indexRecords.get(i).getRecordTypeId() == 3){
                medicalTestRecords.get(currentMedTestIndex).setRecordId(id);
                medicalTestRepository.createMedicalTestRecord(medicalTestRecords.get(currentMedTestIndex));
                currentMedTestIndex++;
            }
            else if(indexRecords.get(i).getRecordTypeId() == 4){
                medicationRecords.get(currentMedicationIndex).setRecordId(id);
                medicationRepository.createMedicationRecord(medicationRecords.get(currentMedicationIndex));
                currentMedicationIndex++;
            }
            else if(indexRecords.get(i).getRecordTypeId() == 5){
                socialHistoryRecords.get(currentSocialIndex).setRecordId(id);
                socialHistoryRepository.createSocialHistoryRecord(socialHistoryRecords.get(currentSocialIndex));
                currentSocialIndex++;
            }
            else if(indexRecords.get(i).getRecordTypeId() == 6){
                surgeryRecords.get(currentSurgeryIndex).setRecordId(id);
                surgeryRepository.createSurgeryRecord(surgeryRecords.get(currentSurgeryIndex));
                currentSurgeryIndex++;
            }
        }
    }
}
