import java.io.*;
public class Q6 {
public static void main(String[] args) {
try {
FileReader fr = new FileReader("abc.txt");
int i;
int wordCount = 0;
int characterCount = 0;
int sentenceCount = 0;
while ((i = fr.read()) != -1) {
characterCount++;
if ((char) i == ' ') {
wordCount++; }
if ((char) i == '.') {
sentenceCount++;
wordCount++; } }
fr.close();
System.out.println("No. of word count = " + wordCount);
System.out.println("No. of sentences = " + sentenceCount);
System.out.println("No. of characters = " +characterCount);
} 
catch (Exception e) {
}
 }
 }