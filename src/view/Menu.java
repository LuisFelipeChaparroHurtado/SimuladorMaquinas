package view;

import controller.MachineController;
import controller.WorkController;
import model.Machine;

public class Menu {

    public static void main(String[] args) {
        WorkController work = new WorkController();
        work.listWork();
        MachineController machine = new MachineController();

        Machine machine1=new Machine(1,"M1", work.getWorkList());
        Machine machine2=new Machine(2,"M2", work.getWorkList());
        machine1.start();
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        machine2.start();

    }
}

