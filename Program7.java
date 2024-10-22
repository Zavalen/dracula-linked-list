/*
Zava
CS2050
04/19/2024
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;


public class Program7 {
    public static void main(String[] args) {
        int liq = 17;
        String fileName = "dracula.txt";
        Node[] alphaList = new Node[26];
        for (int i = 25; i >= 0; i--){
            switch(i) {
                case 1 :
                    alphaList[i] = new Node("a");
                    alphaList[i].subCount();
                    break;
                case 2 :
                    alphaList[i] = new Node("b");
                    alphaList[i].subCount();
                    break;
                case 3 :
                    alphaList[i] = new Node("c");
                    alphaList[i].subCount();
                    break;
                case 4 :
                    alphaList[i] = new Node("d");
                    alphaList[i].subCount();
                    break;
                case 5 :
                    alphaList[i] = new Node("e");
                    alphaList[i].subCount();
                    break;
                case 6 :
                    alphaList[i] = new Node("f");
                    alphaList[i].subCount();
                    break;
                case 7 :
                    alphaList[i] = new Node("g");
                    alphaList[i].subCount();
                    break;
                case 8 :
                    alphaList[i] = new Node("h");
                    alphaList[i].subCount();
                    break;
                case 9 :
                    alphaList[i] = new Node("i");
                    alphaList[i].subCount();
                    break;
                case 10 :
                    alphaList[i] = new Node("j");
                    alphaList[i].subCount();
                    break;
                case 11 :
                    alphaList[i] = new Node("k");
                    alphaList[i].subCount();
                    break;
                case 12 :
                    alphaList[i] = new Node("l");
                    alphaList[i].subCount();
                    break;
                case 13 :
                    alphaList[i] = new Node("m");
                    alphaList[i].subCount();
                    break;
                case 14 :
                    alphaList[i] = new Node("n");
                    alphaList[i].subCount();
                    break;
                case 15 :
                    alphaList[i] = new Node("o");
                    alphaList[i].subCount();
                    break;
                case 16 :
                    alphaList[i] = new Node("p");
                    alphaList[i].subCount();
                    break;
                case 17 :
                    alphaList[i] = new Node("q");
                    alphaList[i].subCount();
                    break;
                case 18 :
                    alphaList[i] = new Node("r");
                    alphaList[i].subCount();
                    break;
                case 19 :
                    alphaList[i] = new Node("s");
                    alphaList[i].subCount();
                    break;
                case 20 :
                    alphaList[i] = new Node("t");
                    alphaList[i].subCount();
                    break;
                case 21 :
                    alphaList[i] = new Node("u");
                    alphaList[i].subCount();
                    break;
                case 22 :
                    alphaList[i] = new Node("v");
                    alphaList[i].subCount();
                    break;
                case 23 :
                    alphaList[i] = new Node("w");
                    alphaList[i].subCount();
                    break;
                case 24 :
                    alphaList[i] = new Node("x");
                    alphaList[i].subCount();
                    break;
                case 25 :
                    alphaList[i] = new Node("y");
                    alphaList[i].subCount();
                    break;
                case 0 :
                    alphaList[i] = new Node("z");
                    alphaList[i].subCount();
                    break;
            }

        }
        String line;

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while((line = br.readLine()) != null) {
                String[] sentence = clean(line).split("\\s+");

                for (int i = sentence.length - 1; i >= 0; i--) {
                    if(!sentence[i].isEmpty()) {
                        char firstLetter = sentence[i].charAt(0);
                        switch (firstLetter) {

                            case 'a':
                                readNodes(alphaList[1], sentence[i]);
                                break;
                            case 'b':
                                readNodes(alphaList[2], sentence[i]);
                                break;
                            case 'c':
                                readNodes(alphaList[3], sentence[i]);
                                break;
                            case 'd':
                                readNodes(alphaList[4], sentence[i]);
                                break;
                            case 'e':
                                readNodes(alphaList[5], sentence[i]);
                                break;
                            case 'f':
                                readNodes(alphaList[6], sentence[i]);
                                break;
                            case 'g':
                                readNodes(alphaList[7], sentence[i]);
                                break;
                            case 'h':
                                readNodes(alphaList[8], sentence[i]);
                                break;
                            case 'i':
                                readNodes(alphaList[9], sentence[i]);
                                break;
                            case 'j':
                                readNodes(alphaList[10], sentence[i]);
                                break;
                            case 'k':
                                readNodes(alphaList[11], sentence[i]);
                                break;
                            case 'l':
                                readNodes(alphaList[12], sentence[i]);
                                break;
                            case 'm':
                                readNodes(alphaList[13], sentence[i]);
                                break;
                            case 'n':
                                readNodes(alphaList[14], sentence[i]);
                                break;
                            case 'o':
                                readNodes(alphaList[15], sentence[i]);
                                break;
                            case 'p':
                                readNodes(alphaList[16], sentence[i]);
                                break;
                            case 'q':
                                readNodes(alphaList[17], sentence[i]);
                                break;
                            case 'r':
                                readNodes(alphaList[18], sentence[i]);
                                break;
                            case 's':
                                readNodes(alphaList[19], sentence[i]);
                                break;
                            case 't':
                                readNodes(alphaList[20], sentence[i]);
                                break;
                            case 'u':
                                readNodes(alphaList[21], sentence[i]);
                                break;
                            case 'v':
                                readNodes(alphaList[22], sentence[i]);
                                break;
                            case 'w':
                                readNodes(alphaList[23], sentence[i]);
                                break;
                            case 'x':
                                readNodes(alphaList[24], sentence[i]);
                                break;
                            case 'y':
                                readNodes(alphaList[25], sentence[i]);
                                break;
                            case 'z':
                                readNodes(alphaList[0], sentence[i]);
                                break;
                        }
                    }
                }
            }
            br.close();

        }
        catch(IOException e) {
            e.printStackTrace();
            System.out.print("Unable to read/write files");
        }
        pOut();
        sortWord(alphaList, liq);
        sortCount(alphaList, liq);

    }

    static String clean(String line) {
        line = line.replaceAll("[^a-zA-Z'-]"," ");
        line = line.toLowerCase();
        line = line.trim();
        return(line);
    }

    static void readNodes(Node alphaList, String elWord) {
        boolean found = false;
        Node currNode = alphaList;
        Node prevNode = null;
        while (currNode != null) {

            // why doesn't == work when comparing these two strings??
            if (Objects.equals(currNode.getWord(), elWord)) {
                currNode.addCount();
                found = true;
                break;
            }
            else {
                prevNode = currNode;
                currNode = currNode.getNext();
            }

        }
        if (!found) {
            prevNode.setNext(new Node(elWord));
        }

    }

    static void sortWord(Node[] alphaList, int letter) {
        ArrayList<Node> listStrings= new ArrayList<>();
        Node readNode = alphaList[letter];
        while (readNode != null) {
            listStrings.add(readNode);
            readNode = readNode.getNext();

        }
        Collections.sort(listStrings, Node.NodeWordComparator);
        try {
            FileWriter fw = new FileWriter("Wordsort.txt");
            fw.write(String.format("Zava\nCS2050\n\n"));


            for(int j = 0; j < listStrings.size(); j++) {
                fw.write(listStrings.get(j) + System.lineSeparator());

            }
            fw.close();
        }
        catch(IOException e) {
            System.out.println("Trouble trying to write to Program2.out");
            e.printStackTrace();
        }

    }
    static void sortCount(Node[] alphaList, int letter) {
        ArrayList<Node> listCounts= new ArrayList<>();
        Node readNode = alphaList[letter];
        while (readNode != null) {
            listCounts.add(readNode);
            readNode = readNode.getNext();

        }
        Collections.sort(listCounts, Node.wordCountComparator);
        try {
            FileWriter fw = new FileWriter("Wordcount.txt");
            fw.write(String.format("Zava\nCS2050\n\n"));


            for(int j = 0; j < listCounts.size(); j++) {
                fw.write(listCounts.get(j) + System.lineSeparator());

            }
            fw.close();
        }
        catch(IOException e) {
            System.out.println("Trouble trying to write to Program2.out");
            e.printStackTrace();
        }
    }
    static void pOut() {
        try {
            File fWordsort = new File("Wordsort.txt");
            File fWordcount = new File("Wordcount.txt");
            if (fWordsort.createNewFile() && fWordcount.createNewFile()) {
                System.out.println("Created the files");
            }
            else if (fWordsort.createNewFile() && !fWordcount.createNewFile()){
                System.out.println("Already have existing files");
                fWordcount.delete();
                fWordcount.createNewFile();
                System.out.println("Created a new file: Program2.out");
            }
            else if (!fWordsort.createNewFile() && fWordcount.createNewFile()) {
                fWordsort.delete();
                fWordsort.createNewFile();
            }
            else {
                fWordsort.delete();
                fWordsort.createNewFile();
                fWordcount.delete();
                fWordcount.createNewFile();
            }

        }

        catch(IOException e) {
            System.out.println("Error in creating/deleting the file");
        }

    }
}
