package Files;
import java.io.*;
import java.util.*;

import Files.MathOperations;
public class Main {
    public static void main(String[] args) throws IOException {
        //1
        Scanner scanner = new Scanner(System.in);
        /*String[] filePaths = new String[2];
        for(int i = 0; i< filePaths.length;i++){
            System.out.print("Enter filepath: ");
            filePaths[i] = scanner.next();
            FileOutputStream fileOutputStream = new FileOutputStream(filePaths[i]);
            DataOutputStream outputStream = new DataOutputStream(fileOutputStream);
            System.out.print("Enter some lines:");
            String output = scanner.next();
            outputStream.writeUTF(output);
        }
        List<ArrayList> allContents = new ArrayList<>();
        for(int i = 0; i< filePaths.length;i++){
            System.out.print("Enter filepath: ");
            filePaths[i] = scanner.next();
            FileInputStream fileInputStream = new FileInputStream(filePaths[i]);
            DataInputStream inputStream = new DataInputStream(fileInputStream);
            ArrayList<String> contents = new ArrayList<>();
            while(inputStream.available()>0){
                contents.add(inputStream.readUTF());
            }
            allContents.add(contents);
        }
        ArrayList<String> firstContents = allContents.get(0);
        ArrayList<String> secondContents = allContents.get(1);
        if(firstContents.size()!= secondContents.size()) {
            System.out.println("Files have different size!");
            return;
        }
        for(int i = 0; i< firstContents.size(); i++){
            if(!(firstContents.get(i).equals(secondContents.get(i)))){
                System.out.println("Files differ! Line in file 1: ");
                System.out.println(firstContents.get(i));
                System.out.println("Line in file 2: ");
                System.out.println(secondContents.get(i));
                return;
            }
        }
        System.out.println("Files are identical");
        return;*/

        //2
        /*int maxLength = 0;
        String longest = "";
        System.out.print("Enter filepath: ");
        String filePath = scanner.next();
        List<String> lines = new ArrayList<>();
        FileInputStream fileInputStream = new FileInputStream(filePath);
        DataInputStream inputStream = new DataInputStream(fileInputStream);
        while (inputStream.available()>0){
            lines.add(inputStream.readUTF());
        }
        for(var line:lines){
            if(line.length()>maxLength){
                maxLength = line.length();
                longest = line;
            }
        }
        System.out.println("Longest line's length: "+maxLength);
        System.out.println("Longest line itself: "+longest);*/

        //3
        /*System.out.print("Enter file path: ");
        String filePath = scanner.next();
        String[] lines = new String[2];
        FileReader reader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(reader);
        for(int i = 0; i < lines.length; i++){
            lines[i] = bufferedReader.readLine();
        }
        String[] arr1 = lines[0].split(" ");
        String[] arr2 = lines[1].split(" ");
        int[] intArr1 = new int[arr1.length];
        for(int i = 0; i < arr1.length;i++)
            intArr1[i] = Integer.parseInt(arr1[i]);
        int[] intArr2 = new int[arr2.length];
        for(int i = 0; i < arr2.length;i++)
            intArr2[i] = Integer.parseInt(arr2[i]);
        System.out.print("First array: ");
        for(var elem:intArr1)
            System.out.print(elem+" ");
        System.out.println("First array's minimum: "+MathOperations.min(intArr1));
        System.out.println("First array's maximum: "+MathOperations.max(intArr1));
        System.out.println("First array's sum of elements: "+MathOperations.sum(intArr1));
        System.out.println("Second array: ");
        for(var elem:intArr2)
            System.out.print(elem+" ");
        System.out.println();
        System.out.println("Second array's minimum: "+MathOperations.min(intArr2));
        System.out.println("Second array's maximum: "+MathOperations.max(intArr2));
        System.out.println("Second array's sum of elements: "+MathOperations.sum(intArr2));
        System.out.println("Overall minimum: "
        +(MathOperations.min(intArr1)<MathOperations.min(intArr2)?MathOperations.min(intArr1):MathOperations.min(intArr2)));
        System.out.println("Overall maximum: "
        +(MathOperations.max(intArr1)>MathOperations.max(intArr2)?MathOperations.max(intArr1):MathOperations.max(intArr2)));
        System.out.println("Overall sum of elements: "+(MathOperations.sum(intArr2)+MathOperations.sum(intArr1)));*/

        //4
        /*System.out.print("Enter file path: ");
        String filePath = scanner.next();
        System.out.print("Enter how many numbers you want to write: ");
        int arraySize = scanner.nextInt();
        int[] numbers = new int[arraySize];
        for (int i = 0; i < numbers.length; i++){
            System.out.print("Enter array element: ");
            int num = scanner.nextInt();
            numbers[i] = num;
        }
        FileWriter writer = new FileWriter(filePath);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.write(Arrays.toString(numbers)+"\n");
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(var elem:numbers){
            if(elem%2==0)
                sb1.append(elem+" ");
            else
                sb2.append(elem+" ");
        }
        sb1.append("\n");
        sb2.append("\n");
        String even = sb1.toString();
        String uneven = sb2.toString();
        bufferedWriter.write(even);
        bufferedWriter.write(uneven);
        int[] tmp = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            tmp[i] = numbers[numbers.length-i-1];
        }
        bufferedWriter.write(Arrays.toString(tmp)+"\n");
        bufferedWriter.close();*/

        //5
        System.out.println("Welcome to the staff operating system! Pick your option: ");
        int option = 7;
        System.out.print("1 - input data\n" +
                "2 - edit data\n" +
                "3 - delete employee\n" +
                "4 - search by surname\n" +
                "5 - filter by age\n" +
                "6 - filter by surnames\n" +
                "7 - exit: ");
        option = scanner.nextInt();
        while(option!=7) {
            switch (option) {
                case 1:
                    System.out.print("Enter employee's surname: ");
                    String surname = scanner.next();
                    System.out.print("Enter employee's name: ");
                    int age = scanner.nextInt();
                    FileWriter writer = new FileWriter("D:/ОП/employees.txt");
                    BufferedWriter bufferedWriter = new BufferedWriter(writer);
                    bufferedWriter.write(surname + " " + age + "\n");
                    bufferedWriter.close();
                    break;
                case 2:
                    System.out.print("Enter employee's surname: ");
                    String editPattern = scanner.next();
                    System.out.print("Enter employee's new surname: ");
                    String newSurname = scanner.next();
                    System.out.print("Enter employee's new age: ");
                    String newAge = scanner.next();
                    String cLine = "";
                    FileReader fileRead = new FileReader("D:/ОП/employees.txt");
                    FileWriter fileWrite = new FileWriter("D:/ОП/employees.txt");
                    BufferedReader bufferedReader3 = new BufferedReader(fileRead);
                    BufferedWriter bufferedWriter3 = new BufferedWriter(fileWrite);
                    while((cLine = bufferedReader3.readLine()) != null&&cLine.length()!=0) {
                        String trimmedLine = cLine.trim();
                        if(trimmedLine.equals(editPattern)) {
                            bufferedWriter3.write(newSurname+" "+newAge+"\n");
                        }
                        bufferedWriter3.write(cLine + "\n");
                    }
                    bufferedWriter3.close();
                    break;
                case 3:
                    System.out.print("Enter employee's surname: ");
                    String deletePattern = scanner.next();
                    String currentLine = "";
                    FileReader fileReader = new FileReader("D:/ОП/employees.txt");
                    FileWriter fileWriter = new FileWriter("D:/ОП/employees.txt");
                    BufferedReader bufferedRead = new BufferedReader(fileReader);
                    BufferedWriter bufferedWrite = new BufferedWriter(fileWriter);
                    while((currentLine = bufferedRead.readLine()) != null&&currentLine.length()!=0) {
                        String trimmedLine = currentLine.trim();
                        if(trimmedLine.equals(deletePattern)) continue;
                        bufferedWrite.write(currentLine + "\n");
                    }
                    bufferedWrite.close();
                    break;
                case 4:
                    System.out.print("Enter surname: ");
                    String pattern = scanner.next();
                    List<String> employees = new ArrayList<>();
                    FileReader reader = new FileReader("D:/ОП/employees.txt");
                    BufferedReader bufferedReader = new BufferedReader(reader);
                    String str = "";
                    while((str=bufferedReader.readLine())!=null && str.length()!=0) {
                        employees.add(bufferedReader.readLine());
                    }
                    for(var employee:employees){
                        String[] data = employee.split(" ");
                        if(pattern.equals(data[0])){
                            System.out.println("Employee found!");
                            System.out.println("Surname: "+data[0]);
                            System.out.println("Age: "+data[1]);
                            break;
                        }
                    }
                    System.out.println("Nothing found!");
                    break;
                case 5:
                    System.out.print("Enter age: ");
                    int agePattern = scanner.nextInt();
                    List<String> employees1 = new ArrayList<>();
                    FileReader reader1 = new FileReader("D:/ОП/employees.txt");
                    BufferedReader bufferedReader1 = new BufferedReader(reader1);
                    String str1 = "";
                    while((str1=bufferedReader1.readLine())!=null && str1.length()!=0) {
                        employees1.add(bufferedReader1.readLine());
                    }
                    for(var employee:employees1){
                        String[] data = employee.split(" ");
                        if(agePattern==Integer.parseInt(data[1])){
                            System.out.println("Surname: "+data[0]);
                            System.out.println("Age: "+data[1]);
                        }
                    }
                    break;
                case 6:
                    System.out.print("Enter surname's first letter: ");
                    String temp = scanner.next();
                    char namePattern = temp.charAt(0);
                    List<String> employees2 = new ArrayList<>();
                    FileReader reader2 = new FileReader("D:/ОП/employees.txt");
                    BufferedReader bufferedReader2 = new BufferedReader(reader2);
                    String str2 = "";
                    while((str2=bufferedReader2.readLine())!=null && str2.length()!=0) {
                        employees2.add(bufferedReader2.readLine());
                    }
                    for(var employee:employees2){
                        String[] data = employee.split(" ");
                        if(namePattern==data[0].charAt(0)){
                            System.out.println("Surname: "+data[0]);
                            System.out.println("Age: "+data[1]);
                        }
                    }
                    break;
                case 7:
                    System.out.println("Thanks for using this operating system!");
                    return;
                default:
                    break;
            }
            System.out.print("1 - input data\n" +
                    "2 - edit data\n" +
                    "3 - delete employee\n" +
                    "4 - search by surname\n" +
                    "5 - filter by age\n" +
                    "6 - filter by surnames\n" +
                    "7 - exit: ");
            option = scanner.nextInt();
        }
    }
}
