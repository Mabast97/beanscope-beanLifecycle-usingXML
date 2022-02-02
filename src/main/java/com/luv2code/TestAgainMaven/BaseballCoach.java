package com.luv2code.TestAgainMaven;

public class BaseballCoach implements Coach{

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService theFortuneService)
    {
        fortuneService = theFortuneService;
        System.out.println("BaseballCoach Constructor Created");
    }

    @Override
    public String getDailyWorkout() {
        return "Hello From BaseBall Coach !!!";
    }

    @Override
    public String getDailyFortune() {

        System.out.println("From getDailyFortune : ");
        // use my fortuneService to get a fortune
        return fortuneService.getFortune();
    }
}
