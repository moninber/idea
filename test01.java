package test;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Girlfriend gf = new Girlfriend();
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                String name = sc.nextLine();
                gf.setName(name);
                String agestr = sc.nextLine();
                int age = Integer.parseInt(agestr);
                gf.setAge(age);
                break;
            } catch (NumberFormatException e) {
                System.out.println("年龄格式有误，请输入数字：");
            } catch (RuntimeException e) {
                System.out.println("姓名长度有误或年龄范围有误：");
            }
        }
        System.out.println(gf);
    }
}
