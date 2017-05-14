/**
 * Created by Dave on 5/7/17.
 */

import java.io.*;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) throws IOException {
        String line;
        String fullText = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many sentences do you want in your summary? ");
        int summaryLength = scanner.nextInt();

        System.out.println("Enter the text followed by \"###\": ");
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        do
        {
            line = bufferedReader.readLine();
            if (line.equals("###"))
                break;
            else
            fullText = fullText + line + " ";
        }
        while(!line.equals("syzygy")); // this doesn't really matter anymore I just picked a really rare word to look cool

        inputStreamReader.close();
        bufferedReader.close();
        System.out.println("________________________________________________________");

        TextSummarizer textSummarizer = new TextSummarizer(fullText);
        textSummarizer.summarize(summaryLength);
    }
}
