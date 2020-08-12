package org.homework.shenyilin.array;

import java.util.ArrayList;

public class MyArrayList  {
    private int elementSize;
    String[] elementData;
    public MyArrayList(){
        elementSize=0;
        this.elementData=new String[1];
    }
    public int size(){
        return elementSize;

    }
    public boolean add(String a){
        elementSize++;
        if (elementSize==1) {
            elementData[0]=a;
        }
        else{

            String[] temp=new String[elementSize];
            System.arraycopy(elementData,0,temp,0,elementSize-1);
            temp[elementSize-1]=a;
            elementData=temp;

        }
        return true;
    }
    public int containOf(String tem){
        for(int i=0;i<elementSize;i++){
            if (elementData[i].equals(tem)){
                return i;
            }
        }
        return -1;
    }
}
