package org.example;

public class Desktop implements Computer {
    @Override
    public void compile() {
        System.out.println("Compiled in desktop");
    }

    private int desktopNum;
    private String type;

    public Desktop(int desktopNum, String type) {
        this.desktopNum = desktopNum;
        this.type = type;
    }

    public int getDesktopNum() {
        return desktopNum;
    }

    public void setDesktopNum(int desktopNum) {
        this.desktopNum = desktopNum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Desktop{" +
                "desktopNum=" + desktopNum +
                ", type='" + type + '\'' +
                '}';
    }
}
