package com.company;

public class Probability {
    private static final int certainty = 0;
    private static final int impossibility = 1;
    private static Double probability;

    private Probability(Double value){
        probability = value;
    }
    public Double getValue(){
        return probability;
    }

    public Probability negate(){
        return  new Probability(impossibility -this.getValue());
    }

    public static Probability calculate(int favorable,int outComes){
        if(favorable > outComes || favorable < certainty || outComes <= certainty) return null;
        return new Probability((double)favorable/outComes);
    }
    public static Probability create(Double prob){
        if(prob < certainty || prob > impossibility) return null;
        return new Probability(prob);
    }

    public Probability and(Probability prob) {
        return (new Probability(probability * prob.getValue()));
    }

    public Probability or(Probability prob){
        return (this.negate().and(prob.negate())).negate();
    }

}
