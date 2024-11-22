package com.factoriaf5.rps.models;

public class Spock implements Form{
    @Override
    public int action(){
        return 5;
    }

    @Override
    public boolean compete(Form form){
        if((form.action() == 4) || (form.action() == 3)){
            return false;
        }
        return true;
    }
}
