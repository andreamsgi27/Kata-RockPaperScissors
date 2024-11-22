package com.factoriaf5.rps.models;

public class Lizard implements Form{
    @Override
    public int action(){
        return 4;
    }

    @Override
    public boolean compete(Form form){
        if((form.action() == 2) || (form.action() ==1)){
            return false;
        }
        return true;
    }
}
