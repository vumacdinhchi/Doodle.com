package entity;
// Generated Mar 30, 2016 12:27:45 AM by Hibernate Tools 4.3.1



/**
 * Vote generated by hbm2java
 */
public class Vote  implements java.io.Serializable {


     private Integer voteid;
     private Participant participant;
     private Time time;

    public Vote() {
    }

    public Vote(Participant participant, Time time) {
       this.participant = participant;
       this.time = time;
    }
   
    public Integer getVoteid() {
        return this.voteid;
    }
    
    public void setVoteid(Integer voteid) {
        this.voteid = voteid;
    }
    public Participant getParticipant() {
        return this.participant;
    }
    
    public void setParticipant(Participant participant) {
        this.participant = participant;
    }
    public Time getTime() {
        return this.time;
    }
    
    public void setTime(Time time) {
        this.time = time;
    }




}


