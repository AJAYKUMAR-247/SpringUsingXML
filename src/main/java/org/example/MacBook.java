package org.example;

public class MacBook implements Computer {
    @Override
    public void compile() {
        System.out.println("Compiled by macNook");
    }

    private int macId;
    private String Modal;

    public MacBook(int macId, String modal) {
        this.macId = macId;
        Modal = modal;
    }

    public int getMacId() {
        return macId;
    }

    public void setMacId(int macId) {
        this.macId = macId;
    }

    public String getModal() {
        return Modal;
    }

    public void setModal(String modal) {
        Modal = modal;
    }

    @Override
    public String toString() {
        return "MacBook{" +
                "macId=" + macId +
                ", Modal='" + Modal + '\'' +
                '}';
    }
}
