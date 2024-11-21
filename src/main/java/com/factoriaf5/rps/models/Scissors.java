package com.factoriaf5.rps.models;

public class Scissors implements Form{
    @Override
    public int action(){
        return 2;
    }

    @Override
    public boolean compete(Form form){
        if(form.action() == 1){
            return false;
        }
        return true;
    }
}

