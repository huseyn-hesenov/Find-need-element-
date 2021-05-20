import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        PrintMessages printMessage=new PrintMessages();
        printMessage.printArrayCount();
        int elementCount=scanner.nextInt();
        float [] massiv=new float[elementCount];
        printMessage.printElements();
        for (int i=0;i<massiv.length;i++){
            Scanner sc=new Scanner(System.in);
            float elements=sc.nextFloat();
            massiv[i]=elements;
        }
        for (int j=0;j<massiv.length;j++){
            if (massiv[j]<=2.5){
                System.out.println(massiv[j]);
                break;
            }
            else {
                printMessage.printNotFound();
                break;
            }
        }
    }
}
