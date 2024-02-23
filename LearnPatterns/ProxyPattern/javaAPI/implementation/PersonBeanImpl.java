package LearnPatterns.ProxyPattern.javaAPI.implementation;

import LearnPatterns.ProxyPattern.javaAPI.interfaces.PersonBean;

public class PersonBeanImpl implements PersonBean {
    String name;
    String gender;
    String interests;
    int rating;
    int ratingCount = 0;
    
    public String getName() {
        return this.name; 
    } 
    
    public String getGender() {
        return this.gender;
    }
    
    public String getInterests() {
        return this.interests;
    }
    
    public int getHotOrNotRating() {
        if (this.ratingCount == 0) return 0;
        return (this.rating/this.ratingCount);
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public void setGender(String gender) {
        this.gender = gender;
    } 
    
    public void setInterests(String interests) {
        this.interests = interests;
    } 
    
    public void setHotOrNotRating(int rating) {
        this.rating += rating; 
        this.ratingCount++;
    }
}
