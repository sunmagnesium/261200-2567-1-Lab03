public class Main {
    public static void main(String [] args){
        HealthRecord patient = new HealthRecord(ptName:"lolipop",ptId:1123);
        patient.getPtName();
        patient.getPtId();
        System.out.println(patient.getPtName());
        System.out.println(patient.getPtId());
    }

    
}
