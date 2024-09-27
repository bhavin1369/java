import io.*;
import java.util.*;

public class game {
    private static final int UP = 72;
    private static final int DOWN = 80;
    private static final int LEFT = 75;
    private static final int RIGHT = 77;
    private static final int SIZE = 4;
    private static final char BORDER = '\u2593';
    private static final int ESC = 27;
    private static final int PR = 2;
    private static int[][] Matrix = new int[SIZE + 1][SIZE + 1];
    private static int score = 2048;
    private static int last = 0;

    public static void main(String[] args) {
        starting();
        StartingRandom();
        int aro;
        char Arrow = DOWN;
        while (Arrow != ESC) {
            Arrow = (char) System.in.read();
            aro = Arrow;
            Action(Arrow);
            int temp = TempCounter();
            if (temp == 1) {
                System.out.println("\n\t\t\tYOU WON");
                ending();
                break;
            }
            if (temp == 0 || score < 0) {
                System.out.println("\n\t\t\tSORRY !  GAME OVER\n");
                break;
            }
        }
        System.out.println("\n\n\n\t");
        printer("THANKS FOR PLAYING, GOOD LUCK FOR NEXT TIME ");
        waitL();
        waitL();
        waitL();
        waitL();
    }

    private static void starting() {
        for (int i = 0; i < 10; i++) {
            waitL();
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\n\n\n\t\t\tINSTRUCTION\n\n\n");
        System.out.println(" ->  Enter arrow key to move\n\n");
        System.out.println(" ->  For wining this game any one box have value 2048\n\n");
        System.out.println(" -> You have maximum 2048 try to win the game\n\n\n\n");
        System.out.println("\t\t\t\t\t\tPRESS ANY KEY TO PLAY\n");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void wait() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void waitL() {
        for (int i = 0; i < 25; i++) {
            wait();
        }
    }

    private static void printer(String s) {
        System.out.print(s);
    }

    private static void Action(char Arrow) {
        switch (Arrow) {
            case UP:
                Up();
                break;
            case DOWN:
                Down();
                break;
            case LEFT:
                Left();
                break;
            case RIGHT:
                Right();
                break;
            default:
                return;
        }
        score--;
        RandomCreater();
        Display();
    }

    private static void RandomCreater() {
        Random rand = new Random();
        int temp1 = rand.nextInt(SIZE);
        int temp2 = rand.nextInt(SIZE);
        int add = ((temp1 + temp2) % 2 == 0) ? 2 : 4;
        for (int i = 0; i < temp1; i++) {
            for (int j = temp2; j < SIZE; j++) {
                if (Matrix[i][j] == 0) {
                    Matrix[i][j] = add;
                    return;
                }
            }
        }
    }

    private static void Display() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        printEver();
        for (int i = 0; i < SIZE; i++) {
            System.out.print("\t\t\t " + BORDER);
            for (int j = 0; j < SIZE; j++) {
                if (Matrix[i][j] == 0) {
                    System.out.print("      ");
                } else {
                    System.out.printf(" %4d ", Matrix[i][j]);
                }
            }
            System.out.println(BORDER + "\n\t\t\t" + BORDER + BORDER);
        }
        System.out.println("\t\t\t " + new String(new char[SIZE * 2 + 7]).replace("\0", BORDER) + "\n\n");
    }

    private static void printEver() {
        System.out.println("\n\n\n\t\t\tTWO-ZERO-FOUR-EIGHT\n");
        System.out.printf("\t\t\t\t\t\t\t\t SCORE  : %d\n\n\n\n", score);
        System.out.println("\t\t\t " + new String(new char[SIZE * 2 + 7]).replace("\0", BORDER));
    }

    private static void ending() {
        System.out.printf("\n\n\t\t\t\tYOUR SCORE is  : %d", score);
        record();
    }

    private static void record() {
        String name1, name2;
        char cha;
        Scanner scanner = new Scanner(System.in);
        try {
            FileWriter fileWriter = new FileWriter("record.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            System.in.read();
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Enter your name");
            name1 = scanner.nextLine();
            name2 = new StringBuilder(name1.substring(0, 1).toUpperCase())
                    .append(name1.substring(1).replaceAll("(\\b\\w)", " $1").toLowerCase().trim().replaceAll(" ", "$0\u00A0"))
                    .toString();
            bufferedWriter.write("Player Name :" + name2 + "\n");
            bufferedWriter.write("Played Date:" + new Date() + "\n");
            bufferedWriter.write("Score:" + score + "\n");
            for (int i = 0; i <= 50; i++) {
                bufferedWriter.write("_");
            }
            bufferedWriter.newLine();
            bufferedWriter.close();
            System.out.println("wanna see past records press 'y'\n");
            cha = (char) System.in.read();
            System.out.print("\033[H\033[2J");
            System.out.flush();
            if (cha == 'y') {
                FileReader fileReader = new FileReader("record.txt");
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                }
                bufferedReader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\n\n\n\t\t\t\tPRESS ANY KEY TO EXIT\n");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            File file = new File("record.txt");
            file.setReadOnly();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void StartingRandom() {
        Matrix[3][1] = 8;
        Matrix[3][2] = 32;
        Matrix[3][3] = 16;
        Matrix[2][2] = 8;
        Matrix[2][3] = 8;
        Matrix[1][2] = 8;
        Display();
    }

    private static int TempCounter() {
        int temp = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (Matrix[i][j] == 2048) {
                    return 1;
                }
                if (Matrix[i][j] == 0) {
                    temp = 1;
                }
            }
        }
        if (temp == 1) {
            last = 0;
            return -99;
        } else {
            if (last == 1) {
                return 0;
            }
            last = 1;
            return -99;
        }
    }

    private static void Down() {
        for (int j = 0; j < SIZE; j++) {
            int i = 2;
            while (true) {
                while (Matrix[i][j] == 0) {
                    if (i == -1) {
                        break;
                    }
                    i--;
                }
                if (i == -1) {
                    break;
                }
                while (i < SIZE - 1 && (Matrix[i + 1][j] == 0 || Matrix[i][j] == Matrix[i + 1][j])) {
                    Matrix[i + 1][j] += Matrix[i][j];
                    Matrix[i][j] = 0;
                    i++;
                }
                i--;
            }
        }
    }

    private static void Up() {
        for (int j = 0; j < SIZE; j++) {
            int i = 1;
            while (true) {
                while (Matrix[i][j] == 0) {
                    if (i == SIZE) {
                        break;
                    }
                    i++;
                }
                if (i == SIZE) {
                    break;
                }
                while (i > 0 && (Matrix[i - 1][j] == 0 || Matrix[i][j] == Matrix[i - 1][j])) {
                    Matrix[i - 1][j] += Matrix[i][j];
                    Matrix[i][j] = 0;
                    i--;
                }
                i++;
            }
        }
    }

    private static void Right() {
        for (int i = 0; i < SIZE; i++) {
            int j = 2;
            while (true) {
                while (Matrix[i][j] == 0) {
                    if (j == -1) {
                        break;
                    }
                    j--;
                }
                if (j == -1) {
                    break;
                }
                while (j < SIZE - 1 && (Matrix[i][j + 1] == 0 || Matrix[i][j] == Matrix[i][j + 1])) {
                    Matrix[i][j + 1] += Matrix[i][j];
                    Matrix[i][j] = 0;
                    j++;
                }
                j--;
            }
        }
    }

    private static void Left() {
        for (int i = 0; i < SIZE; i++) {
            int j = 1;
            while (true) {
                while (Matrix[i][j] == 0) {
                    if (j == SIZE) {
                        break;
                    }
                    j++;
                }
                if (j == SIZE) {
                    break;
                }
                while (j > 0 && (Matrix[i][j - 1] == 0 || Matrix[i][j] == Matrix[i][j - 1])) {
                    Matrix[i][j - 1] += Matrix[i][j];
                    Matrix[i][j] = 0;
                    j--;
                }
                j++;
            }
        }
    }
}

