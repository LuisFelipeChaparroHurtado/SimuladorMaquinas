package model;

public class Simulator {

    private int idSimulator;
    private String nameSimulator;
    private Machine machineSimulator;

    public Simulator(int idSimulator, String nameSimulator, Machine machineSimulator) {
        this.idSimulator = idSimulator;
        this.nameSimulator = nameSimulator;
        this.machineSimulator = machineSimulator;
    }

    public Simulator() {
    }

    public int getIdSimulator() {
        return idSimulator;
    }

    public void setIdSimulator(int idSimulator) {
        this.idSimulator = idSimulator;
    }

    public String getNameSimulator() {
        return nameSimulator;
    }

    public void setNameSimulator(String nameSimulator) {
        this.nameSimulator = nameSimulator;
    }

    public Machine getMachineSimulator() {
        return machineSimulator;
    }

    public void setMachineSimulator(Machine machineSimulator) {
        this.machineSimulator = machineSimulator;
    }
}
