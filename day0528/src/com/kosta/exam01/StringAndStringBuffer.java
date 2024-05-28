package com.kosta.exam01;
import java.util.function.Consumer;
public class StringAndStringBuffer {
	public static void pro(String data) {
		System.out.println(data + "를 처리하였습니다.");
	}
    public static void main(String[] args) {
        Consumer<StringBuilder> appendCmd = cmd -> {
            cmd.append("insert ")
               .append("into ")
               .append("number ")
               .append("values (")
               .append("'tiger', ")
               .append("'010-1234-5678', ")
               .append("'서울')");
        };
        StringBuilder cmd = new StringBuilder();
        appendCmd.accept(cmd);
        System.out.println(cmd.toString());
    }
}