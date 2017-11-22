package ld.study.facade;

public class Computer {
    private CPU cpu;
    private Disk disk;
    private Memory memory;

    public Computer() {
        cpu = new CPU();
        memory = new Memory();
        disk = new Disk();
    }

    public void startUp(){
        System.out.println("start the computer!");
        cpu.startUp();
        memory.startUp();
        disk.startUp();
        System.out.println("start computer finished!");
    }

    public void shotDown(){
        System.out.println("shotDown the computer!");
        cpu.shotDown();
        memory.shotDown();
        disk.shotDown();
        System.out.println("shotDown computer finished!");

    }
}
