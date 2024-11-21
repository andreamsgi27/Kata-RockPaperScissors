package com.factoriaf5.rps.models;

public class Paper implements Form{
    @Override
    public int action(){
        return 3;
    }

    @Override
    public boolean compete(Form form){
        if(form.action() == 2){
            return false;
        }
        return true;
    }

}
