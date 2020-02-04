package chapter05;

public abstract class Instrument {
    private String serialNumber;
    private int price;
    private InstrumentSpec spec;

    public Instrument(String serialNumber, int price, InstrumentSpec spec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = spec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public InstrumentSpec getSpec() {
        return spec;
    }

    public void setSpec(InstrumentSpec spec) {
        this.spec = spec;
    }
}
