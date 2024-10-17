import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private String hometown;
    private double score;

    public Student(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào thông tin học sinh: ");

        System.out.println("Nhập vào tên:");
        this.name = sc.nextLine();

        System.out.println("Nhập vào hometown: ");
        this.hometown = sc.nextLine();

        this.score = 0.0;
    };

    public  void setScore(double score){
        this.score = score;
    }

    public void plusScore(double value){
        this.score += value;
    }

    public void showInfo(){
        String rank;
        if(score < 4){
            rank = " Yếu ";
        }else if (score < 6) {
            rank = "Trung bình";
        }else if (score < 8){
            rank = "Khá";
        }else {
            rank = "Giỏi";
        }
        System.out.println(name +" : "+ rank);

    }
}
