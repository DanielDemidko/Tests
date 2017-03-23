import java.io.*;

class Main {
    public static void main(String[] args) {
        try(final BufferedReader input=new BufferedReader(new InputStreamReader(System.in));){
            System.out.print(">>> ");
            System.out.println(input.readLine());
        } catch (final IOException error) {
            System.out.println(error.getMessage());
        }
    }
}
