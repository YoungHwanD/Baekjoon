import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'c') {
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == '=') {
                        i++;
                    } else if (s.charAt(i + 1) == '-') {
                        i++;
                    }
                }
            }

            else if (c == 'd') {
                if (i <s.length() - 1) {
                    if (s.charAt(i + 1) == 'z') {
                        if (i < s.length() - 2) {
                            if (s.charAt(i + 2) == '=') {
                                i += 2;
                            }
                        }
                    } 
                    
                    else if (s.charAt(i + 1) == '-') {
                        i++;
                    }
                }
            }

            else if (c == 'l') {
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == 'j') {
                        i++;
                    }
                }
            }

            else if (c == 'n') {
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == 'j') {
                        i++;
                    }
                }
            }

            else if (c == 's') {
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            }

            if (c == 'z') {
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            }

            cnt++;
        }

        System.out.println(cnt);
    }
}
