/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crimeproject;

import java.util.Comparator;

/**
 * Класс: Преступление (Квалификация преступления, Преступник, Место преступления, Дата преступления)
 * 
 */
public class Crime {
    private ElementOfCrime elementOfCrime;
    private Criminal criminal;
    private String place, date;
    
    public Crime(ElementOfCrime elementOfCrime, Criminal criminal, String place, String date){
        this.elementOfCrime = elementOfCrime;
        this.criminal = criminal;
        this.place = place;
        this.date = date;
    }
    
    public Crime(){}
    
    public String toString(){
        return ("criminal:\n " + criminal.toString() + "element of crime:\n" + elementOfCrime.toString() + "place: " + place + ";\n" + "date: " + date +";\n");
    }
    
    public ElementOfCrime getElementOfCrime(){
        return elementOfCrime;
    }
    
    public void setElementOfCrime(ElementOfCrime elementOfCrime){
        this.elementOfCrime = elementOfCrime;
    }
    
    public Criminal getCriminal(){
        return criminal;
    }
    
    public void setCriminal(Criminal criminal){
        this.criminal = criminal;
    }
    
    public String getPlace(){
        return place;
    }
    
    public void setPlace(String place){
        this.place = place;
    }
    
    public String getDate(){
        return date;
    }
    
    public void setDate(String date){
        this.date = date;
    }
    public static Comparator<Crime> GroupByName = new Comparator<Crime>() {
        @Override
        public int compare(Crime c1, Crime c2) {
            String Name1 = c1.criminal.getName().toUpperCase();
	   String Name2 = c2.criminal.getName().toUpperCase();
             //ascending order
	   return Name1.compareTo(Name2);

        }
    };
    
}
