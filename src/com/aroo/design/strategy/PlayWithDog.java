package com.aroo.design.strategy;

public abstract class PlayWithDog implements Play{

    private String name;
    private IRunStrategy runStrategy;
    private IPlayStrategy playStrategy;

    public PlayWithDog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void play(){
        playStrategy.play();
    }

    public void run(){
        runStrategy.run();
    }

    public void setRunStrategy(IRunStrategy runStrategy) {
        this.runStrategy = runStrategy;
    }

    public void setPlayStrategy(IPlayStrategy playStrategy) {
        this.playStrategy = playStrategy;
    }
}
