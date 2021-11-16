/*
@author Jyoji Maruishi
@version 11/10/21
*/

import java.io.*;
import java.util.ArrayList;

class Main {
  static ArrayList<Person> people = new ArrayList<Person>();

  public static void main(String[] args) {

    String name = "";
    int age = 0;
    String color = "";

    try{
      FileReader file = new FileReader("data.txt");
      BufferedReader reader = new BufferedReader(file);

      while(reader.ready()){
        name = reader.readLine();
        age = Integer.parseInt(reader.readLine());
        color = reader.readLine();
      }

      reader.close();
    }

    catch (IOException e){
      System.out.println("An error occurred: " + e);
    }

    for(int i = 0; i<people.size(); i++){
      System.out.println(people.get(i).getName() + " " + people.get(i).getAge() + " " + people.get(i).getColor() + "\n");
    }
  }
}