package com.company;

public class Ship implements Runnable {

    private String name;
    private int boxes = 10;

    public Ship(String name, int boxes) {
        super();
        this.name = name;
        this.boxes = boxes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBoxes() {
        return boxes;
    }

    public void setBoxes(int boxes) {
        this.boxes = boxes;
    }

    public void run (){
        do{
            boxes -= 1;
            System.out.println("Ship " + getName()+ " has unloaded a box\n");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }while(boxes>0);

        System.out.println("_____Ship " + getName() + " has finished unloading.________\n");
    }
}