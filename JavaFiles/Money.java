package JavaFiles;

public class Money implements Comparable<Money> {
    private long dollars;
    private long cents;

    // Constructors
    public Money(double amount) {
        this.dollars = (long) amount;
        this.cents = Math.round((amount - this.dollars) * 100);
    }

    public Money(Money otherObject) {
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    // Methods
    public Money add(Money otherAmount) {
        long newCents = this.cents + otherAmount.cents;
        long newDollars = this.dollars + otherAmount.dollars;
        if (newCents >= 100) {
            newDollars++;
            newCents -= 100;
        }
        return new Money(newDollars + newCents / 100.0);
    }

    public Money subtract(Money otherAmount) {
        long newCents = this.cents - otherAmount.cents;
        long newDollars = this.dollars - otherAmount.dollars;
        if (newCents < 0) {
            newDollars--;
            newCents += 100;
        }
        return new Money(newDollars + newCents / 100.0);
    }

    public int compareTo(Money otherObject) {
        if (this.dollars != otherObject.dollars) {
            return Long.compare(this.dollars, otherObject.dollars);
        }
        return Long.compare(this.cents, otherObject.cents);
    }

    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null || getClass() != otherObject.getClass()) return false;
        Money money = (Money) otherObject;
        return dollars == money.dollars && cents == money.cents;
    }

    public String toString() {
        return String.format("$%d.%02d", dollars, cents);
    }
}