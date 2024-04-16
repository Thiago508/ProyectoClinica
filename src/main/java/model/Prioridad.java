package model;

public enum Prioridad {

    ALTA(0),
    BAJA(1);

    private int value;
    private Prioridad (int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
