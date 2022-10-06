package model;

import java.util.List;

public class Machine extends Thread{

    private int idMachine;
    private String nameMachine;
    private List<Work> listWork;

    public Machine(int idMachine, String nameMachine, List<Work> listWork) {
        this.idMachine = idMachine;
        this.nameMachine = nameMachine;
        this.listWork = listWork;
    }

    public Machine() {
    }

    public int getIdMachine() {
        return idMachine;
    }

    public void setIdMachine(int idMachine) {
        this.idMachine = idMachine;
    }

    public String getNameMachine() {
        return nameMachine;
    }

    public void setNameMachine(String nameMachine) {
        this.nameMachine = nameMachine;
    }

    public List<Work> getListWork() {
        return listWork;
    }

    public void setListWork(List<Work> listWork) {
        this.listWork = listWork;
    }

    @Override
    public void run() {

        int tiempo =0,cont=0;

        for (int i = 0; i < this.getListWork().size(); i++) {

            if (this.getNameMachine()=="M1"){
                if (this.getListWork().get(i).getState()==true){
                    this.getListWork().get(i).setState(false);
                    tiempo =(this.getListWork().get(i).getHomeWork().getTimeHomeWor1());
                    imprimir(tiempo, i);
                }
            }else{
                if (this.getListWork().get(i).getState()==true){
                    if(this.getListWork().get(i).getStateM2()==false){
                        this.getListWork().get(i).setState(false);
                        tiempo =(this.getListWork().get(i).getHomeWork().getTimeHomeWor2());
                        imprimir(tiempo, i);
                        this.getListWork().get(i).setStateM2(true);
                        i=-1;
                    }else{
                        continue;
                    }


                }
            }


        }
    }

    public void imprimir(int tiempo, int i){
        if(tiempo!=0){
            System.out.print("\nMACHINE "+this.getNameMachine()+" Start "+this.getListWork().get(i).getNameWork()+" Tiempo: "+tiempo);
            try {

                tiempo = tiempo * 1000;
                Thread.sleep(tiempo);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.getListWork().get(i).setState(true);
            System.out.print("\nFinish "+this.getListWork().get(i).getNameWork()+" of the "+this.getNameMachine());

        }
        else
        {
            this.getListWork().get(i).setState(true);
        }
    }
}
