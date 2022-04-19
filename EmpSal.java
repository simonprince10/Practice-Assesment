package com.company;

public class EmpSal {
    public EmpSal(int id,long sal) {
        this.id = id;
        this.sal=sal;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    private int id;
    public long getSal() {
        return sal;
    }
    public void setSal(long sal) {
        this.sal = sal;
    }

    private long sal;
}