package com.huanxing.pattern.builder;

/**
 * 构造器模式
 * <p>
 * 外部属性只有getter,
 *
 * </p>
 *
 * @author huanxing.wu at 2018/09/14
 */
public class Computer {

    // 必填参数
    private String hdd;
    private String ram;
    // 可选参数
    private boolean errorTag;
    private boolean infoTag;

    public String getHdd() {
        return hdd;
    }

    public String getRam() {
        return ram;
    }

    public boolean isErrorTag() {
        return errorTag;
    }

    public boolean isInfoTag() {
        return infoTag;
    }

    private Computer(ComputerBuilder builder) {
        this.hdd = builder.hdd;
        this.ram = builder.ram;
        this.errorTag = builder.errorTag;
        this.infoTag = builder.infoTag;
    }

    @Override
    public String toString() {
        return "Computer{" +
            "hdd='" + hdd + '\'' +
            ", ram='" + ram + '\'' +
            ", errorTag=" + errorTag +
            ", infoTag=" + infoTag +
            '}';
    }

    public static class ComputerBuilder {

        private String hdd;
        private String ram;
        private boolean errorTag;
        private boolean infoTag;

        public ComputerBuilder(String hdd, String ram) {
            this.hdd = hdd;
            this.ram = ram;
        }

        public ComputerBuilder errorTag(boolean errorTag) {
            this.errorTag = errorTag;
            return this;
        }

        public ComputerBuilder infoTag(boolean infoTag) {
            this.infoTag = infoTag;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }


}
