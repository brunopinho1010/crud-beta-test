package services;



public class ApplyService extends PersonService{
    
    private CRUDservice cruDservice;

    public ApplyService(CRUDservice cruDservice){
        this.cruDservice = cruDservice;
    }

 public CRUDservice getCruDservice() {
     return cruDservice;
 }

 
    
}
