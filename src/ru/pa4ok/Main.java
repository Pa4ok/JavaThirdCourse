package ru.pa4ok;

public class Main
{
    public static void main(String[] args)
    {
        Builder builder = new Builder("вася");
        System.out.println(builder.getRandInt());
    }

    //все те же правила наследования работают и для интрефейсов
    //мы можем проверять на принадлежность
    //можем делать приведение типов
    public static void test(Object o)
    {
        if(o instanceof IWorker) {
            ((IWorker)o).work();
        }

        if(o instanceof ISleeper) {
            ISleeper sleeper = (ISleeper)o;
            sleeper.sleep();
        }

        if(o instanceof Builder) {
            Builder builder = (Builder) o;
            builder.work();
            builder.sleep();
        }
    }
}
