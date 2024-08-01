package org.example.lessons._20243107;

public class MonthsClass {
    public static void main(String[] args) {
        int monthNum = 1;
        if (monthNum == 2) {
            System.out.println("28");
        } else if (monthNum == 4 || monthNum == 6 || monthNum == 9 || monthNum == 11) {
            System.out.println("30");
        } else if (monthNum == 1 || monthNum == 3 || monthNum == 5 || monthNum == 7 ||
                monthNum == 8 || monthNum == 10 || monthNum == 12) {
            System.out.println("31");
        } else {
            System.out.println("No Month");
        }

        //--------------------------------

        switch (monthNum) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30");
                break;
            case 2:
                System.out.println("28");
                break;
            default:
                System.out.println("No Month");

        }
        String month = monthNum == 2 ? "28" : monthNum == 4 || monthNum == 6 || monthNum == 9|| monthNum == 11 ? "30"
                : monthNum == 1 || monthNum == 3 || monthNum == 5|| monthNum == 7 ||
                monthNum == 8 || monthNum == 10 || monthNum == 12 ? "31" : "No Month";
        System.out.println(month);
        }
    }

