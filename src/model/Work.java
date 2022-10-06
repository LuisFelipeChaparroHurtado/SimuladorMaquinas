package model;

public class Work {
    private int idWork;
    private String nameWork;
    private HomeWork homeWork;
    private Boolean state;
    private Boolean stateM2;

    public Work(int idWork, String nameWork, HomeWork homeWork, Boolean state, Boolean stateM2) {
        this.idWork = idWork;
        this.nameWork = nameWork;
        this.homeWork = homeWork;
        this.state=state;
        this.stateM2=stateM2;
    }

    public Work() {
    }

    public int getIdWork() {
        return idWork;
    }

    public void setIdWork(int idWork) {
        this.idWork = idWork;
    }

    public String getNameWork() {
        return nameWork;
    }

    public void setNameWork(String nameWork) {
        this.nameWork = nameWork;
    }

    public HomeWork getHomeWork() {
        return homeWork;
    }

    public void setHomeWork(HomeWork homeWork) {
        this.homeWork = homeWork;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public Boolean getStateM2() {
        return stateM2;
    }

    public void setStateM2(Boolean stateM2) {
        this.stateM2 = stateM2;
    }
}
