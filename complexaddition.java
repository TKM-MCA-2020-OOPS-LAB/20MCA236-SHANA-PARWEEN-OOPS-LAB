
public class complexaddition {
	double real;
    double imag;

    public complexaddition(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public static void main(String[] args) {
        complexaddition n1 = new complexaddition(5.6, 9.5),
                n2 = new complexaddition(6.2, 8.9),
                temp;

        temp = add(n1, n2);

        System.out.printf("Sum = %.1f + %.1fi", temp.real, temp.imag);
    }

    public static complexaddition add(complexaddition n1, complexaddition n2)
    {
        complexaddition temp = new complexaddition(0.0, 0.0);

        temp.real = n1.real + n2.real;
        temp.imag = n1.imag + n2.imag;

        return(temp);
    }
}
