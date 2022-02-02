package com.luv2code.TestAgainMaven;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;
    private String emailAddress;
    private String team;

    public CricketCoach()
    {
        System.out.println("Inside CricketCoach's No-Argument Constructor!");
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("Inside CricketCoach's setEmailAddress!");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("Inside CricketCoach's setTeam!");
        this.team = team;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Inside CricketCoach's setFortuneService!");
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "getDailyWorkout in CricketCoach Calss !!";
    }

    public String getDailyFortune() {
        System.out.println("inside getDailyFortune : ");
        return fortuneService.getFortune();
    }
}
