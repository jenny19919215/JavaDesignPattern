package javadesignpattern.Decorator;

interface Dress {
    public void assemble();
}

class BasicDress implements Dress {
    public void assemble() {
        System.out.print("Basic Dress Features ");
    }
}

class DressDecorator implements Dress {
    protected Dress dress;

    public DressDecorator(Dress c) {
        this.dress = c;
    }

    public void assemble() {
        this.dress.assemble();
    }
}

class CausualDress extends DressDecorator {
    public CausualDress(Dress c) {
        super(c);
    }

    public void assemble() {
        super.assemble();
        System.out.print(" Adding Causual Dress Features ");
    }
}

class SportyDress extends DressDecorator {
    public SportyDress(Dress c) {
        super(c);
    }

    public void assemble() {
        super.assemble();
        System.out.print(" Adding Sporty Dress Features ");
    }
}

class FancyDress extends DressDecorator {
    public FancyDress(Dress c) {
        super(c);
    }

    public void assemble() {
        super.assemble();
        System.out.print(" Adding Fancy Dress Features ");
    }
}

public class DecoratorTest {

    public static void main(String[] args) {

        Dress sportyDress = new SportyDress(new BasicDress());
        sportyDress.assemble();
        System.out.println();


        Dress fancyDress = new FancyDress(new BasicDress());
        fancyDress.assemble();
        System.out.println();

        Dress casualFancyDress = new CausualDress(new FancyDress(new BasicDress()));
        casualFancyDress.assemble();
        System.out.println();

        Dress sportyFancyDress = new SportyDress(new FancyDress(new BasicDress()));
        sportyFancyDress.assemble();
        System.out.println();

    }
}