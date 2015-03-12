package com.company;

/**
 * Created by vishnum on 3/11/2015.
 */
public class Probability {
    private static final int certanity = 0;
    private static final int imposability = 1;
    private  Double favorable;
    private  Double outComes;
//    private Double  = null;
    private static Double probability;

    private Probability(Double value){
        probability = value;
    }
//    Probability(Double favourable){
//
//        this.favorable = favourable;
//        this.outComes = outComes;
//    }

//or and negate ;
    public Probability nagate(){
        return  new Probability(imposability-probability);
    }

    public static Probability create(int favorable,int outComes){
        if(favorable > outComes || favorable < 0 || outComes <=0 ) return null;
        return new Probability((double) (favorable/outComes));
    }

//    public Probability and(Probability p1){
//        return this.calculateProbability() + p1.getValue()
//    }



}
