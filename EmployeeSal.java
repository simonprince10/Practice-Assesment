package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSal {
    public static void main(String[] args) {
        List<EmpSal>list= new ArrayList<EmpSal>();
        list.add(new EmpSal(1, 2000));
        list.add(new EmpSal(2, 4000));
        list.add(new EmpSal(3,4000));
        List<EmpSal> empSortedlist=list.stream().sorted((o1, o2) -> (int)(o2.getSal()-o1.getSal())).collect(Collectors.toList());
        System.out.println(empSortedlist);
    }
}
