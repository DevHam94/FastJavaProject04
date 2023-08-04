package kr.excel.resume;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ResumeView {
    private Scanner scanner;
    public ResumeView(){
        scanner = new Scanner(System.in);
    }
    public PersonInfo inputPersonInfo() {
        System.out.print("사진 파일명을 입력하세요:");
        String photo = scanner.nextLine();

        System.out.print("이름을 입력하세요:");
        String name = scanner.nextLine();

        System.out.print("이메일을 입력하세요:");
        String email = scanner.nextLine();

        System.out.print("주소을 입력하세요:");
        String address = scanner.nextLine();

        System.out.print("전화번호를 입력하세요:");
        String phoneNumber = scanner.nextLine();

        System.out.print("생년월일를 입력하세요 (예: 1990-01-01):");
        String birthDate = scanner.nextLine();

        return new PersonInfo(photo, name, email, address, phoneNumber, birthDate);
    }
    public List<Education> inputEduationList(){
        List<Education> educationList = new ArrayList<>();

        while (true) {
            System.out.println("학력 정보를 입력하세요 (종료는 q:");
            System.out.println("졸업년도 학교명 전공 졸업여부");

            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")){
                break;
            }

            String[] tokens = input.split(" ");
            if (tokens.length != 4) {
                System.out.println("잘못된 입력입니다.");
                break;
            }

            String graduationYear = tokens[0];
            String schoolName = tokens[1];
            String major = tokens[2];
            String graduationStatus = tokens[3];

            educationList.add(new Education(graduationYear, schoolName, major, graduationStatus));
        }

        return educationList;
    }
}
