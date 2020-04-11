package com.codewithme;

public class Time {
    private  long startTime;
    private  long endTime;
//    public Time(long startTime,long endTime){
//        this.startTime=startTime;
//        this.endTime=endTime;
//    }

    public long getStartTime() {
        return this.startTime;
    }

    public long getEndTime() {
        return this.endTime;
    }
    public void start(){
        this.startTime=System.currentTimeMillis();

    }
    public void end(){
        this.endTime=System.currentTimeMillis();
    }
    public double getElapsedTime(){
        return  this.endTime-this.startTime;
    }

}
