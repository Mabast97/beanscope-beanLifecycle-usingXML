package com.luv2code.TestAgainMaven;

public class TrackCoach implements Coach{

    private HappyFortuneService fortuneService;

    public TrackCoach (HappyFortuneService fortune)
    {
        fortuneService = fortune;
        System.out.println("TrackCoach Constructor Created.");
    }

    @Override
    public String getDailyWorkout() {
        return "Hello From TrackCoach !!! ";
    }

    @Override
    public String getDailyFortune() {
        System.out.println("inside TracCoach getDailyFortune method by using HappyFortuneService : ");
        return fortuneService.getFortune();
    }

    public void doingStartup()
    {
        System.out.println("inside (doingStartup) method");
    }

    public void doingCleanUP()
    {
        System.out.println("inside (doingCleanUP) method");
    }





}
