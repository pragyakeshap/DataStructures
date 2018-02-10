package com.mylearnings.codility;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Bosses {
    ArrayList<Employee> ppl_list = new ArrayList<>();

    Hashtable<String,ArrayList<Employee>> graph = new Hashtable<>();

    public static void main(String[] args) {
        Bosses aBosses = new Bosses();
        aBosses.read();

    }

    ArrayList<Employee> read(){
            int caseNum=1;
                    System.out.println("case #"+caseNum);
                    caseNum++;
                    String[] currList1 = "Fred,Karl,Technician,2010--Karl,Cathy,VP,2009--Cathy,NULL,CEO,2007".split("--");
                    graph = new Hashtable<>();
                    for(String curr: currList1){
                        String[] currList = curr.split(",");
                        int iter=0;
                        Employee temp=new Employee(currList[iter],currList[iter+1],currList[iter+2],Integer.parseInt(currList[iter+3]));
                        ppl_list.add(temp);
                        String boss = currList[iter+1];
                        if(graph.containsKey(boss)) {
                            graph.get(boss).add(temp);
                            graph.put(boss,graph.get(boss));
                        }
                        else{
                            ArrayList<Employee> aValue = new ArrayList<>();
                            aValue.add(temp);
                            graph.put(boss,aValue);
                        }
                    }
                    DFS_caller(graph);

               // }
               
           // }

        /*} catch(IOException e){
            e.printStackTrace();
        }*/
        return null;
    }

    private void DFS_caller(Hashtable<String, ArrayList<Employee>> graph) {
        ArrayList<Employee> visited = new ArrayList<>();
        DFS("NULL", visited,0);

    }

    public static String repeat(String s, int n) {
        return Stream.generate(() -> s).limit(n).collect(Collectors.joining(""));
    }

    private void DFS(String person, ArrayList<Employee> visited, int level) {
        ArrayList<Employee> ppl = new ArrayList<>();
        if(graph.containsKey(person)) {
            ppl = graph.get(person);

            for (Employee p : ppl) {
                if (!visited.contains(p)) {
                 
                    	System.out.println(repeat("-", level) + p.name + " (" + p.title + ") " + p.year);;
                 
                    visited.add(p);
                    DFS(p.name, visited, level + 1);
                }
            }
        }

    }
}


class Employee{
    String name;
    String boss;
    String title;
    int year;

    public Employee(String name, String boss, String title, int year){
        this.name = name;
        this.boss =boss;
        this.title = title;
        this.year = year;
    }

   public boolean equals(Object obj){
        if (obj instanceof Employee){
            Employee temp1 = (Employee) obj;
            return this.name.equals(temp1.name) &&
                    this.boss.equals(temp1.boss) &&
                    this.title.equals(temp1.title) &&
                    this.year == temp1.year;
        }
        return false;
    }
   
   public String toString(){
       return this.name+" "+this.boss+" "+this.title+" "+this.year;
   }



}
