package entity;
// Generated Mar 30, 2016 12:27:45 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * User generated by hbm2java
 */
public class User  implements java.io.Serializable {


     private Integer userid;
     private String username;
     private String email;
     private String password;
     private String gender;
     private String country;
     private String avatar;
     private Date createdate;
     private Set polls = new HashSet(0);

    public User() {
    }

    public User(String username, String email, String password, String gender, String country, String avatar, Date createdate, Set polls) {
       this.username = username;
       this.email = email;
       this.password = password;
       this.gender = gender;
       this.country = country;
       this.avatar = avatar;
       this.createdate = createdate;
       this.polls = polls;
    }
   
    public Integer getUserid() {
        return this.userid;
    }
    
    public void setUserid(Integer userid) {
        this.userid = userid;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getCountry() {
        return this.country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    public String getAvatar() {
        return this.avatar;
    }
    
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
    public Date getCreatedate() {
        return this.createdate;
    }
    
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
    public Set getPolls() {
        return this.polls;
    }
    
    public void setPolls(Set polls) {
        this.polls = polls;
    }




}


