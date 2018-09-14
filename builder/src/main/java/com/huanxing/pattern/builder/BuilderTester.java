package com.huanxing.pattern.builder;

/**
 * @author huanxing.wu at 2018/09/14
 */
public class BuilderTester {

    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("hdd1", "ram1").errorTag(false)
            .infoTag(true).build();

        System.out.println(computer);
    }
}
