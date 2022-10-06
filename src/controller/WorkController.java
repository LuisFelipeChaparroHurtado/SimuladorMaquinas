package controller;

import model.HomeWork;
import model.Work;

import java.util.ArrayList;
import java.util.List;

public class WorkController {

    private List<Work> workList;

    public WorkController() {
        workList= new ArrayList<Work>();
    }

    public List<Work> getWorkList() {
        return workList;
    }

    public void setWorkList(List<Work> workList) {
        this.workList = workList;
    }

    public void listWork(){
        workList.add(new Work(1,"W1",new HomeWork(1,30,50),true,false));
        workList.add(new Work(2,"W2",new HomeWork(2,0,40),true,false));
        workList.add(new Work(3,"W3",new HomeWork(3,20,70),true,false));
        workList.add(new Work(4,"W4",new HomeWork(4,30,0),true,false));
        workList.add(new Work(5,"W5",new HomeWork(5,50,20),true,false));
    }

}
