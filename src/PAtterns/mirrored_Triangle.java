package PAtterns;

public class mirrored_Triangle {
    public static void main(String[] args) {
        // rows(i)  Spaces(n-i)     Stars(j)
        //     *        4               1
        //    **        3               2
        //   ***         ....................
        //  ****
        // *****

        int rows=59;
        for(int i=1;i<=rows;i++){
            // print space
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            //print stars
            for(int k=0;k<i;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
