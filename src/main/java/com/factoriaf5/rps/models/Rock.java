package com.factoriaf5.rps.models;

public class Rock implements Form{
    @Override
    public int action(){
        return 1;
    }

    @Override
    public boolean compete(Form form){
        if(form.action() == 3){
            return false;
        }
        return true;
    }
}

