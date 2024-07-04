public class HealthRecord {
   private String ptName;
   private int ptId;
   public HealthRecord(String ptName,int ptId){
    this.ptName=ptName;
    this.ptId=ptId;
   
   }
   public String getPtName(){
      return this.ptName;
   }
   public int getPtId(){
    return this.ptId;
   }
}
