package hu.petrik.koroop.kor;

public class Kor {
    private int x;
    private int y;
    private int r;

    public Kor(int x, int y, int r) {

        this.x = x;
        this.y = y;
        this.r = r;


    }

    public Kor(int r) {

        this.r = r;

        this.x = 0;
        this.y = 0;

    }


    public Kor() {

        int n = (int) (Math.random() * 10) + 1;

        this.x = rand(n);
        this.y = rand(n);
        this.r = (int) (Math.random() * n+1);
    }

    private int rand(int n) {
        return (int) (Math.random() * (2 * n) + 1) - n;
    }

    public double Kerulet(){
        return 2*this.r*Math.PI;
    }

    public double Terulet(){
     return this.r*this.r*2;
    }


    public double Nagykicsi(int a){
        return this.r=r*a;
    }

    @Override
    public String toString() {
        return
                "(" + x +
                "," + y +
                "," + r +
                ')';
    }



}
