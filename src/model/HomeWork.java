package model;

public class HomeWork {
    private int idHomeWork;
    private int timeHomeWor1;
    private int timeHomeWor2;

    public HomeWork(int idHomeWork, int timeHomeWor1, int timeHomeWor2) {
        this.idHomeWork = idHomeWork;
        this.timeHomeWor1 = timeHomeWor1;
        this.timeHomeWor2 = timeHomeWor2;
    }

    public HomeWork() {
    }

    public int getIdHomeWork() {
        return idHomeWork;
    }

    public void setIdHomeWork(int idHomeWork) {
        this.idHomeWork = idHomeWork;
    }

    public int getTimeHomeWor1() {
        return timeHomeWor1;
    }

    public void setTimeHomeWor1(int timeHomeWor1) {
        this.timeHomeWor1 = timeHomeWor1;
    }

    public int getTimeHomeWor2() {
        return timeHomeWor2;
    }

    public void setTimeHomeWor2(int timeHomeWor2) {
        this.timeHomeWor2 = timeHomeWor2;
    }

}
