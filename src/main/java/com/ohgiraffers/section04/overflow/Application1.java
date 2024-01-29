package com.ohgiraffers.section04.overflow;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. 오버플로우에 대해 이해할 수 있다. */
        /* 필기.
        *   자료형 별 값의 최대 범위를 벗어나는 경우
        * */

        /* 목차 1. 오버플로우 */
        byte num1 = 127;

        System.out.println("num1 : " + num1);   // 127 : byte의 최대 저장 범위

        num1++; // 1 증가

        System.out.println("num1 : " + num1);    // -128 : byte의 최소 저장 범위

        /* 목차 2. 언더플로우 */
        byte num2 = -128;

        System.out.println("num2 : " + num2);   // -128 : byte의 최소 저장 범위

        num2--; // 1 감소

        System.out.println("num2 : " + num2);   // 127 : byte의 최대 저장 범위

        // int형의 최대값은 대략 21억 정도이다.
        // 이 범위를 벗어난 계산능 오버플로우를 발생시켜 원하지 않는 결과값이 나오게 될 수 있다.
        int firstNum = 1000000; // 100만
        int secondNum = 700000; // 70만

        int multi = firstNum * secondNum;

        System.out.println("multi : " + multi);     // -79669248

        // 해결방법
        long longMulti = firstNum * secondNum;

        System.out.println("longMulti : " + longMulti); // -79669248 => 위에서 firstNum * secondNum 값은 이미 int형으로 담겨있기 때문

        long result = (long) firstNum * secondNum;  // int형이였던 자료형을 long형으로 변환 (강제형 변환)

        System.out.println("result : " + result);   // 700000000000 => 해결완료 확인

    }
}
