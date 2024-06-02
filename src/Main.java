//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String name = "Francis";
        int age = 24;
        String country = "Kenya";
        String company = "Github Inc";

        String formattedString = String.format("i am %s and i'm %d i come from %s and I work for %s",
                name,age,country,company);
        System.out.println(formattedString);
    }
}