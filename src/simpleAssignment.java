public class simpleAssignment {

    // acc = acceleration , Vi = initial velocity, xi = initial position

    double SimpleAssignment(double acc, int Vi, int  xi, int time ){
        return 0.5*acc*time*time + Vi*time + xi;
    }
}

class position1{
    public static void main(String[] args){
        simpleAssignment position1 = new simpleAssignment();
        double d = position1.SimpleAssignment(-9.81, 0, 0, 10);
        System.out.println(d);
    }
}