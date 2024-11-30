package controller;

public class SomaController {

    public SomaController(){
        super();
    }

    public int maior(int n1 ,int n2){
        if (n1 <= n2) {
            return n2;
        }
        return n1;
    }
    public int soma(int n1,int n2){
        int x=0;
        while(n1<n2) {
            n1++;
            if (n1 % 2 != 0) {
                x += n1;
            }

        }
        while(n2<n1){
            n2++;
            if(n2%2!=0){
                x+=n2;
            }

        }
        return x;

    }
}
