import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Cmd {

    public Path pa;
    public File file;

    public static void main(String args[]) {
        Cmd cp = new Cmd();
        Scanner in = new Scanner(System.in);
        String s = " ";
        Path home = Paths.get("C:\\Users\\1\\Documents\\NetBeansProjects\\Cmd\\src\\cmd.java");
        while (s.equals("exit") != true) {
            s = in.nextLine();
            StringTokenizer st = new StringTokenizer(s, " "); //слова в столбец
            while (st.hasMoreTokens()) {
                if (st.nextToken().equalsIgnoreCase("cd")) {
                    cp.pa = Paths.get(st.nextToken());
                    home = Paths.get(cp.pa.toUri());
                    cp.file = new File(cp.pa.toUri());
                    if (cp.file.exists()) {
                        System.out.format("%s%n", cp.pa.toUri() + " ->");
                    } else {
                        System.err.format("%s: no such" + " file or directory%n", cp.pa);
                    }
                }

                if (s.equalsIgnoreCase("ls")) {
                    cp.file.toString();
                    String files[] = cp.file.list();
                    for (int i = 0; i < files.length; i++) {
                        File f = new File(cp.pa.toString() + "/" + files[i]);
                        if (f.isDirectory()) {
                            System.out.println(files[i] + " is a directory");
                        } else {
                            System.out.println(files[i] + " is a file");
                        }
                    }
                }

                if (s.equalsIgnoreCase("ls -f")) {
                    cp.file.toString();
                    String files[] = cp.file.list();
                    for (int i = 0; i < files.length; i++) {
                        File f = new File(cp.pa.toString() + "/" + files[i]);
                        if (f.isFile()) {
                            System.out.println(files[i] + " ");
                        }
                    }
                }

                if (s.equalsIgnoreCase("ls -d")) {
                    cp.file.toString();
                    String files[] = cp.file.list();
                    for (int i = 0; i < files.length; i++) {
                        File f = new File(cp.pa.toString() + "/" + files[i]);
                        if (f.isDirectory()) {
                            System.out.println(files[i] + " ");
                        }
                    }
                }
                if (s.equalsIgnoreCase("help")) {
                    System.out.println("CD Смена текущей папки");
                    System.out.println("EXIT выход");
                    System.out.println("HELP помощь");
                    System.out.println("LS получить список файлов и директорий в текущей папке");
                }

            }
        }
    }
}
