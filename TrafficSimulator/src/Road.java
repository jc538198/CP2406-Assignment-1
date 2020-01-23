import java.awt.*;
import java.util.ArrayList;

public class Road {
    //The coordinates of the path
    static Point A = new Point(290, 100);
    static Point B = new Point(290, 175);
    static Point D = new Point(50, 190);
    static Point H = new Point(290, 550);
    static Point E = new Point(50, 235);
    static Point F = new Point(275, 235);
    static Point T = new Point(1265, 550);
    static Point O = new Point(1265, 100);
    static Point R = new Point(1250, 235);
    static Point a = new Point(1550, 190);
    static Point b = new Point(1550, 235);
    static Point W = new Point(1325, 190);
    static Point U = new Point(1310, 100);
    static Point Q = new Point(1250, 190);
    static Point K = new Point(350, 190);
    static Point G = new Point(290, 250);
    static Point J = new Point(335, 175);
    static Point I = new Point(335, 100);
    static Point N = new Point(335, 550);
    static Point M = new Point(335, 250);
    static Point L = new Point(350, 235);
    static Point V = new Point(1310, 175);
    static Point R1 = new Point(290, 190);
    static Point R2 = new Point(290, 235);
    static Point R3 = new Point(335, 235);
    static Point R6 = new Point(1265, 235);
    static Point R8 = new Point(1310, 190);
    static Point Z = new Point(1310, 550);
    static Point Y = new Point(1310, 250);
    static Point R7 = new Point(1310, 235);
    static Point R4 = new Point(335, 190);
    static Point R5 = new Point(1265, 190);
    static Point P = new Point(1265, 175);
    static Point C = new Point(275, 190);
    ArrayList<Point> RoadList = new ArrayList<Point>();

    public Road(int begin, int end) {
        choose(begin, end);
    }
    //According to the starting point and the ending point, a road to be taken by a car is generated.
    public ArrayList<Point> choose(int begin, int end) {

        if (begin == 1 && end == 2) {
            RoadList.add(A); // A
            RoadList.add(R1); // R1
            RoadList.add(D); // D
        }

        else if(begin == 1 && end == 3) {
            RoadList.add(A); //A
            RoadList.add(B); //B
            RoadList.add(H); //H
        }

        else if(begin == 1 && end == 4) {
            RoadList.add(A); //A
            RoadList.add(R1); //R1
            RoadList.add(D); //D
            RoadList.add(E); //E
            RoadList.add(F); //F
            RoadList.add(R6); //R6
            RoadList.add(T); //T
        }

        else if(begin == 1 && end == 5) {
            RoadList.add(A); //A
            RoadList.add(R1); //R1
            RoadList.add(D); //D
            RoadList.add(E); //E
            RoadList.add(F); //F
            RoadList.add(R); //R
            RoadList.add(b); //b
        }

        else if(begin == 1 && end == 6) {
            RoadList.add(A); //A
            RoadList.add(R1); //R1
            RoadList.add(D); //D
            RoadList.add(E); //E
            RoadList.add(F); //F
            RoadList.add(R); //R
            RoadList.add(b); //b
            RoadList.add(a); //a
            RoadList.add(W); //W
            RoadList.add(R8); //R8
            RoadList.add(U); //U
        }

        else if(begin == 2 && end == 1) {
            RoadList.add(E); //E
            RoadList.add(F); //F
            RoadList.add(R); //R
            RoadList.add(Q); //Q
            RoadList.add(R4); //R4
            RoadList.add(I); //I
        }

        else if(begin == 2 && end == 3) {
            RoadList.add(E); //E
            RoadList.add(R2); //R2
            RoadList.add(H); //H
        }

        else if(begin == 2 && end == 4) {
            RoadList.add(E); //E
            RoadList.add(F); //F
            RoadList.add(R6); //R6
            RoadList.add(T); //T
        }

        else if(begin == 2 && end == 5) {
            RoadList.add(E); //E
            RoadList.add(F); //F
            RoadList.add(R); //R
            RoadList.add(b); //b
        }

        else if(begin == 2 && end == 6) {
            RoadList.add(E); //E
            RoadList.add(F); //F
            RoadList.add(R); //R
            RoadList.add(b); //b
            RoadList.add(a); //a
            RoadList.add(W); //W
            RoadList.add(R8); //R8
            RoadList.add(U); //U
        }

        else if(begin == 3 && end == 1) {
            RoadList.add(N); //N
            RoadList.add(M); //M
            RoadList.add(I); //I
        }

        else if(begin == 3 && end == 2) {
            RoadList.add(N); //N
            RoadList.add(R3); //R3
            RoadList.add(R); //R
            RoadList.add(Q); //Q
            RoadList.add(K); //K
            RoadList.add(D); //D
        }

        else if(begin == 3 && end == 4) {
            RoadList.add(N); //N
            RoadList.add(R3); //R3
            RoadList.add(R6); //R6
            RoadList.add(T); //T
        }

        else if(begin == 3 && end == 5) {
            RoadList.add(N); //N
            RoadList.add(R3); //R3
            RoadList.add(R); //R
            RoadList.add(b); //b
        }

        else if(begin == 3 && end == 6) {
            RoadList.add(N); //N
            RoadList.add(R3); //R3
            RoadList.add(R); //R
            RoadList.add(b); //b
            RoadList.add(a); //a
            RoadList.add(R8); //R8
            RoadList.add(U); //U
        }
        //TBS-BSN
        else if(begin == 4 && end == 1) {
            RoadList.add(Z); //Z
            RoadList.add(R7); //R7
            RoadList.add(b); //b
            RoadList.add(a); //a
            RoadList.add(W); //W
            RoadList.add(R4); //R4
            RoadList.add(I); //I
        }

        //TBS-EHW
        else if(begin == 4 && end == 2) {
            RoadList.add(Z); //Z
            RoadList.add(R7); //R7
            RoadList.add(b); //b
            RoadList.add(a); //a
            RoadList.add(W); //W
            RoadList.add(K); //K
            RoadList.add(D); //D
        }

        //TBS-BSS
        else if(begin == 4 && end == 3) {
            RoadList.add(Z); //Z
            RoadList.add(R7); //R7
            RoadList.add(b); //b
            RoadList.add(a); //a
            RoadList.add(W); //W
            RoadList.add(K); //K
            RoadList.add(D); //D
            RoadList.add(E); //E
            RoadList.add(R2); //R2
            RoadList.add(H); //H
        }

        else if(begin == 4 && end == 5) {
            RoadList.add(Z); //Z
            RoadList.add(R7); //R7
            RoadList.add(b); //b
        }

        else if(begin == 4 && end == 6) {
            RoadList.add(Z); //Z
            RoadList.add(Y); //Y
            RoadList.add(U); //U
        }

        else if(begin == 5 && end == 1) {
            RoadList.add(a); //a
            RoadList.add(W); //W
            RoadList.add(K); //K
            RoadList.add(R4); //R4
            RoadList.add(I); //I
        }

        else if(begin == 5 && end == 2) {
            RoadList.add(a); //a
            RoadList.add(W); //W
            RoadList.add(K); //K
            RoadList.add(D); //D
        }

        else if(begin == 5 && end == 3) {
            RoadList.add(a); //a
            RoadList.add(W); //W
            RoadList.add(K); //K
            RoadList.add(D); //D
            RoadList.add(E); //E
            RoadList.add(R2); //R2
            RoadList.add(H); //H
        }

        else if(begin == 5 && end == 4) {
            RoadList.add(a); //a
            RoadList.add(W); //W
            RoadList.add(K); //K
            RoadList.add(L); //L
            RoadList.add(R6); //R6
            RoadList.add(T); //T
        }


        else if(begin == 5 && end == 6) {
            RoadList.add(a); //a
            RoadList.add(R8); //R8
            RoadList.add(U); //U
        }


        else if(begin == 6 && end == 1) {
            RoadList.add(O); //O
            RoadList.add(R5); //R5
            RoadList.add(R4); //R4
            RoadList.add(I);//I
        }


        else if(begin == 6 && end == 2) {
            RoadList.add(O); //O
            RoadList.add(R5); //R5
            RoadList.add(K); //K
            RoadList.add(D);//D
        }


        else if(begin == 6 && end == 3) {
            RoadList.add(O); //O
            RoadList.add(R5); //R5
            RoadList.add(K); //K
            RoadList.add(D);//D
            RoadList.add(E); //E
            RoadList.add(R2); //R2
            RoadList.add(H); //H
        }


        else if(begin == 6 && end == 4) {
            RoadList.add(O); //O
            RoadList.add(P); //P
            RoadList.add(T); //T
        }


        else if(begin == 6 && end == 5) {
            RoadList.add(O); //O
            RoadList.add(R5); //R5
            RoadList.add(K); //K
            RoadList.add(L); //L
            RoadList.add(R); //R
            RoadList.add(b); //b
        }
        //return a path
        return (ArrayList<Point>) RoadList;
    }
}