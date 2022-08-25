import java.io.*;
import java.util.Scanner;

public class baekjoon5430 {

    public static void main(String[]args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(bufferedReader.readLine());

        Boolean errors=false;
        for(int i=0;i<count;i++){
            String a= bufferedReader.readLine();
            int size = Integer.parseInt(bufferedReader.readLine());
            int ab[]=new int[size];
            String sab[]=new String[size];
            String ss = bufferedReader.readLine();

            if(ss.equals("[]") && a.contains("D")){
                bufferedWriter.write("error"+"\n");
                continue;
            }
            else if(ss.equals("[]")){
                bufferedWriter.write("[]"+"\n");
                continue;
            }
            String ass=ss.substring(1,ss.length()-1);

            String[] asbb=ass.split("\\D+");

            for(int j=0;j< asbb.length;j++){
                if(asbb[j]!=""){
                    ab[j]=Integer.parseInt(asbb[j]);
                }
            }


            String[]abc=a.split("");
            int deleteindex=0;
            int Adeleteindex=ab.length-1;
            int absize=ab.length-1;
            int Dcount=0,Rcount=0;
            Boolean y=true;
            for(int j=0;j<abc.length;j++){
                if(abc[j].equals("R")){
                    //배열뒤집기

                    if(y){
                        y=false;
                    }
                    else{
                        y=true;
                    }
                    Rcount++;
                }
                else if(abc[j].equals("D")){
                    Dcount++;
                    if(Dcount>ab.length){
                        errors=true;
                        break;
                    }
                    if(y){
                        ab[deleteindex]=0;
                        deleteindex++;
                    }
                    else{
                        ab[Adeleteindex]=0;
                        Adeleteindex--;
                    }
                }
            }
            if(errors){
                bufferedWriter.write("error"+"\n");
                errors=false;
                continue;
            }
            if(Rcount%2==0){
                int acount=0;
                for(int j=0;j<ab.length;j++){
                    if(ab[j]!=0){
                        if(acount==0){
                            bufferedWriter.write("["+ab[j]);
                        }

                        else{
                            bufferedWriter.write(","+ab[j]);
                        }
                        acount++;
                    }
                }
                if(acount==0){
                    bufferedWriter.write("[");
                    //System.out.print("[");
                }
                bufferedWriter.write("]"+"\n");

            }
            else {
                int acount=0;
                for(int j=ab.length-1;j>=0;j--){
                    if(ab[j]!=0){
                        if(acount==0){
                            bufferedWriter.write("["+ab[j]);
                        }

                        else{
                            bufferedWriter.write(","+ab[j]);
                        }
                        acount++;
                    }
                }

                if(acount==0){
                    bufferedWriter.write("[");
                }
                bufferedWriter.write("]"+"\n");
            }
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
