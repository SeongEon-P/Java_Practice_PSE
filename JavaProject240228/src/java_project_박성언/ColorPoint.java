package java_project_박성언;

public class ColorPoint extends Point {// 이게 Point 클래스로부터 상속 받았다는 뜻

	private String color; // ColorPoint 클래스의 멤버 변수를 선언하는 코드입니다.

    public ColorPoint(int x, int y, String color) {
        super(x, y); // 상위 클래스 생성자 가져오는거
        this.color = color; //생성자에서 매개변수로 전달된 값을 클래스의 멤버 변수에 할당하는 역할을 합니다. 이는 객체의 초기화를 위해 사용됩니다.
    }

     public String getColor() {
        return color;
    }

    public void show() {
        System.out.println(getColor() + "색으로 (" + getX() + ", " + getY() + ")");
    }

    public void setPoint(int x, int y) {
        move(x, y);
    }
    
    public void setColor(String color) { // 색상 바뀐거 할당함
        this.color = color;
    }

    public static void main(String[] args) {
        ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
        cp.setPoint(10, 20);
        cp.setColor("GREEN");
        cp.show();
    }
}
