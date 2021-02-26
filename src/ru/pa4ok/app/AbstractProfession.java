package ru.pa4ok.app;

public abstract class AbstractProfession
{
    protected String title;
    protected double payment;

    public AbstractProfession(String title, double payment) {
        this.title = title;
        this.payment = payment;
    }

    public abstract void work();

    @Override
    public String toString() {
        return "AbstractProfession{" +
                "title='" + title + '\'' +
                ", payment=" + payment +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }
}
