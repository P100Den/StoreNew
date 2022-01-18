package ru.store;

public class WarrantyService {
    public String type;
    public String guaranteePeriod;

    public WarrantyService(String type, String guaranteePeriod) {
        this.type = type;
        this.guaranteePeriod = guaranteePeriod;
    }

    public void expertise(){
    System.out.println("Была выполнена экспертиза");
}

    public void conclusion(){
    System.out.println("Было выполнено заключение");
}

    public void repair(){
    System.out.println("Проведен ремонт");
}

    public void replacementOfGood(){
    System.out.println("Товар был заменен");
}
    public void refund(){
    System.out.println("Возврат средств");
}


}
