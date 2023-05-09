public class geometry extends Maths {

    public void accessingPi() {
        System.out.println(getPi());
        setPi(34f);
        System.out.println(getPi());
    }

    public float areaOfSquare(float length) {
        return length * length;
    }

    public float areaOfTriangle(float length, float breadth) {
        return length * breadth;
    }

   public void Geometry(){
        System.out.println("Constructor Called");
    }

}
