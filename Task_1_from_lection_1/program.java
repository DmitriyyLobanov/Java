package Task_1_from_lection_1;



public class program {
    public static void main(String[] args) {
        System.out.println("Введите старшую степень многочлена: ");
        int degree = lib.getInputDegree();
        System.out.printf("degree = %d \n", degree);
        String firstPolynome = lib.createPolynome(degree);
        System.out.println(firstPolynome);

        String secondPolynome = lib.createPolynome(degree);
        System.out.println(secondPolynome);

        lib.writeFile(firstPolynome, "file_1.txt");
        lib.writeFile(secondPolynome, "file_2.txt");

        lib.parsePolynom(firstPolynome);
    }
}
