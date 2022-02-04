package assignments._01_primitive_types._03_expressions_and_assignment_statements._07_add_fractions;

public class AddFractions {
    public static void main(String[] args) {
        int numeratorOne = 1;
        int denominatorOne = 4;
        int numeratorTwo = 4;
        int denominatorTwo = 6;

        System.out.print("The numerator of the first fraction is " + numeratorOne + "\n");
        System.out.print("The denominator of the first fraction is " + denominatorOne + "\n");
        System.out.print("The numerator of the second fraction is " + numeratorTwo + "\n");
        System.out.print("The denominator of the second fraction is " + denominatorTwo + "\n");

        StringBuilder sb = new StringBuilder();

        sb.append("The sum of ");
        sb.append(numeratorOne);
        sb.append("/");
        sb.append(denominatorOne);
        sb.append(" + ");
        sb.append(numeratorTwo);
        sb.append("/");
        sb.append(denominatorTwo);
        sb.append(" = ");
        sb.append((numeratorOne * denominatorTwo) + (numeratorTwo * denominatorOne));
        sb.append("/");
        sb.append(denominatorOne * denominatorTwo);

        System.out.println(sb);
    }
}
