package com.example;
import java.io.*;
public class App{
public static void main(String[]args){
String str1 = "hello";
String str2 = str1.concat("world");
System.out.println("original string:"+str1);
System.out.println("modified string:"+str2);
try{
	FileReader fr = new FileReader("source.txt");
	FileWriter fw = new FileWriter("destination.txt");
	int ch;
	while((ch=fr.read())!=-1){
		fw.write(ch);
		}
		fr.close();
		fw.close();
		System.out.println("file copied successfully");
		}catch(Exception e){
		System.out.println(e);
		}
		}
		}

